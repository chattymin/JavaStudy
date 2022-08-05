import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PDM15649 {
    ArrayList<Integer> result = new ArrayList<>();
    int N;
    int M;

    void run() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        DFSUtil();
    }

    void DFSUtil(){
        boolean[] visited = new boolean[N];
        for(int i = 0; i < N; i++){
            result.add(i + 1);
            visited[i] = true;
            DFS(visited, 1);
            visited[i] = false;
            result.remove(0);
        }
    }

    void DFS(boolean[] visited, int count){
        if(count < M){
            for(int i = 0; i < N; i++){
                if(!visited[i]) {
                    result.add(i + 1);
                    visited[i] = true;
                    DFS(visited, count + 1);
                    visited[i] = false;
                    result.remove(count);
                }
            }
        }else{
            print();
        }
    }

    void print(){
        for(Integer list:result){
            System.out.print(list + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        PDM15649 my = new PDM15649();
        my.run();
    }
}