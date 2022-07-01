package KHYExercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
	
		ArrayList<Item>items;
		Scanner input=new Scanner(System.in);
		
		public void run()
		{
			addProduct();
			showProduct();
		}

		public ItemList() {
			items=new ArrayList<Item>();
		}
		
		public void addProduct()
		{	
			int price;
			String number;
			String name;
			
			while(true)
			{
				number=input.next();
				if(number.length()==1 && Integer.parseInt(number)==0)
				{
					break;
				}
				name=input.next();
				price=input.nextInt();
				items.add(new Item(number,name,price));
			}
		}
		
		public void showProduct()
		{
			int i=1;
			for(Item product:items)
			{
				System.out.printf("%2d)[%5s]%-20s%4d¿ø\n",i,product.number,product.name,product.price);
				i++;
			}
		}
}
