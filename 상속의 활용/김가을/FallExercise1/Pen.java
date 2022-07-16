package FallExercise1;

import java.util.Scanner;

class Pen implements Manageable
{
	String itemName;
	float mmThick;
	int price;
	
	@Override
	public void read(Scanner scan) 
	{
		itemName = scan.next();
		mmThick = scan.nextFloat();
		price = scan.nextInt();
	}
	@Override
	public void print() 
	{
		System.out.printf("%s %.1f %d\n", itemName, mmThick, price);
	}
	@Override
	public boolean matches(String kwd) 
	{
		if(itemName.contains(kwd))
			return true;
		if(kwd.equals(mmThick+""))
			return true;
		if(kwd.equals(price+""))
			return true;
		
		return false;
	}
	
}
