package managementMaterials.PDMExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    // 다음 함수를 채우시오. input 파일에 있는 내용을 입력
    void readAll() { // 끝
        while(true){
            String number = scan.next();
            if(number.equals("end")){
                break;
            }
            Contact contact = new Contact(number);
            contact.read(scan);
            contacts.add(contact);
        }
    }

    void printList() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        int i = 0;
        for (Contact c: contacts)
            c.print(i++);
    }

    void registerContact() {
        String phone = null;
        System.out.print("전화번호 : ");
        phone = scan.next();
        if (findContact(phone) != null) {
            System.out.println("이미 존재하는 전화번호 입니다.");
            return;
        }
        Contact c = new Contact(phone);
        c.readRegister(scan);
        contacts.add(c);
    }

    void deleteContact() {
        printList();
        int index = -1;
        System.out.print("삭제할 번호: ");
        index = scan.nextInt();
        if (index <= 0 || index > contacts.size()) {
            System.out.println("번호가 범위를 벗어났습니다.");
            return;
        }
        contacts.remove(index-1);
    }

    // 다음 함수를 채우시오.
    void searchContact() { // 끝
        String search = null;
        System.out.print("검색 키워드: ");
        search = scan.next();
        int i = 0;
        for (Contact c: contacts) {
            if(c.matches(search)){
                c.print(i);
            }
            i++;
        }
    }

    // 다음 함수를 채우시오.
    void modifyContact() {
        int changeNumber;
        System.out.print("수정할 번호: ");
        changeNumber = scan.nextInt();
        contacts.get(changeNumber-1).modify(scan);
    }

    // findContact 함수를 만드시오.
    Contact findContact(String phone){ // 끝
        for(Contact contact:contacts){
            if(contact.matches(phone)){
                return contact;
            }
        }
        return null;
    }

}
