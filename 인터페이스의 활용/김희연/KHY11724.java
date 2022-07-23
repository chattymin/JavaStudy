import java.util.Scanner;

public class KHY11724 {
    Scanner input=new Scanner(System.in);
    
    int N,M,u,w;
    int [][]arr;
    int count=0;
    boolean visited[];
    
    void run() 
    {
        do {
        	N=input.nextInt();
        	M=input.nextInt();
        }while((N<1 || N>1000)&&(M<0 || M>(N*((N-1)/2)))); 
        arr=new int[N+1][N+1];
        visited=new boolean[N+1];
        
        for(int i=0;i<M;i++)
        {
        	do {
        	u=input.nextInt();
        	w=input.nextInt();
        	}while((u<1||w>N)&&(u!=w));
        	arr[u][w]=arr[u][w]=1;
        }
       

        for(int i=1;i<=N;i++)
        {
        	if(visited[i]!=true)
        	{
        		DFS(i);
        		count++;
        	}        		
        }
        System.out.println(count);
    }
    
    void DFS(int start)
    {
    	visited[start]=true;
    
    	for(int i=0;i<=N;i++)
    	{
    		if((arr[start][i]==1||arr[i][start]==1) && visited[i]!=true)
    		{
    			DFS(i);
    		}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KHY11724 my=new KHY11724();
                my.run();
	}
}
