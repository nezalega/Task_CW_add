package Task_1;

public class Main {

    public static void main(String[] args) {

        Phone first = new Phone(123_45_67, 11, 200);
        Phone second = new Phone(255_44_66, 22, 210);
        Phone third = new Phone(345_52_74, 33, 275);


        System.out.println("1st phone info: ");
        System.out.println("number " + first.getNumber() +  ", model " + first.getModel() +
                ", weight " + first.getWeight());
        System.out.println("2nd phone info: ");
        System.out.println("number " + second.getNumber() +  ", model " + second.getModel() +
                ", weight " + second.getWeight());
        System.out.println("3rd phone info: ");
        System.out.println("number " + third.getNumber() +  ", model " + third.getModel() +
                ", weight " + third.getWeight());

        Phone.receiveCall("olga", 3654879);
        Phone.sendMessage(5678, 45678,432234);


    }
}


