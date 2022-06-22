package AbstractAndInterface.Exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<Car>();
        list.add(new Sonata());
        list.add(new Grandeur());
        list.add(new Avante());
        list.add(new Genesis());

        for(Car car : list){
            car.run();
        }
    }
}
