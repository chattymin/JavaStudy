import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Graph
{
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Integer> result = new ArrayList<Integer>(); //단지의 개수 즉 결과 저장
	boolean visited[][]; //방문 확인
	int map[][]; //지도
	static int N; //지도의 크기
	static int count=0; //단지 집의 수
	
	public void run()
	{
		N = scan.nextInt();
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++)
		{
			String input = scan.next();
			for(int j=0; j<N; j++)
			{
				map[i][j] = input.charAt(j)-'0';
				//System.out.print(map[i][j]+" ");
			}
		}
		
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(map[i][j]==1 && !visited[i][j])
				{
					count=1; //단지 집의 수 초기화
					dfs(i,j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);
		System.out.println(result.size());
		for(int list : result)
		{
			System.out.println(list);
		}
	}
	int dfs(int x, int y)
	{
		int X[] = {0, 0, -1, 1}; //상하좌우에서 x축
		int Y[] = {1, -1, 0, 0}; //상하좌우에서 y축
		int row, col;
		
		visited[x][y] = true;
		for(int i=0; i<4; i++)
		{
			row = X[i] + x;
			col = Y[i] + y;
			
			if(row>=0 && row<N && col>=0 && col<N)
			{
				if(map[row][col]==1 && !visited[row][col])
				{
					count++;
					dfs(row, col);
				}
			}
		}
		return count;
	}
}
public class Fall2667 
{
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		graph.run();

	}

}
