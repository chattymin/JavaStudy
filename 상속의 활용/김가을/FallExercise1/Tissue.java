package FallExercise1;

import java.util.Scanner;

class Tissue implements Manageable
{
	String tissueName;
	int nSheets;
	int price;
	
	@Override
	public void read(Scanner scan) 
	{
		tissueName = scan.next();
		nSheets = scan.nextInt();
		price = scan.nextInt();
	}
	@Override
	public void print() 
	{	
		System.out.printf("%s %d %d\n", tissueName, nSheets, price);
	}
	@Override
	public boolean matches(String kwd) 
	{
		if(tissueName.contains(kwd)) 
			return true;
		if(kwd.equals(nSheets+""))
			return true;
		if(kwd.equals(price+""))
			return true;
		
		return false;
	}	
}
