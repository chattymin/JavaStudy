import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PDM7576 {
    class tomato{
        int x;
        int y;
        tomato(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    void run() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<tomato> queue = new LinkedList<>();
        String[] input = bf.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        int[][] graph =  new int[N][M];
        for(int i = 0; i < N; i++){
            input = bf.readLine().split(" ");
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(input[j]);
                if(graph[i][j] == 1){
                    queue.add(new tomato(i,j));
                }
            }
        }

        System.out.println(BFS(graph, queue));
    }

    int BFS(int[][] graph, Queue<tomato> queue){
        int max = 0;
        while (!queue.isEmpty()){
            int[] dx = {0,0,1,-1};
            int[] dy = {1,-1,0,0};

            tomato xy = queue.poll();
            int x = xy.x;
            int y = xy.y;

            for(int i = 0; i < 4; i++){
                int xx = x + dx[i];
                int yy = y + dy[i];
                if(xx >= 0 && xx < graph.length && yy >= 0 && yy < graph[x].length){
                    if(graph[xx][yy] == 0){
                        queue.add(new tomato(xx,yy));
                        graph[xx][yy] = graph[x][y] + 1;
                        if(max<graph[xx][yy]){
                            max = graph[xx][yy];
                        }
                    }
                }
            }
        }

        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length; j++){
                if(graph[i][j] == 0){
                    return -1;
                }
            }
        }

        if(max == 0){
            return 0;
        }

        return max-1;
    }

    public static void main(String[] args) throws IOException{
        PDM7576 my = new PDM7576();
        my.run();
    }
}
