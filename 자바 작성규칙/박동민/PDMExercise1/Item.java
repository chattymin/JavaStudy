package SkillfulJava.PDMExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    static int count = 1;
    String Code = new String();
    String Name = new String();
    int Number;

    int read(Scanner scanner){
        Code = scanner.next();
        if(Code.equals("0")){
            return -1;
        }
        Name = scanner.next();
        Number = scanner.nextInt();
        return 0;
    }

    void print(){
        if(Name.length() < 8){
            System.out.printf("%2d) [%s] %-12s\t\t %5d원\n", count, Code, Name,Number);
        }else{
            System.out.printf("%2d) [%s] %-12s\t %5d원\n", count, Code, Name,Number);
        }
        count++;
    }
}
