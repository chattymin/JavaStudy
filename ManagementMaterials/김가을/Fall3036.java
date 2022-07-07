import java.util.Scanner;

public class Fall3036 
{
	static int gcd(int a, int b) //최대공약수 구하는 함수
	{
		int tem1, tem2; //교환에 사용
		
		if(a<b) //a에 큰 값을 넣어줌
		{
			tem1 = a;
			a = b;
			b = tem1;
		}
		
		while(b!=0)
		{
			tem2 = a%b; //나머지 저장
			a = b;
			b = tem2;
		}
		
		return a; //최대공약수
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt(); //링의 개수
		
		int Ring1 = in.nextInt(); //첫번째 링, 
		for(int i=1; i<num; i++)
		{
			int otherRing = in.nextInt();
			
			int GCD = gcd(Ring1, otherRing);
			System.out.println(Ring1/GCD+"/"+otherRing/GCD);
		}

	}

}
