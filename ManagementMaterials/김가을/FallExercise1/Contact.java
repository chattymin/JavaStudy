package FallExercise1;

import java.util.Scanner;

public class Contact {
	private String name;
	private int age;
	private String phoneNumber;
	
	Contact(String phone) 
	{
		phoneNumber = phone;
	}
	void print(int i) 
	{
		System.out.printf(" [%d] %s\t%2d��  %s\n", i + 1, name,  
				age, phoneNumber);
	}
	void read(Scanner scan) 
	{
		name = scan.next();
		age = scan.nextInt();
	}
	void readRegister(Scanner scan) 
	{
		System.out.print("�̸� : ");
		name = scan.next();

		System.out.print("���� : ");
		this.age = scan.nextInt();
	}
	// matches �޼ҵ带 �ϼ��Ͻÿ�.
	// �̸��� ��ȭ��ȣ�� �κи�ġ, ���̴� ��ü��ġ
	boolean matches(String search)
	{
		if(phoneNumber.contains(search) || name.contains(search) || search.equals(age+""))
			return true;

		return false;
	}
	void modify(Scanner scan) //����
	{
		scan.nextLine();
		System.out.println("������ ������ �ۼ����ּ���.");
		System.out.printf("�̸� : %s -> ", name);
		String temp = scan.nextLine();
		if (temp.length() > 0)
			name = temp;		

		System.out.printf("���� : %d -> ", age);
		temp = scan.nextLine();
		if (temp.length() > 0)
			age = Integer.parseInt(temp);		

		System.out.printf("��ȭ��ȣ : %s -> ", phoneNumber);
		temp = scan.nextLine();
		if (temp.length() > 0)
			phoneNumber = temp;
		System.out.print("���� �Ϸ�: ");
		print(0);
	}
}