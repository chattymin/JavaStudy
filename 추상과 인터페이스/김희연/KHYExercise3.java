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
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	public void drive()
	{
		System.out.println("Sonata 달립니다.");
	}
	public void stop()
	{
		System.out.println("Sonata 멈춥니다.");
	}
	public void turnoff()
	{
		System.out.println("Sonata 시동을 끕니다.");
	}
}
class Avate extends Car
{
	public void start()
	{
		System.out.println("Avate 시동을 켭니다.");
	}
	
	public void drive()
	{
		System.out.println("Avate 달립니다.");
	}
	public void stop()
	{
		System.out.println("Avate 멈춥니다.");
	}
	public void turnoff()
	{
		System.out.println("Avate 시동을 끕니다.");
	}
	
}
class Gradeur extends Car
{
	public void start()
	{
		System.out.println("Gradeur 시동을 켭니다.");
	}
	
	public void drive()
	{
		System.out.println("Gradeur 달립니다.");
	}
	public void stop()
	{
		System.out.println("Gradeur 멈춥니다.");
	}
	public void turnoff()
	{
		System.out.println("Gradeur 시동을 끕니다.");
	}
	
	
}
class Genesis extends Car
{
	public void start()
	{
		System.out.println("Genesis 시동을 켭니다.");
	}
	
	public void drive()
	{
		System.out.println("Genesis 달립니다.");
	}
	public void stop()
	{
		System.out.println("Genesis 멈춥니다.");
	}
	public void turnoff()
	{
		System.out.println("Genesis 시동을 끕니다.");
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