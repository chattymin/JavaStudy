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
		System.out.printf(" [%d] %s\t%2d세  %s\n", i + 1, name,  
				age, phoneNumber);
	}
	void read(Scanner scan) 
	{
		name = scan.next();
		age = scan.nextInt();
	}
	void readRegister(Scanner scan) 
	{
		System.out.print("이름 : ");
		name = scan.next();

		System.out.print("나이 : ");
		this.age = scan.nextInt();
	}
	// matches 메소드를 완성하시오.
	// 이름과 전화번호는 부분매치, 나이는 전체일치
	boolean matches(String search)
	{
		if(phoneNumber.contains(search) || name.contains(search) || search.equals(age+""))
			return true;

		return false;
	}
	void modify(Scanner scan) //수정
	{
		scan.nextLine();
		System.out.println("수정할 내용을 작성해주세요.");
		System.out.printf("이름 : %s -> ", name);
		String temp = scan.nextLine();
		if (temp.length() > 0)
			name = temp;		

		System.out.printf("나이 : %d -> ", age);
		temp = scan.nextLine();
		if (temp.length() > 0)
			age = Integer.parseInt(temp);		

		System.out.printf("전화번호 : %s -> ", phoneNumber);
		temp = scan.nextLine();
		if (temp.length() > 0)
			phoneNumber = temp;
		System.out.print("수정 완료: ");
		print(0);
	}
}