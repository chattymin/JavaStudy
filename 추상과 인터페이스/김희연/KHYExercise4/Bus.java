package KHYExercise4;

public class Bus implements Vehiclable
{
	int speed; 
	public void run()
	{
		System.out.println("������ "+speed+"km�� �޸��ϴ�.");
	}
	public void stop() 
	{
		System.out.println("������ ����ϴ�.");
	}
	public void setSpeed(int speed)
	{
		if(speed<0)
			System.out.println("�ӵ��� ������ �� �����ϴ�.");
		else if(speed>150)
			System.out.println("������ �� �� �ִ� �ְ� �ӵ��� �Ѿ����ϴ�.");
		else
			this.speed=speed;	
	}
}
