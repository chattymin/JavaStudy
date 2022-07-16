package KHYExercise1;
import java.util.Scanner;

public class Pen implements Manageable{
	String itemName;
	float mmThick;
	int price;
	
	public void read(Scanner scan)
	{
		itemName=scan.next();
		mmThick=scan.nextFloat();
		price=scan.nextInt();
	
	}
	
	public void print()
	{
		System.out.printf("%s %.1f %d\n", itemName,mmThick,price);
	}
	
	public boolean matches(String kwd)
	{
		if(itemName.contains(kwd))
			return true;
		if((mmThick+"").equals(kwd))
			return true;
		if((price+"").equals(kwd))
			return true;
		return false;	
	}

}
