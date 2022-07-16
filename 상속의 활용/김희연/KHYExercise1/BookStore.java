package KHYExercise1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class BookStore {
	Scanner scan=new Scanner(System.in);
	ArrayList<Manageable> sellList=new ArrayList<>();
	
	void run()
	{
		
		readAll("book4.txt");
		printAll();
		search();
	}

	Scanner openFile(String filename)
	{
		Scanner filein=null;
		try {
			filein=new Scanner(new File(filename));
		}catch(Exception e)
		{
			System.out.printf("파일오픈실패:%s\n",filename);
			System.exit(0);
		}
		return filein;
	}
	
	void readAll(String filename)
	{
		Scanner filein=openFile(filename);
		
		Manageable item=null;
		
		while(filein.hasNext())
		{
			int type=filein.nextInt();
			switch(type)
			{
			case 1:
				item=new Book();
				break;
			case 2:
				item=new EBook();
				break;
			case 3:
				item=new AppendixBook();
				break;
			case 4:
				item=new Pen();
				break;
			case 5:
				item=new Tissue();
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
		for(Manageable m:sellList)
			m.print();
	}
	
	void search() {
		
		while(true)
		{
			String kwd=null;
			System.out.print(">>");
			kwd=scan.nextLine();
			
			if(kwd.length()==0)
			{
				break;
			}	
			
			for(Manageable b:sellList)
			{
				if("일반책".equals(kwd))
				{
					if(b instanceof Book && !(b instanceof EBook)&& !(b instanceof AppendixBook))
					{
						b.print();
					}
				}
				else if("전자책".equals(kwd))
				{
					if(b instanceof EBook)
					{
						b.print();
					}
				}
				else if("부록책".equals(kwd))
				{
					if(b instanceof AppendixBook)
					{
							b.print();
					}
				}
				else if(b.matches(kwd))
				{
					b.print();
				}				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore my = new BookStore();
		my.run();
	}
}