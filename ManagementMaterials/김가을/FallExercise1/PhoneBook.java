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
			System.out.println("############ ����ó ���� ############");
			System.out.print("(1) ����ó ���  ");
			System.out.print("(2) ���� ���  ");
			System.out.print("(3) ����  ");
			System.out.print("(4) �˻�  ");
			System.out.print("(5) ����  ");
			System.out.print("(6) ������  ");
			System.out.print("... ");
			num = manager.scan.nextInt();
			if (num >= 1 && num <= 6)
				return num;
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���...");
		}
	}
	// inputMenu�� �̿��Ͽ� �޴��� �Է¹ް� �����ϵ��� �ۼ��Ͻÿ�.
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
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook m = new PhoneBook();
		m.run();
	}
}