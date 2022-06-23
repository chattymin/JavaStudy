package KHYExercise4;

public class Driver {
	public Vehiclable newCar(Vehiclable vehiclable) 
	{
		return vehiclable;
	}
	public void drive(Vehiclable vehiclable) 
	{
		vehiclable.run();
	}
	
	public void stop(Vehiclable vehiclable) 
	{
		vehiclable.stop();
	}
	
}