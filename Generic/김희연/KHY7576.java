import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

class Node2
{
	int i;
	int j;
	
	Node2(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
}

public class KHY7576 {
	Scanner input=new Scanner(System.in);
	LinkedList<Node2>queue=new LinkedList<>();
	ArrayList<Node2>nodecheck=new ArrayList<>();
    int []n= {-1,1,0,0};
    int []m= {0,0,-1,1};
    
    int N,M,day=0;
	
	void run()
	{
		do
		{
			N=input.nextInt();
			M=input.nextInt();
		}while(N>1000 || M<2);
		
		int [][]tomato=new int[M][N];
	
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{	
				tomato[i][j]=input.nextInt();
				if(tomato[i][j]==1)
				{
					nodecheck.add(new Node2(i,j));
				}
			}
		}	
		if((Arrays.asList(tomato).contains(1) || Arrays.asList(tomato).contains(-1)) && Arrays.asList(tomato).contains(0)==false)
		{
			System.out.println(0);
			System.exit(0);
		}
		
		day=BFS(tomato);
		
		if(Arrays.asList(tomato).contains(0)==true)
		{
			System.out.println(-1);
			return;
		}
		System.out.println(day-1);
	}				
		
	int BFS(int[][]tomato)
	{
		for(Node2 node:nodecheck)
		{
			queue.add(node);
		}
		
		while(queue.isEmpty()!=true)
    	{
			int node_size=queue.size();
			while(node_size!=0)
			{
				Node2 node=queue.poll();
				node_size--;

				for(int i=0;i<4;i++)
				{
					int row=node.i+n[i];
					int col=node.j+m[i];
				
					if(row<M && row>=0 && col<N && col>=0 && tomato[row][col]==0)
					{
						queue.add(new Node2(row,col));
						
						tomato[row][col]=1;	
					}	
				}
			}
			day++;
		}
		return day;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KHY7576 my=new KHY7576();
		my.run();
	}
}
