package FallExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	// ���� �Լ��� ä��ÿ�. input ���Ͽ� �ִ� ������ �Է�
	void readAll() //�⺻ ���� ����
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
	void printList() //����ó ���
	{
		if (contacts.isEmpty()) {
			System.out.println("����ó�� ����ֽ��ϴ�.");
			return;
		}
		int i = 0;
		for (Contact c: contacts)
			c.print(i++);
	}
	void registerContact() //���� ���
	{
		String phone = null;
		System.out.print("��ȭ��ȣ : ");
		phone = scan.next();
		if (findContact(phone) != null) 
		{
			System.out.println("�̹� �����ϴ� ��ȭ��ȣ �Դϴ�.");
			return;
		}
		Contact c = new Contact(phone);
		c.readRegister(scan);	
		contacts.add(c);
	}
	void deleteContact() //����
	{
		printList();
		int index = -1;
		System.out.print("������ ��ȣ: ");
		index = scan.nextInt();
		if (index <= 0 || index > contacts.size()) 
		{
			System.out.println("��ȣ�� ������ ������ϴ�.");
			return;
		}
		contacts.remove(index-1);
	}
	// ���� �Լ��� ä��ÿ�.
	void modifyContact() //����
	{
		System.out.print("������ ��ȣ : ");
		int changeNumber = scan.nextInt();

		Contact c = contacts.get(changeNumber-1);
		c.modify(scan);
	}
	// ���� �Լ��� ä��ÿ�.
	void searchContact() //�˻�
	{
		System.out.print("�˻� Ű���� : ");
		String search = scan.next();
		
		for(int i=0; i<contacts.size(); i++)
		{
			Contact c = contacts.get(i);
			
			if(c.matches(search)) //c�� search ���� ������ print
				c.print(i);	
		}
		
	}
	// findContact �Լ��� ����ÿ�.
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
