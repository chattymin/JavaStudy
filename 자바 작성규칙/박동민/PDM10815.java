package SkillfulJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PDM10815 {
    Scanner scanner = new Scanner(System.in);

    int n, m;
    Set<Integer> nList = new HashSet<>();
    ArrayList<Integer> mList = new ArrayList<>();

    void run(){
        n = scanner.nextInt();
        for(int i = 0 ; i < n; i++){
            nList.add(scanner.nextInt());
        }

        m = scanner.nextInt();
        for(int i = 0; i<m; i++){
            if(nList.contains(scanner.nextInt())){
                mList.add(1);
            }
            else{
                mList.add(0);
            }
        }

        print();
    }

    void print(){
        for(Integer mList : mList){
            System.out.print(mList + " ");
        }
    }

    public static void main(String[] args) {
        PDM10815 my = new PDM10815();
        my.run();
    }
}
