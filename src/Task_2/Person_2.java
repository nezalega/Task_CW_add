package Task_2;

public class Person_2 {
    private String fullName;
    private int age;

    public Person_2(){
        super();
    }

    public Person_2(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void move(){
        System.out.println("Person "+ getFullName() + " is moving");
    }

    public void talk(){
        System.out.println("Person " + getFullName() + " is talking");
    }

    public static void main(String[] args) {

        Person chelovek1 = new Person();
        Person chelovek2 = new Person("Katya", 18);

        chelovek1.talk();
        chelovek2.talk();
        chelovek2.move();
    }

}