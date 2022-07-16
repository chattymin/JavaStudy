package book;

import java.util.Scanner;

public class AppendixBook extends Book{
    int nBook;
    String appendix = "hi";

    @Override
    public void read(Scanner scan) {
        super.read(scan);
        nBook = scan.nextInt();
        appendix = scan.nextLine();
    }

    @Override
    void printBookType() {
        System.out.print("[부록책] ");
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("\t별책: %s\n",appendix);
    }

    @Override
    public boolean matches(String kwd) {
        if(kwd.equals("부록책")){
            return true;
        }
        if(super.matches(kwd)){
            return true;
        }
        if(appendix.contains(kwd)){
            return true;
        }
        return false;
    }
}
