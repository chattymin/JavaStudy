//���� �ڵ� ������ ���ʴ�� 500,100 ���
//call-by

public class Java100_method_ExamStatic3 {

	int a;
	public static void sum(Java100_method_ExamStatic3 n)
	{
		n.a+=400;
		System.out.println(n.a);
	}
	public static void main(String[] args) {
		
		Java100_method_ExamStatic3 n=new Java100_method_ExamStatic3();//��ü ����
		n.a=100; //Java100_method_ExamStatic3Ŭ������ n��ü ���� a=100 
		n.sum(n); //n��ü �̿��� �޼��� ȣ��. �μ��� Ŭ���� ��ü. 
		System.out.println(n.a);

	}

}
