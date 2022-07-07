import java.util.Scanner;

public class Fall1463 
{
	static int recur(int num, int count)
	{
		if(num != 1)
		{
			if(num%3==0)
			{
				return recur(num/3, count+1);
			}
			else if(num%2==0)
			{
				return recur(num/2, count+1);
			}
			else
			{
				return recur(num-1, count+1);
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(recur(num, 0));

	}

}
