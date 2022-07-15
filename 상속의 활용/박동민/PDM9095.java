package Clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PDM9095 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException {
        int num = Integer.parseInt(bf.readLine());

        find(num);
    }

    void find(int n) throws IOException{
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4));
            int goal = Integer.parseInt(bf.readLine());
            int number = 3;
            while (true) {
                if (goal < 4) {
                    System.out.println(arr.get(goal - 1));
                    break;
                }
                number++;

                arr.add(arr.get(number - 2) + arr.get(number - 3) + arr.get(number - 4));
                if (number == goal) {
                    System.out.println(arr.get(number - 1));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        PDM9095 my = new PDM9095();
        try{
            my.run();
        }catch(Exception e){}
    }
}