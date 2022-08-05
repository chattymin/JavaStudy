import java.util.ArrayList;
import java.util.Scanner;

class Backtracking1
{
	Scanner scan = new Scanner(System.in);
	
	int array[];
	boolean visited[];
	int N, M;
	
	void run()
	{
		N = scan.nextInt(); //��
		M = scan.nextInt(); //��
		
		array = new int[M+1];
		visited = new boolean[N+1];
		
		dfs(0);
	}
	
	void dfs(int depth)
	{
		if(depth == M)
		{
			for(int i=0; i<M; i++)
			{
				System.out.print(array[i]+" ");
			}
			System.out.println();
			return; //if�� ����
		}
		
		for(int i=1; i<=N; i++)
		{
			if(!visited[i])
			{
				visited[i] = true; //�湮�� ���� ǥ��
				array[depth] = i; 
				
				dfs(depth+1);
				visited[i] = false; //�ʱ�ȭ
			}
		}
	}
}
public class Fall15649 
{
	public static void main(String[] args) 
	{
		Backtracking1 b = new Backtracking1();
		b.run();
	}
}
