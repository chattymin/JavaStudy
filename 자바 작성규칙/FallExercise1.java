import java.util.ArrayList;
import java.util.Scanner;

class Item
{
   Scanner in = new Scanner(System.in);
   
   String Code = new String(); //å �ڵ�
   String Name = new String(); //å �̸�
   int num; //å ����
   static int count = 1;
   
   int Input()
   {
      Code = in.next();
      if(Code.equals("0")) //0�̸� ����
      {
         return 1;
      }
      Name = in.next();
      num = in.nextInt();
      
      return 0;
   }
   void print()
   {
      System.out.printf("%2d) [%s] %-12s\t %5d��\n", count, Code, Name, num);
      count++;
   }
}
class Main
{
   ArrayList<Item> list = new ArrayList<Item>();
   
   void run()
   {  
      while(true)
      {
    	 Item item = new Item();
         if(item.Input() == 1)
         {
            break;
         }
         list.add(item);
      }
      
      for(Item it : list)
      {
         it.print();
      }
   }
}

public class FallExercise1 {
	
	public static void main(String[] args) 
	{
		 Main my = new Main();
		 my.run();
	}

}
