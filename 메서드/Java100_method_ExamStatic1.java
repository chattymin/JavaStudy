// 정적메소드가 아닌 동적메소드인 상태에서 객체 생성 안한 채 메소드 호출함.
// 정적메소드로 변경. 
public class Java100_method_ExamStatic1 {
	public static void helloWorld() {
		System.out.println("Hello,World~^0^");
	}

	public static void main(String[] args) {
		helloWorld();
	}

}
