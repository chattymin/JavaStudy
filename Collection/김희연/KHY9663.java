import java.util.Arrays;
import java.util.Scanner;

public class KHY9663 {
    int N;
    int arr[];
    int count=0;
    
    void run()
    {
        Scanner input=new Scanner(System.in);
      
        do{
        	N=input.nextInt();
        }while(N<0 || N>15);
        
        arr=new int[N];
        dfs(0);
        
        System.out.println(count);
    }

    void dfs(int depth)
    {
    	if(depth==N)
    	{
    		count++;
    		return;
    	}
    	
    	for(int i=0;i<N;i++)
    	{
    		arr[depth]=i; 
    		if(check(depth))
    		{
    			dfs(depth+1);
    		}
    	}
    }
    
    boolean check(int col)
    {
    	for(int i=0;i<col;i++)
    	{
    		if(arr[col]==arr[i]) 
    		{
    			return false;
    		}
    		else if(Math.abs(arr[col]-arr[i])==Math.abs(i-col))
    		{
    			return false;
    		}
    	}
    	return true;
    }
   
    public static void main(String[] args) {
        KHY9663 my=new KHY9663();
        my.run();
    }
}
