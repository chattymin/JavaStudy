import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
public class KHY2667 {
	Scanner input=new Scanner(System.in);
    LinkedList<Node>queue=new LinkedList<>();
    ArrayList<Integer>result=new ArrayList<>();
    boolean [][]visited;
    int N;int block=0,house=1;
    int []n= {-1,1,0,0};
    int []m= {0,0,-1,1};
	void run()
	{
		do {
			N=input.nextInt();
		}while(N<5 || N>25);
		
		int[][]apt=new int[N][N];
		visited=new boolean[N][N];
		
		for(int i=0;i<N;i++)
		{
			String str=input.next();
			for(int j=0;j<N;j++)
			{	
				apt[i][j]=str.charAt(j)-'0';
			}
		}
			
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{	if(visited[i][j]==false && apt[i][j]==1)
				{
					result.add(BFS(i,j,apt));
					house=1;
					block++;
				}
			}
		}
		System.out.println(block);
		Collections.sort(result);
		for(int num:result)
		{
			System.out.println(num);
		}
	}

    int BFS(int row,int col,int [][]apt)
    {
    	queue.add(new Node(row,col));
        apt[row][col]=0;
    	
    	while(queue.isEmpty()!=true)
    	{
    		Node node =queue.poll();
    		
    		for(int i=0;i<4;i++)
    		{
    			row=node.i+n[i];
    			col=node.j+m[i];
    			
    			if(row>=0 && row<N && col>=0 && col<N)
    			{
    				if(apt[row][col]==1)
    				{	queue.add(new Node(row,col));
    				    apt[row][col]=0;
    				    house++;
    		         }
    		     }
    		}
    	}
    	return house;
    }
	
	public static void main(String[] args) {
		KHY2667 my=new KHY2667();
		my.run();
	}
}
