class ClassTest_1
{
	private String name;
	private int salary;
	
	public ClassTest_1() {}
	
	public ClassTest_1(String n,int s) {
		name=n;
		salary=s;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public void getInformation() {
		System.out.print("�̸�:"+name+" ����:"+salary);
		
	}
	public void prn() {
		System.out.println("����Ŭ����");
	}	
}

class ClassTest_2 extends ClassTest_1
{
	String department;
	public ClassTest_2(String name,int salary,String department)
	{
		super(name,salary);
		this.department=department;
	}
	
	public void getInformation() {
		super.getInformation();
		System.out.println(" �μ�:"+department);
	}
	public void prn() {
		System.out.println("����Ŭ����");
	}	
	
	public void callSuperThis() {
		super.prn();
		prn();
	}
	
}
public class KHYExercise4 {

	public static void main(String[] args) {
		ClassTest_2 ct=new ClassTest_2("������",3000,"������");
		ct.callSuperThis();
		ct.getInformation();
	}

}