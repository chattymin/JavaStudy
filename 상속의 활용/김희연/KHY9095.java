import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class KHY9095 {

    Scanner input=new Scanner(System.in);
    int []dp=new int[11];
    
    public void run()
    {
    	int N;
        dp[0]=1;
        dp[1]=2;
        dp[2]=4;
        int i=3;
        while(i<10)
        {
        	 dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        	 i++;
        }
         
        do {
        	N=input.nextInt();
        }while(N<0 && N>11);
        
        int [] result=new int[N];
        int j=0;
        while(j<N)
        {
        	result[j]=input.nextInt();
        	j++;
        }
        for(int num:result)
        {
        	System.out.println(dp[num-1]);
        }
    }
    public static void main(String[] args) {
        KHY9095 my=new KHY9095();
        my.run();
    }
}
