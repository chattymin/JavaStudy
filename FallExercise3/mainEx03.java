package FallExercise3;

import java.util.ArrayList;

public class mainEx03 {

	public static void main(String[] args) 
	{
		ArrayList<Car> c = new ArrayList<Car>();
		
		c.add(new Sonata());
		c.add(new Grandeur());
		c.add(new Avante());
		c.add(new Genesis());
		
		for(Car list : c)
			list.run();
		
	}

}
