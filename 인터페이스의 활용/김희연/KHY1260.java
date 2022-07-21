import java.util.Scanner;
import java.util.LinkedList;

public class KHY1260 {
    Scanner input=new Scanner(System.in);
    
    int N,M,V;
    int [][]arr;
    LinkedList<Integer>queue=new LinkedList<>();
    boolean []visited;
    
    void run() 
    {
        do {
        	N=input.nextInt();
        	M=input.nextInt();
        	V=input.nextInt();
        }while((N<1 || N>1000)&&(M<1 || M>10000)&&(V<1 || V>N)); 
        arr=new int[N+1][N+1];
        visited=new boolean[N+1];
        
        for(int i=0;i<M;i++)
        {
        	int u=input.nextInt();
        	int w=input.nextInt();
        	arr[u][w]=arr[w][u]=1;
        }
       
        DFS(V);
        System.out.println();
        visited=new boolean[N+1]; 
        BFS(V);
    }
    
    void DFS(int start)
    {
    	visited[start]=true;
    	System.out.print(start+" ");
    	for(int i=0;i<=N;i++)
    		if(arr[start][i]==1 && visited[i]!=true)
    		{
    			DFS(i);
    		}
    }
    
    void BFS(int start)
    {
    	queue.add(start);
        visited[start]=true;
    	
    	while(queue.isEmpty()!=true)
    	{
    		start=queue.poll();
    		System.out.print(start+" ");
    		for(int i=1;i<=N;i++)
    		{
    			if(visited[i]!=true && arr[start][i]==1)
    			{
    				queue.add(i);
    				visited[i]=true;
    			}
    		}
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KHY1260 my=new KHY1260();
        my.run();

	}

}