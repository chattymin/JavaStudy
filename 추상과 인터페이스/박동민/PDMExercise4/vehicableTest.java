package AbstractAndInterface.PDMExercise4;

public class vehicableTest {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        // Taxi info
        taxi.setSpeed(-50);
        taxi.setSpeed(181);
        taxi.setSpeed(80);
        driver.drive(taxi);
        driver.stop(taxi);
        System.out.println();
        // Bus info
        bus.setSpeed(-50);
        bus.setSpeed(151);
        bus.setSpeed(80);
        driver.drive(bus);
        driver.stop(bus);
        System.out.println();
        // new obj
        driver.drive(new Taxi());
        driver.drive(new Bus());
        System.out.println();
        // new taxi obj
        Vehiclable vehiclable = driver.newCar(new Taxi());
        vehiclable.run();
        vehiclable.stop();
        System.out.println();
        // new bus obj
        vehiclable = driver.newCar(new Bus());
        vehiclable.run();
        vehiclable.stop();
    }
}
