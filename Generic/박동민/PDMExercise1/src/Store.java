import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);
    static Manager<Item> itemMgr = new Manager<>();
    static Manager<User> userMgr = new Manager<>();
    static Manager<Order> orderMgr = new Manager<>();
    void run() {
        itemMgr.readAll("/Users/parkdongmin/Study/9week/src/items.txt", new Factory<Item>() {
            public Item create() {
                return new Item();
            }
        });
        /*
        userMgr.readAll("user.txt", new Factory<User>() {
            public User create() {
                return new User();
            }
        });
        orderMgr.readAll("order.txt", new Factory<Order>() {
            public Order create() {
                return new Order();
            }
        });
         */
        menu();
    }
    void menu() {
        int num;
        while (true) {
            System.out.print("(1)물품출력 (2)사용자출력 (3)주문출력 (4)검색 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 4) break;
            switch(num) {
                case 1:
                    itemMgr.printAll();
                    sortItemMenu();
                    itemMgr.printAll(); break;
                case 2: userMgr.printAll(); break;
                case 3: orderMgr.printAll(); break;
                case 4: searchMenu(); break;
                default: break;
            }
        }
    }

    void sortItemMenu(){
        int num;
        while (true) {
            System.out.println("(1)이름순 (2)코드순 (3)가격순 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 3) break;
            switch(num) {
                case 1:
                    Collections.sort(itemMgr.mList, new Comparator<Item>(){
                        public int compare(Item it1, Item it2){
                            return it1.name.compareTo(it2.name);
                        }
                    });
                    break;
                case 2:
                    Collections.sort(itemMgr.mList, new Comparator<Item>(){
                        public int compare(Item it1, Item it2){
                            return it1.id.compareTo(it2.id);
                        }
                    });
                    break;
                case 3:
                    Collections.sort(itemMgr.mList, new Comparator<Item>(){
                        public int compare(Item it1, Item it2){
                            return it1.getSubtotal(1) > it1.getSubtotal(2) ? 1: it1.getSubtotal(1) < it2.getSubtotal(1) ? -1 : 0;
                        }
                    });
                    break;
                default: break;
            }
        }
    }

    void searchMenu() {
        int num;
        while (true) {
            System.out.print("(1)물품검색 (2)사용자검색 (3)주문검색 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 3) break;
            switch(num) {
                case 1: itemMgr.search(scan); break;
                case 2: userMgr.search(scan); break;
                case 3: orderMgr.search(scan); break;
                default: break;
            }
        }
    }
    static Item findItem(String kwd) {
        return itemMgr.find(kwd);
    }
    static User findUser(String kwd) {
        return userMgr.find(kwd);
    }
    static Order findOrder(String kwd) {
        return orderMgr.find(kwd);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Store m = new Store();
        m.run();
    }
}
