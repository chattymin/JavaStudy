import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

class Node
{
	int i;
	int j;
	
	Node(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}

public class Main {
	Scanner input=new Scanner(System.in);
	LinkedList<Node>queue=new LinkedList<>();
	ArrayList<Node>nodecheck=new ArrayList<>();
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
					nodecheck.add(new Node(i,j));
				}
			}
		}
		String str=Arrays.deepToString(tomato);
		
		if((str.contains("1") || str.contains("-1")) && str.contains("0")==false)
		{
			System.out.println(0);
			System.exit(0);
		}
		
		day=BFS(tomato);
		
		str=Arrays.deepToString(tomato);
		if(str.contains("0"))
		{
			System.out.println(-1);
			return;
		}
		System.out.println(day-1);
	}				
		
	int BFS(int[][]tomato)
	{
		for(Node node:nodecheck)
		{
			queue.add(node);
		}
		
		while(queue.isEmpty()!=true)
		{
			int node_size=queue.size();
			while(node_size!=0)
			{
				
				Node node=queue.poll();
				node_size--;
				for(int i=0;i<4;i++)
				{
					int row=node.i+n[i];
					int col=node.j+m[i];
				
					if(row<M && row>=0 && col<N && col>=0 && tomato[row][col]==0)
					{
						queue.add(new Node(row,col));
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
		Main my=new Main();
		my.run();
	}
}
