import java.util.Scanner;

public class KHY15649 {
	Scanner input=new Scanner(System.in);
	int N,M;
	int[]number;
	int[]answer;
	boolean[]visited;
	
	void run() 
	{
		do {
			N=input.nextInt();
			M=input.nextInt();
		}while((M<1)||(M>N)||(N>8));
		
		number=new int[N+1];
		answer=new int[M];
		visited=new boolean[N+1];
		
		for(int i=1;i<=N;i++)
		{
			number[i]=i;
		}
		
		visited[0]=true;
		
		dfs(0,1);
	}
	
	void dfs(int depth,int start) 
	{
		if(depth==M)
		{
			for(int num:answer)
			{
				System.out.print(num+" ");	
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;i++)
		{
			if(visited[i]==false)
			{
				visited[i]=true;
				answer[depth]=i;
				dfs(depth+1,i);
				visited[i]=false;
			}
		}
	}
	
	public static void main(String[] args) {
		KHY15649 my=new KHY15649();
		my.run();
	}
}
