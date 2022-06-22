package AbstractAndInterface.PDMExercise4;

public class Bus implements Vehiclable {
    private int speed;

    @Override
    public void run() {
        System.out.println("버스가" + this.speed+"Km로 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("버스가 멈춥니다.");
    }

    @Override
    public void setSpeed(int speed) {
        if(speed < 0){
            System.out.println("속도는 음수일 수 없습니다.");
            return;
        }else if(speed > 150){
            System.out.println("버스가 낼 수 있는 최고 속도를 넘었습니다.");
        }

        this.speed = speed;
    }
}
