package book;

import java.util.ArrayList;
import java.util.Scanner;

public class Book implements Manageable{
    String title;
    String pub;
    String isbn;
    int year;
    ArrayList<String> authors = new ArrayList<>();
    int price;

    @Override
    public void read(Scanner scan){
        title = scan.next();
        pub = scan.next();
        isbn = scan.next();
        year = scan.nextInt();
        String temp;
        while(true){
            temp = scan.next();
            if(temp.contentEquals("0")){
                break;
            }
            authors.add(temp);
        }
        price = scan.nextInt();
    }

    void printBookType(){
        System.out.print("[일반책] ");
    }

    @Override
    public void print(){
        printBookType();
        System.out.printf("%s (%s/%s/%d년) [%d원 ] 저자:",title,pub,isbn,year,price);
        for(String name:authors){
            System.out.print(name + " ");
        }
        System.out.println();
    }

    @Override
    public boolean matches(String kwd){
        if (title.contains(kwd))
            return true;
        if (pub.contains(kwd))
            return true;
        if (kwd.equals("" + isbn))
            return true;
        if (kwd.equals("" + year))
            return true;
        for (String a : authors)
            if (kwd.contentEquals(a))
                return true;
        return false;
    }

}
