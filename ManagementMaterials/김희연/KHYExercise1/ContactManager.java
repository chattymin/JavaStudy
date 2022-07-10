package KHYExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	// ���� �Լ��� ä��ÿ�. input ���Ͽ� �ִ� ������ �Է�
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
			System.out.println("����ó�� ����ֽ��ϴ�.");
			return;
		}
		int i = 0;
		for (Contact c: contacts)
			c.print(i++);
	}
	void registerContact() {
		String phone = null;
		System.out.print("��ȭ��ȣ : ");
		phone = scan.next();
		if (findContact(phone) != null) {
			System.out.println("�̹� �����ϴ� ��ȭ��ȣ �Դϴ�.");
			return;
		}
		Contact c = new Contact(phone);
		c.readRegister(scan);	
		contacts.add(c);
	}
	void deleteContact() {
		printList();
		int index = -1;
		System.out.print("������ ��ȣ: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) {
			System.out.println("��ȣ�� ������ ������ϴ�.");
			return;
		}
		contacts.remove(index-1);
	}
	// ���� �Լ��� ä��ÿ�.
	void modifyContact() {
		System.out.print("������ ��ȣ:");
		int index=scan.nextInt()-1;
		if(index<0 || index>contacts.size())
		{
			System.out.println("��ȣ�� ������ ������ϴ�.");
			return;
		}
		contacts.get(index).modify(scan);
	}
	// ���� �Լ��� ä��ÿ�.
	void searchContact() {
		System.out.print("�˻� Ű����:");
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
	// findContact �Լ��� ����ÿ�.
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
