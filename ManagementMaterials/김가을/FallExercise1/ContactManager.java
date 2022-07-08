package FallExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	// 다음 함수를 채우시오. input 파일에 있는 내용을 입력
	void readAll() //기본 정보 저장
	{
		while(true)
		{
			String phone = scan.next();
			if(phone.equals("end"))
				break;
			Contact contact = new Contact(phone);
			contact.read(scan);
			contacts.add(contact);
		}	
	}
	void printList() //연락처 출력
	{
		if (contacts.isEmpty()) {
			System.out.println("연락처가 비어있습니다.");
			return;
		}
		int i = 0;
		for (Contact c: contacts)
			c.print(i++);
	}
	void registerContact() //새로 등록
	{
		String phone = null;
		System.out.print("전화번호 : ");
		phone = scan.next();
		if (findContact(phone) != null) 
		{
			System.out.println("이미 존재하는 전화번호 입니다.");
			return;
		}
		Contact c = new Contact(phone);
		c.readRegister(scan);	
		contacts.add(c);
	}
	void deleteContact() //삭제
	{
		printList();
		int index = -1;
		System.out.print("삭제할 번호: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) 
		{
			System.out.println("번호가 범위를 벗어났습니다.");
			return;
		}
		contacts.remove(index-1);
	}
	// 다음 함수를 채우시오.
	void modifyContact() //수정
	{
		System.out.print("수정할 번호 : ");
		int changeNumber = scan.nextInt();

		Contact c = contacts.get(changeNumber-1);
		c.modify(scan);
	}
	// 다음 함수를 채우시오.
	void searchContact() //검색
	{
		System.out.print("검색 키워드 : ");
		String search = scan.next();
		
		for(int i=0; i<contacts.size(); i++)
		{
			Contact c = contacts.get(i);
			
			if(c.matches(search)) //c에 search 값이 있으면 print
				c.print(i);	
		}
		
	}
	// findContact 함수를 만드시오.
	Contact findContact(String key)
	{
		for(int i=0; i<contacts.size(); i++)
		{
			Contact c = contacts.get(i);
			
			if(c.matches(key))
				return c;
		}
		return null;
	}
	
}
