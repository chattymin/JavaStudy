package AbstractAndInterface.PDMExercise4;

public class Driver {
    public void drive(Vehiclable vehiclable){
        vehiclable.run();
    }

    public void stop(Vehiclable vehiclable){
        vehiclable.stop();
    }

    public Vehiclable newCar(Vehiclable vehiclable){
        if(vehiclable instanceof Taxi){
            Taxi taxi = (Taxi)vehiclable;
            return taxi;
        }
        else if(vehiclable instanceof Bus){
            Bus bus = (Bus)vehiclable;
            return bus;
        }

        return null;
    }

}
