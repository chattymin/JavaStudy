package FallExercise3;

abstract public class Car 
{
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	final public void run()
	{
		start();
		drive();
		stop();
		turnoff();
		System.out.println("===================");
	}
}
