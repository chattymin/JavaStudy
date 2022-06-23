package KHYExercise4;

public class VehicableTest{
	public static void main(String[]args) {
		
		Driver driver=new Driver();
		Bus bus=new Bus();
		Taxi taxi=new Taxi();
		
		taxi.setSpeed(-50);
		taxi.setSpeed(181);
		taxi.setSpeed(80);
		driver.drive(bus);
		driver.stop(bus);
		System.out.println();
		
		bus.setSpeed(-50);
		bus.setSpeed(151);
		bus.setSpeed(80);
		driver.drive(bus);
		driver.stop(bus);
		System.out.println();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
		System.out.println();
		
		Vehiclable vehiclable = driver.newCar(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		System.out.println();
		
		vehiclable=driver.newCar(new Bus());
		vehiclable.run();
		vehiclable.stop();

	}

}