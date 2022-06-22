package AbstractAndInterface;

import java.util.Scanner;

public class PDM1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < num; i++){
            int result[] = new int[27];
            char now = '!';
            String string = scanner.next();
            for(int j = 0; j < string.length(); j++ ){
                if(result[(int)string.charAt(j) - 96] != 0 && !(string.charAt(j) == now)) {
                    result[(int)string.charAt(j) - 96] = 100;
                    count++;
                    break;
                }else if(result[(int)string.charAt(j) - 96] == 0 && !(string.charAt(j) == now)) {
                    result[(int)string.charAt(j) - 96]++;
                }
                now = string.charAt(j);
            }
        }
        System.out.println(num - count);
    }
}