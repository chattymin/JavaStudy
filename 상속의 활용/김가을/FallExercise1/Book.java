package FallExercise1;

import java.util.ArrayList;
import java.util.Scanner;

class Book implements Manageable
{
	String title;
	String pub;
	String isbn;
	int year;
	ArrayList<String> authors;
	int price;
	
	public void read(Scanner scan)
	{
		title = scan.next();
		pub = scan.next();
		isbn = scan.next();
		year = scan.nextInt();
		
		authors = new ArrayList<String>();
		while(true)
		{
			String name = scan.next();
			if(name.equals("0"))
			{
				break;
			}
			authors.add(name);
		}
		price = scan.nextInt();
		
	}
	void printBookType()
	{
		System.out.print("[일반책] ");
	}
	public void print()
	{
		printBookType();
		System.out.printf("%s (%s/%s/%d년) [%d원] 저자:", title, pub, isbn, year, price);
		for(String list : authors)
			System.out.print(list+" ");
		System.out.println("");
	}
	public boolean matches(String kwd)
	{
		if(title.contains(kwd))
			return true;
		if(pub.contains(kwd))
			return true;
		if(title.contains(kwd))
			return true;
		if(kwd.equals(year+""))
			return true;
		if(kwd.equals(price))
			return true;
		for(String list : authors)
		{
			if(authors.equals(kwd))
				return true;
		}
		return false;
	}
}
