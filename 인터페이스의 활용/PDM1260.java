import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PDM1260 {

    void run() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        boolean[][] graph = new boolean[N][N];

        for(int i = 0; i < M; i++){
            input = bf.readLine().split(" ");
            graph[Integer.parseInt(input[0])-1][Integer.parseInt(input[1])-1] = true;
            graph[Integer.parseInt(input[1])-1][Integer.parseInt(input[0])-1] = true;
        }

        DFS(graph,V);
        System.out.println();
        BFS(graph, V);
    }

    void DFS(boolean[][] graph, int Start){
        boolean[] visited = new boolean[graph.length];
        visited[Start - 1] = true;
        DFSUtil(graph, visited, Start);
    }

    void DFSUtil(boolean[][] graph, boolean[] visited, int Start){
        System.out.print(Start + " ");
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == false && graph[Start-1][i] == true){
                visited[i] = true;
                DFSUtil(graph,visited,i+1);
            }
        }
    }

    void BFS(boolean[][] graph, int Start){
        boolean[] visited = new boolean[graph.length];
        visited[Start - 1] = true;
        Queue<Integer> queue = new LinkedList<>();
        int num = Start;

        queue.offer(Start);

        while(!queue.isEmpty()){
            num = queue.poll();
            System.out.print(num + " ");

            for(int i = 0; i < visited.length; i++){
                if(visited[i] == false && graph[num-1][i] == true){
                    visited[i] = true;
                    queue.offer(i+1);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        PDM1260 my = new PDM1260();
        my.run();
    }
}
