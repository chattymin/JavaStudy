import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PDM11724 {

    void run() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        boolean[][] graph = new boolean[N][N];
        boolean[] visited = new boolean[N];

        int count = 0;

        for(int i = 0; i < M; i++){
            input = bf.readLine().split(" ");
            graph[Integer.parseInt(input[0])-1][Integer.parseInt(input[1])-1] = true;
            graph[Integer.parseInt(input[1])-1][Integer.parseInt(input[0])-1] = true;
        }

        for(int i = 0; i < N; i++){
            if(visited[i] == false){
                BFS(graph, visited, i+1);
                count++;
            }
        }

        System.out.println(count);

    }

    void BFS(boolean[][] graph, boolean[] visited, int Start){
        visited[Start - 1] = true;
        Queue<Integer> queue = new LinkedList<>();
        int num = Start;

        queue.offer(Start);

        while(!queue.isEmpty()){
            num = queue.poll();

            for(int i = 0; i < visited.length; i++){
                if(visited[i] == false && graph[num-1][i] == true){
                    visited[i] = true;
                    queue.offer(i+1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        PDM11724 my = new PDM11724();
        my.run();
    }
}
