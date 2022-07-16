package FallExercise1;

import java.util.ArrayList;
import java.util.Scanner;

class AppendixBook extends Book
{
	int count;
	ArrayList<String> Appendixtitle = new ArrayList<String>();
	@Override
	public void read(Scanner scan) 
	{
		super.read(scan);
		count = scan.nextInt();
		for(int i=0; i<count; i++)
		{
			Appendixtitle.add(scan.next());
		}
	}
	@Override
	void printBookType() 
	{
		System.out.print("[부록책] ");
	}
	@Override
	public void print() 
	{
		super.print();
		System.out.print("별책 : ");
		for(String list : Appendixtitle)
		{
			System.out.printf("%s ", list);
		}
		System.out.println("");
	}
	@Override
	public boolean matches(String kwd) 
	{
		if(super.matches(kwd))
			return true;
		if(kwd.equals(count+""))
			return true;
		for(String list : Appendixtitle)
		{
			if(list.contains(kwd))
				return true;
		}
		return false;
	}
}
