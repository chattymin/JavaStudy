package book;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    Scanner scan = new Scanner(System.in);
    ArrayList<Manageable> bookList = new ArrayList<>();

    void run(){
        // readAll("/Users/parkdongmin/Study/Java/src/book/book4.txt");
        readAll("book4.txt의 위치");
        printAll();
        search();
    }

    Scanner openFile(String filename) {
        Scanner filein  = null;
        try{
            filein = new Scanner(new File(filename));
        }catch(Exception e){
            System.out.printf("파일 오픈 실패 : %s\n", filename);
            System.exit(0);
        }
        return filein;
    }

    void readAll(String filename){
        Scanner filein = openFile(filename);
        Manageable m = null;
        int type;
        while(filein.hasNext()){
            type = filein.nextInt();
            switch (type){
                case 1:
                    m = new Book();
                    break;
                case 2:
                    m = new EBook();
                    break;
                case 3:
                    m = new AppendixBook();
                    break;
                case 4:
                    m = new Pen();
                    break;
                case 5:
                    m = new Tissue();
                    break;
                default:
                    type = 0;
                    break;
            }
            m.read(filein);
            bookList.add(m);
        }
        filein.close();
    }

    void printAll(){
        for(Manageable m:bookList){
            m.print();
        }
    }

    void search(){
        String kwd = null;
        while(true){
            System.out.print(">> 검색 키워드: ");
            kwd = scan.next();
            if(kwd.contentEquals("end")){
                break;
            }
            for(Manageable m : bookList){
                if(m.matches(kwd)){
                    m.print();
                }
            }
        }
    }

    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        store.run();
    }
}
