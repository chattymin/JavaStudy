package KHYExercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<Item>items=new ArrayList<>();
	Scanner input=new Scanner(System.in);
	
	public void run()
	{
		while(true)
		{
			Item item=new Item();
			item.setNumber(input.next());
			if(item.getNumber().equals("0"))
			{
				break;
			}
			item.setName(input.next());
			item.setPrice(input.nextInt());
			items.add(item);
		}
		
		for(Item item:items)
		{
			item.getProduct();
		}
	}

	public static void main(String[] args) {
		Main productlist=new Main();
		productlist.run();
	}
}