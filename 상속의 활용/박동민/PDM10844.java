import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDM10844 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException {
        long arr[][] = new long[101][10];
        int N = Integer.parseInt(bf.readLine());
        long sum = 0;

        for(int i = 1; i < 10; i++){
            arr[1][i] = 1;
        }

        for(int i = 2; i < N+1; i++){
            arr[i][0] = arr[i-1][1];
            for(int j = 1; j < 9; j++){
                arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000;
            }
            arr[i][9] = arr[i-1][8];
        }

        for(int i = 0; i < 10; i++){
            sum += arr[N][i];
        }

        System.out.println(sum % 1000000000);
    }

    public static void main(String[] args) {
        PDM10844 my = new PDM10844();
        try{
            my.run();
        }catch(Exception e){}
    }
}

