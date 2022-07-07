package Clear;

import java.util.ArrayList;
import java.util.Scanner;

public class PDM3036 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> ringList = new ArrayList<>();
    int n;

    void run(){
        n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            ringList.add(scanner.nextInt());
        }

        for(int i = 1; i < n; i++){
            find(ringList.get(0), ringList.get(i));
        }


    }

    void find(int firstRing, int others){
        int firstTemp = firstRing;
        int othersTemp = others;
        int temp;
        while(true){
            if(firstTemp % othersTemp == 0){
                System.out.println(firstRing/othersTemp + "/" + others/othersTemp);
                break;
            }
            temp = firstTemp % othersTemp;
            firstTemp = othersTemp;
            othersTemp = temp;
        }

    }

    public static void main(String[] args) {
        PDM3036 my = new PDM3036();
        my.run();
    }
}
