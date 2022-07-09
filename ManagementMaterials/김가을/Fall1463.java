import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Fall1463 
{
	static int recur(int num, int count)
	{
		/*while(num != 1)
		{
			if(num%3==0)
			{
				return Math.min(recur(num/3, count+1), recur(num-1, count+1));
			}
			else if(num%2==0)
			{
				return Math.min(recur(num/2, count+1), recur(num-1, count+1));
			}
			else
				return recur(num-1, count+1);
		}*/
		if(num<2)
			return count;
		
		return Math.min(recur(num/2, count+1+(num%2)), recur(num/3, count+1+(num%3)));
	}
	public static void main(String[] args) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		//int num = in.nextInt();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		System.out.println(recur(num, 0));
	}
}
