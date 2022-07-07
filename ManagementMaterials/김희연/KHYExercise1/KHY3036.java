import java.util.Scanner;

public class KHY3036 {
	public static int mod(int x,int y)
	{
		int tmp;
		while(y!=0)
		{
			tmp=x%y;
			x=y;
			y=tmp;
		}
		return x;
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int N;
		
		do{
			N=input.nextInt();
		}while(N<3 || N>100);
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=input.nextInt();
		}

		for(int j=1;j<N;j++)
		{
			int modresult=mod(arr[0],arr[j]);
			System.out.println(arr[0]/modresult+"/"+arr[j]/modresult);
		}
	}
}
