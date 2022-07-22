
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph
{
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Integer> adjList[];
	boolean visited[];
	int N; //정점의 개수
	int M; //간선의 개수
	int V; //탐색 시작 정점의 번호 
	
	public void run()
	{
		N = scan.nextInt();
		M = scan.nextInt();
		V = scan.nextInt();
		
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
		
		dfs(V);
		
		Arrays.fill(visited, false); //배열 초기화
		System.out.println();
		
		bfs(V);
		
	}
	public void dfs(int V)
	{
		visited[V] = true;
		System.out.print(V+" ");
		for(int list : adjList[V])
		{
			if(!visited[list])
			{
				dfs(list);
			}
		}
	}
	public void bfs(int V)
	{
		Queue<Integer> queue = new LinkedList<>();
		
		visited[V] = true;
		queue.add(V);
		
		while(!queue.isEmpty())
		{
			int i = queue.remove();
			System.out.print(i+" ");
			for(int list : adjList[i])
			{
				if(!visited[list])
				{
					queue.add(list);
					visited[list] = true;
				}
			}
		}
	}
}
public class Fall1260 
{
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		graph.run();
	}
}
