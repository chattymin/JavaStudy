import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDM9663 {
    boolean[][] visited;
    int N;
    int count = 0;

    void run() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        visited = new boolean[N][N];

        DFSUtil();

        System.out.println(count);
    }

    void DFSUtil(){
        for(int i = 0; i<N;i++){
            visited[i][0] = true;
            DFS(1);
            visited[i][0] = false;
        }
    }

    void DFS(int line){
        if(line < N) {
            for (int i = 0; i < N; i++) {
                if (!visited[i][line]) {
                    if(rowCheck(i) && columnCheck(line) && diagonalCheck(i, line)) {
                        visited[i][line] = true;
                        DFS(line + 1);
                        visited[i][line] = false;
                    }
                }
            }
        }else{
            count++;
        }
    }

    boolean rowCheck(int y){
        for(int i = 0; i < N; i++){
            if(visited[y][i]){
                return false;
            }
        }
        return true;
    }

    boolean columnCheck(int x){
        for(int i = 0; i < N; i++){
            if(visited[i][x]){
                return false;
            }
        }
        return true;
    }

    boolean diagonalCheck(int x, int y){
        int xx = x;
        int yy = y;

        //우측상단
        while(xx >= 0 && yy < N){
            if(visited[xx][yy]){
                return false;
            }
            xx--;
            yy++;
        }

        //우측하단
        xx = x;
        yy = y;
        while(xx < N && yy < N){
            if(visited[xx][yy]){
                return false;
            }
            xx++;
            yy++;
        }

        //좌측상단
        xx = x;
        yy = y;
        while(xx >= 0 && yy >= 0){
            if(visited[xx][yy]){
                return false;
            }
            xx--;
            yy--;
        }

        //좌측하단
        xx = x;
        yy = y;
        while(xx < N && yy >= 0){
            if(visited[xx][yy]){
                return false;
            }
            xx++;
            yy--;
        }

        return true;
    }


    public static void main(String[] args) throws IOException{
        PDM9663 my = new PDM9663();
        my.run();
    }
}
