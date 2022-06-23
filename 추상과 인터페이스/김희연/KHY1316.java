import java.util.Scanner;

public class KHY1316 {
    public static void main(String[] args) {
        int Wnum;
        String w;
        int count=0;
        
        Scanner input=new Scanner(System.in);
        
        do {
        	Wnum=input.nextInt();
        }while(Wnum<=0||Wnum>100);
            
        for(int i=0;i<Wnum;i++)
        {   
        	boolean[]eng=new boolean[26];
            w=input.next();
            for(int j=0; j<w.length();j++)
            {
                if(eng[w.charAt(j)-97]==true && j>0 && w.charAt(j-1)!=w.charAt(j))
                {
                    break;
                }
                else if(eng[w.charAt(j)-97]==false)
                {
                    eng[w.charAt(j)-97]=true;
                }
                
                if(j==w.length()-1)
                {count++;}
            }
        }
        System.out.println(count);
    }

}