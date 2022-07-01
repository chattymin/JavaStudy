package SkillfulJava.PDMExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Item> items = new ArrayList<>();

    void run(){
        while(true){ // read
            Item it = new Item();
            if(it.read(scanner) == -1){
                break;
            }
            items.add(it);
        }

        for(Item item : items){ // print
            item.print();
        }
    }

    public static void main(String[] args) {
        Main my = new Main();
        my.run();
    }
}
