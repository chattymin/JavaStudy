package KHYExercise1;

public class Item{
	String number=new String();
	String name=new String();
	int price;
	static int count=1;
	public Item() {
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if(number.equals("0"))
		{
			this.number="0";
		}
		else
		{
			this.number = number;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public void getProduct()
	{
		if(getName().length()<8)
		{
			System.out.printf("%2d)[%s]%-12s\t\t%5d¿ø\n",count,getNumber(),getName(),getPrice());
		}
		else
		{
			System.out.printf("%2d)[%s]%-12s\t%5d¿ø\n",count,getNumber(),getName(),getPrice());
		}
		count++;
	}
}
