package KHYExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	// 다음 함수를 채우시오. input 파일에 있는 내용을 입력
	void readAll() {
		while(true)
		{
			String phone=scan.next();
			if(phone.equals("end"))
			{
				break;
			}
			Contact c=new Contact(phone);
			c.read(scan);
			contacts.add(c);
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
	void modifyContact() {
		System.out.print("수정할 번호:");
		int index=scan.nextInt()-1;
		if(index<0 || index>contacts.size())
		{
			System.out.println("번호가 범위를 벗어났습니다.");
			return;
		}
		contacts.get(index).modify(scan);
	}
	// 다음 함수를 채우시오.
	void searchContact() {
		System.out.print("검색 키워드:");
		String key=scan.next();

		int i=0;
		for(Contact contact:contacts)
		{
			if(contact.matches(key))
			{
				contact.print(i);
			}
			i++;
		}
	}
	// findContact 함수를 만드시오.
	Contact findContact(String key)
	{

		for(Contact contact:contacts)
		{
			if(contact.matches(key))
			{
				return contact;
			}
		}
		return null;
	}
}
