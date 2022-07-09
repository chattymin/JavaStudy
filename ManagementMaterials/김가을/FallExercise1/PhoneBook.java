package FallExercise1;

public class PhoneBook {
	ContactManager manager = new ContactManager();
	void run() 
	{
		manager.readAll();
		runMenu();
	}
	int inputMenu() 
	{
		int num;
		while (true) {
			System.out.println("############ 연락처 관리 ############");
			System.out.print("(1) 연락처 출력  ");
			System.out.print("(2) 새로 등록  ");
			System.out.print("(3) 삭제  ");
			System.out.print("(4) 검색  ");
			System.out.print("(5) 수정  ");
			System.out.print("(6) 끝내기  ");
			System.out.print("... ");
			num = manager.scan.nextInt();
			if (num >= 1 && num <= 6)
				return num;
			System.out.println("잘못된 번호입니다. 다시 입력해 주세요...");
		}
	}
	// inputMenu를 이용하여 메뉴를 입력받고 실행하도록 작성하시오.
	void runMenu() 
	{
		while(true)
		{
			int num = inputMenu();
			switch (num) 
			{
			case 1:
				manager.printList();
				break;
			case 2:
				manager.registerContact();
				break;
			case 3:
				manager.deleteContact();
				break;
			case 4:
				manager.searchContact();
				break;
			case 5:
				manager.modifyContact();
				break;
			case 6:
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook m = new PhoneBook();
		m.run();
	}
}
