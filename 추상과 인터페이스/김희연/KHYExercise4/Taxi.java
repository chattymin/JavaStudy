package KHYExercise4;

public class Taxi implements Vehiclable
{
	int speed;
	public void run()
	{
		System.out.println("�ýð� "+speed+"km�� �޸��ϴ�.");
	}
	public void stop() 
	{
		System.out.println("�ýð� ����ϴ�.");
	}
	public void setSpeed(int speed)
	{
		if(speed<0)
			System.out.println("�ӵ��� ������ �� �����ϴ�.");
		else if(speed>180)
			System.out.println("�ýð� �� �� �ִ� �ְ� �ӵ��� �Ѿ����ϴ�.");
		else
			this.speed=speed;
	}
}
