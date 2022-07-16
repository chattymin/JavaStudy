package KHYExercise1;
import java.util.Scanner;

public class Tissue implements Manageable {
	String tissueName;
	float nSheets;
	int price;
	
	public void read(Scanner scan)
	{
		tissueName=scan.next();
		nSheets=scan.nextFloat();
		price=scan.nextInt();
	}
	
	public void print()
	{
		System.out.printf("%s %.1f %d\n", tissueName,nSheets,price);
	}
	
	public boolean matches(String kwd)
	{
		if(tissueName.contains(kwd))
			return true;
		if((nSheets+"").equals(kwd))
			return true;
		if((price+"").equals(kwd))
			return true;
		return false;
		
	}
}
