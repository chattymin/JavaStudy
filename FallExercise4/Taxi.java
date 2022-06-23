package FallExercise4;

public class Taxi implements Vehiclable
{
	private int speed;
	
	@Override
	public void run()
	{
		System.out.println("택시가 "+this.speed+"로 달립니다.");
	}

	@Override
	public void stop()
	{
		System.out.println("택시가 멈춥니다.");
	}

	@Override
	public void setSpeed(int speed) 
	{
		if(speed < 0)
			System.out.println("속도는 음수일 수 없습니다.");
		else if(speed > 180)
			System.out.println("택시가 낼 수 있는 최고 속도를 넘었습니다.");
		else
			this.speed = speed;
	}
	
}
