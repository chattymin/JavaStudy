import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DFS
{
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Integer> adjList[];
	boolean visited[];
	int N; //정점의 개수
	int M; //간선의 개수
	int count=0; //연결 개수
	
	public void run()
	{
		N = scan.nextInt();
		M = scan.nextInt();
		
		adjList = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=1; i<adjList.length; i++)
		{
			adjList[i] = new ArrayList<>();
		}
		for(int i=0; i<M; i++)
		{
			int start = scan.nextInt();
			int end = scan.nextInt();
			
			adjList[start].add(end);
			adjList[end].add(start);
		}
		for(int i=1; i<adjList.length; i++)
		{
			Collections.sort(adjList[i]);
		}
		for(int i=1; i<adjList.length; i++)
		{
			if(!visited[i])
			{
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	public void dfs(int V)
	{
		visited[V] = true;
		for(int list : adjList[V])
		{
			if(!visited[list])
			{
				dfs(list);
			}
		}
	}
}
public class Fall11724 {

	public static void main(String[] args) 
	{
		DFS d = new DFS();
		d.run();
	}

}
