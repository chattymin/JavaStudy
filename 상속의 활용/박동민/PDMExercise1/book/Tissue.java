package book;

import java.util.Scanner;

public class Tissue implements Manageable {
    String name;
    int sheet;
    int price;

    @Override
    public void read(Scanner scan) {
        name = scan.next();
        sheet = scan.nextInt();
        price = scan.nextInt();

    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.printf("%s %d장 (%d원)\n", name, sheet, price);
    }

    @Override
    public boolean matches(String kwd) {
        // TODO Auto-generated method stub
        if (name.contains(kwd))
            return true;
        if (kwd.contentEquals("" + sheet))
            return true;
        return false;
    }

}
