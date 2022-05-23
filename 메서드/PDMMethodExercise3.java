class TestNumber{
    int num;
    TestNumber(int a){this.num = a;}
}
public class PDMMethodExercise3 {
    public static void sum(TestNumber a){
        a.num += 400;
        System.out.println(a.num);
    }
    public static void main(String[] args) {
        TestNumber number = new TestNumber(100);
        sum(number);
        System.out.println(number.num);
    }
}