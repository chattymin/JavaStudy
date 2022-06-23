import java.util.ArrayList;

abstract class Car
{
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		System.out.println("================");	
	}
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
}
	
class Sonata extends Car
{
	public void start()
	{
		System.out.println("Sonata �õ��� �մϴ�.");
	}
	
	public void drive()
	{
		System.out.println("Sonata �޸��ϴ�.");
	}
	public void stop()
	{
		System.out.println("Sonata ����ϴ�.");
	}
	public void turnoff()
	{
		System.out.println("Sonata �õ��� ���ϴ�.");
	}
}
class Avate extends Car
{
	public void start()
	{
		System.out.println("Avate �õ��� �մϴ�.");
	}
	
	public void drive()
	{
		System.out.println("Avate �޸��ϴ�.");
	}
	public void stop()
	{
		System.out.println("Avate ����ϴ�.");
	}
	public void turnoff()
	{
		System.out.println("Avate �õ��� ���ϴ�.");
	}
	
}
class Gradeur extends Car
{
	public void start()
	{
		System.out.println("Gradeur �õ��� �մϴ�.");
	}
	
	public void drive()
	{
		System.out.println("Gradeur �޸��ϴ�.");
	}
	public void stop()
	{
		System.out.println("Gradeur ����ϴ�.");
	}
	public void turnoff()
	{
		System.out.println("Gradeur �õ��� ���ϴ�.");
	}
	
	
}
class Genesis extends Car
{
	public void start()
	{
		System.out.println("Genesis �õ��� �մϴ�.");
	}
	
	public void drive()
	{
		System.out.println("Genesis �޸��ϴ�.");
	}
	public void stop()
	{
		System.out.println("Genesis ����ϴ�.");
	}
	public void turnoff()
	{
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
	
	
}
	
	
public class KHYExercise3 {

	public static void main(String[] args) {
		ArrayList<Car> c=new ArrayList<>();
		
		c.add(new Sonata());
		c.add(new Avate());
		c.add(new Gradeur());
		c.add(new Genesis());
		
		for(Car car : c)
			car.run();
	}
}