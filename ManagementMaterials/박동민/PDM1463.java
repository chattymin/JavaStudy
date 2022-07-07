package Clear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class PDM1463 {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void run() throws IOException {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,1)); // 1,2,3 초기화
        int num = Integer.parseInt(bf.readLine());
        int find = 3, min = 0;
        while(true){
            if(num <= 3){
                System.out.println(arr.get(num-1));
                break;
            }

            find++;
            min = 999999999;

            if((find%3 == 0) && (arr.get(find/3 - 1) < min)){
                min = arr.get(find/3 - 1) + 1;
            }
            if((find%2 == 0) && (arr.get(find/2 - 1) < min)){
                min = arr.get(find/2 - 1) + 1;
            }
            if(arr.get(find-2) < min){
                min = arr.get(find - 2) + 1;
            }
            if(find == num){
                System.out.println(min);
                break;
            }
            arr.add(min);
        }
    }

    public static void main(String[] args) {
        PDM1463 my = new PDM1463();
        try {
            my.run();
        }catch(Exception e){}
    }
}
