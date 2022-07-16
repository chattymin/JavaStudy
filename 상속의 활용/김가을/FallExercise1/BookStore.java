package FallExercise1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> sellList = new ArrayList<Manageable>();
	
	void run()
	{
		readAll("book4.txt");
		printAll();
		search();
	}
	void readAll(String filename)
	{
		Scanner filein = openFile(filename);
		Manageable item = null;
		while(filein.hasNext())
		{
			int n = filein.nextInt();
			switch(n)
			{
			case 1: 
				item = new Book();
				break;
			case 2:
				item = new EBook();
				break;
			case 3:
				item = new AppendixBook();
				break;
			case 4:
				item = new Pen();
				break;
			case 5:
				item = new Tissue();
				break;
			default:
					break;
			}
			item.read(filein);
			sellList.add(item);
		}
		filein.close();	
	}
	void printAll()
	{
		for(Manageable m : sellList)
			m.print();
	}
	void search()
	{
		String kwd = null;
		while(true)
		{
			System.out.print(">> ");
			kwd = scan.next();
			
			if(kwd.equals("0"))
			{
				break;
			}
			for(Manageable list : sellList)
			{
				if(kwd.equals("일반책"))
				{
					if(list instanceof Book && !(list instanceof AppendixBook) && !(list instanceof EBook))
					{
						list.print();
					}
				}
				if(kwd.equals("부록책"))
				{
					if(list instanceof AppendixBook)
					{
						list.print();
					}
					
				}
				if(kwd.equals("전자책"))
				{
					if(list instanceof EBook)
					{
						list.print();
					}
				}
				if(list.matches(kwd))
				{
                   			list.print();
				}
			}
		}
	}
          
	Scanner openFile(String filename)
	{
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} 
		catch (Exception e) {
			System.out.printf("파일 오픈 실패: %s\n", filename);
			System.exit(0);
		}
		return filein;
	}
	
	public static void main(String[] args)
	{
		BookStore store = new BookStore();
		store.run();
	}
}
