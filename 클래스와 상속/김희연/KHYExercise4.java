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
		System.out.print("이름:"+name+" 연봉:"+salary);
		
	}
	public void prn() {
		System.out.println("수퍼클래스");
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
		System.out.println(" 부서:"+department);
	}
	public void prn() {
		System.out.println("서브클래스");
	}	
	
	public void callSuperThis() {
		super.prn();
		prn();
	}
	
}
public class KHYExercise4 {

	public static void main(String[] args) {
		ClassTest_2 ct=new ClassTest_2("이지나",3000,"교육부");
		ct.callSuperThis();
		ct.getInformation();
	}

}