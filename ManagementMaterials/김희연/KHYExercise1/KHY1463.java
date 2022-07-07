import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KHY1463 {
	static int[]dp;

	public static int recursive(int x)
	{	
		if(dp[x]==0 && x!=0 && x!=1)
		{
			if(x%6==0)
			{
				dp[x]=Math.min(Math.min(recursive(x/3),recursive(x/2)),recursive(x-1))+1;
			}
			else if(x%3==0)
			{
				dp[x]=Math.min(recursive(x/3),recursive(x-1))+1;
			}
			else if(x%2==0)
			{
				dp[x]=Math.min(recursive(x/2),recursive(x-1))+1;
			}
			else
			{
				dp[x]=recursive(x-1)+1;
			}
		}
	
		return dp[x];
		
	}
	public static void main(String[] args)throws IOException{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int x;
		do {
			x=Integer.parseInt(input.readLine());
		}while(x<1 || x>1000000);
		dp=new int[x+1];
		System.out.println(recursive(x));	

	}
}
