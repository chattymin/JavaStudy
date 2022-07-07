import java.util.Scanner;

public class Fall3036 
{
	static int gcd(int a, int b) //�ִ����� ���ϴ� �Լ�
	{
		int tem1, tem2; //��ȯ�� ���
		
		if(a<b) //a�� ū ���� �־���
		{
			tem1 = a;
			a = b;
			b = tem1;
		}
		
		while(b!=0)
		{
			tem2 = a%b; //������ ����
			a = b;
			b = tem2;
		}
		
		return a; //�ִ�����
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt(); //���� ����
		
		int Ring1 = in.nextInt(); //ù��° ��, 
		for(int i=1; i<num; i++)
		{
			int otherRing = in.nextInt();
			
			int GCD = gcd(Ring1, otherRing);
			System.out.println(Ring1/GCD+"/"+otherRing/GCD);
		}

	}

}
