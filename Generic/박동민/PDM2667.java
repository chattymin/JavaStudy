import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PDM2667 {
    int count = 0;
    int num = 0;
    ArrayList<Integer> number = new ArrayList<>();

    void run() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] graph = new int[N+2][N+2];

        for(int i = 1; i < N+1; i++){
            String input = bf.readLine();
            for(int j = 1; j < N+1; j++){
                graph[i][j] = Integer.parseInt(String.valueOf(input.charAt(j-1)));
            }
        }

        DFSUtil(graph);

    }

    void DFSUtil(int[][] graph){
        for(int i = 1; i < graph.length-1; i++){
            for(int j = 1; j < graph.length-1; j++){
                if(graph[i][j] == 1){
                    DFS(graph, i, j);
                    count++;
                    number.add(num);
                    num = 0;
                }
            }
        }
        System.out.println(count);
        Collections.sort(number);
        for(Integer n:number){
            System.out.println(n);
        }
    }

    void DFS(int[][] graph, int i, int j){
        num++;
        graph[i][j] = 2;
        if(graph[i+1][j] == 1){
            DFS(graph, i+1, j);
        }
        if(graph[i][j+1] == 1){
            DFS(graph, i, j+1);
        }
        if(graph[i-1][j] == 1){
            DFS(graph, i-1, j);
        }
        if(graph[i][j-1] == 1){
            DFS(graph, i, j-1);
        }
    }

    public static void main(String[] args) throws IOException {
        PDM2667 my = new PDM2667();
        my.run();
    }
}
