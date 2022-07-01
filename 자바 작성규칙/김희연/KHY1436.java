import java.util.Scanner;
public class KHY1436 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int MovieCount;
		int num=666;
		int count=1;
		do
		{
			MovieCount=input.nextInt();
		}while(MovieCount>10000 && MovieCount<0);
		
		while(MovieCount!=count)
		{
			num++;
			if(String.valueOf(num).contains("666"))
			{
				count++;
			}
		}
		
		System.out.println(num);
	}

}
