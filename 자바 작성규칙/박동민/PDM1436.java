package SkillfulJava;

import java.util.Scanner;

public class PDM1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        int temp;
        int result = 666;

        while(true){
            temp = result;
            while(temp > 100){
                if(temp % 1000 == 666){
                    count++;
                    break;
                }
                temp /= 10;
            }
            if(count == num){
                break;
            }
            result++;
        }

        System.out.println(result);
    }
}
