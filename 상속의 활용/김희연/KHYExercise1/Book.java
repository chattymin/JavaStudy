package KHYExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Book implements Manageable {
	String title;
	String pub;
	String isbn;
	int year;
	ArrayList<String>authors;
	int price;

	public void read(Scanner scan)
	{
		title=scan.next();
		pub=scan.next();
		isbn=scan.next();
		year=scan.nextInt();
		authors=new ArrayList<>();
		while(true)
		{
			String author=scan.next();
			if(!author.equals("0"))		
			{
				authors.add(author);
			}
			else
			{
				break;
			}
		}
		price=scan.nextInt();
	}
	void printBookType()
	{
		System.out.print("[일반책]");
	}
	
	public void print()
	{
		printBookType();
		System.out.printf("%s (%s/%s/%d년) [%d원] 저자:", title,pub,isbn,year,price);
		for(String author:authors)
		{
			System.out.print(author+" ");
		}
		System.out.println();
	}
	
	public boolean matches(String kwd)
	{
		if(title.contains(kwd))
			return true;
		if(pub.contains(kwd))
			return true;
		if(isbn.equals(kwd))
			return true;
		if((year+"").equals(kwd))
			return true;
		for(String author:authors)
		{
			if(author.equals(kwd))
				return true;
		}
		if ((price+"").equals(kwd))
			return true;
		
		return false;	
	}
}

class EBook extends Book implements Manageable{
	String url;
	String format;

	public void read(Scanner scan)
	{
		super.read(scan);
		url=scan.next();
		format=scan.next();
	
	}
	void printBookType()
	{
		System.out.print("[전자책]");
	}
	
	public void print()
	{
		super.print();
		System.out.printf("%s[%s]\n", url,format);
	}
	
	public boolean matches(String kwd)
	{
		if(super.matches(kwd))
			return true;
		if(url.contains(kwd))
			return true;
		if(format.equals(kwd))
			return true;
		return false;	
	}
	
	
}

class AppendixBook extends Book implements Manageable{
	int count;
	ArrayList<String>Appendixtitles;
	
	public void read(Scanner scan)
	{
		super.read(scan);
		count=scan.nextInt();
		Appendixtitles=new ArrayList<>(count);
		while(Appendixtitles.size()!=count)
		{
			Appendixtitles.add(scan.next());
		}
	}
	void printBookType()
	{
		System.out.print("[부록책]");
	}
	
	public void print()
	{
		super.print();
		System.out.printf("별책:%d권\n",count);
		for(String Appendixtitle:Appendixtitles)
		{
			System.out.printf("%s ",Appendixtitle);
		}
		System.out.println();
	}
	
	public boolean matches(String kwd)
	{
		if(super.matches(kwd))
			return true;
		if((count+"").equals(kwd))
			return true;
				
	    for(String Appendixtitle:Appendixtitles)
		{
	    	if(Appendixtitles.contains(kwd))
				return true;
		}
		return false;	
	}
}
