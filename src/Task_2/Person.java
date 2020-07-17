package Task_2;

public class Person {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person (){

    }
    public void move() {
        System.out.println("Такой-то " + fullName + " говорит");
    }
    public void talk() {
        System.out.println("Такой-то в talk " + fullName + " говорит");
    }
        public static void main(String[] args) {

        Person prsn1 = new Person();
        Person prsn2 = new Person("Petya",65);
        prsn2.move();
        prsn2.talk();
            System.out.println(prsn2.age + " " + prsn2.fullName);
        }}

