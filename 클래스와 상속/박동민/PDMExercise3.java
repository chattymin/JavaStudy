package ClassAndInheritance;

class Human{
    private String name;
    private int age;

    Human(String name, int age){this.name = name; this.age = age;}

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public String getName(){return name;}
    public int getAge(){return age;}
}

public class PDMExercise3 {
    public static void main(String[] args) {
        Human human[] = new Human[10];
        for(int i = 0; i < human.length; i++) human[i] = new Human(i+"번 후보자",20+i);

        for(int i = 0; i < human.length; i++) System.out.println(human[i].getName()+" ==> 나이 : "+human[i].getAge());
    }
}
