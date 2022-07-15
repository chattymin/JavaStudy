
import java.util.Scanner;

class DP
{
	Scanner in = new Scanner(System.in);
	
	public void formula()
	{
		int arr[] = new int[11];
		int T = in.nextInt();
		
		arr[0] = 0; //0
		arr[1] = 1; //1
		arr[2] = 2; //1+1, 2
		arr[3] = 4; //1+1+1, 1+2, 2+1, 3
		
		for(int i=0; i<T; i++)
		{
			int  n = in.nextInt();
			
			for(int j=4; j <= n; j++)
			{
				arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
			}
			System.out.print(arr[n]+" ");
		}
		
	}
}
public class Fall9095 {

	public static void main(String[] args) 
	{
		DP d = new DP();
		d.formula();
	}
}
