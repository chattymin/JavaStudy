import java.util.ArrayList;


class Person
{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class KHYExercise3 {

	public static void main(String[] args) {
		Person[]p1=new Person[10];
		for(int i=0;i<p1.length;i++)
		{	
			p1[i]=new Person(""+i,20+i);
		}
		System.out.println("1.============================================");
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i].getName()+"번 후보자 -----> 나이:"+p1[i].getAge());
		}
		System.out.println("2.============================================");
		ArrayList<Person>p2=new ArrayList<Person>();
		for(int i=0;i<10;i++)
		{
			p2.add(new Person(""+i,20+i));
		}
		for(Person p:p2)
			System.out.println(p.getName()+"번 후보자 -----> 나이:"+p.getAge());
			
	}
}