//기존 코드 구현시 차례대로 500,100 출력
//call-by

public class Java100_method_ExamStatic3 {

	int a;
	public static void sum(Java100_method_ExamStatic3 n)
	{
		n.a+=400;
		System.out.println(n.a);
	}
	public static void main(String[] args) {
		
		Java100_method_ExamStatic3 n=new Java100_method_ExamStatic3();//객체 생성
		n.a=100; //Java100_method_ExamStatic3클래스의 n객체 변수 a=100 
		n.sum(n); //n객체 이용해 메서드 호출. 인수는 클래스 객체. 
		System.out.println(n.a);

	}

}
