package book;

import java.util.Scanner;

public class Pen implements Manageable {
    String name;
    float size;
    int price;

    @Override
    public void read(Scanner scan) {
        name = scan.next();
        size = scan.nextFloat();
        price = scan.nextInt();
    }

    @Override
    public void print() {
        System.out.printf("%s %5.2fmm (%d원)\n", name, size, price);
    }

    @Override
    public boolean matches(String kwd) {
        if (name.contains(kwd))
            return true;
        if (kwd.contentEquals(("" + size)))
            return true;
        return false;
    }

}
