package ClassAndInheritance;

class ClassTest_1 {
    private String name;
    private int salary;

    public ClassTest_1() {}

    ClassTest_1(String n, int s) {
        name = n;
        salary = s;
    }

    public String getName() {return name;}

    public int getSalary() {return salary;}

    public void getInformation() {System.out.println("이름:" + name + " 연봉:" + salary);}

    public void prn() {System.out.println("수퍼클래스");}
} // end ClassTest_1

//여기에  ClassTest_2클래스를 구현하세요.///////
class ClassTest_2 extends ClassTest_1{
    private String department;

    public ClassTest_2(String n, int s, String d){
        super(n,s);
        this.department = d;
    }

    public void prn() {System.out.println("서브클래스");}

    public void callSuperThis(){
        super.prn();
        this.prn();
    }

    public void getInformation() {
        System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department);
    }
}

public class PDMExercise4 {

    public static void main(String[] args) {
        // 테스트를 할때는 아래 주석을 해제하세요.

        ClassTest_2 ct = new ClassTest_2("이지나", 3000, "교육부");
        ct.callSuperThis();
        ct.getInformation();

    }// end main()

}// end class