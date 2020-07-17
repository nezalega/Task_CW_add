package Task_1;
//https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks

public class Phone {



    private int number;
    private int model;
    private int weight;

    public Phone(){
        super();
    }

    public Phone(int number, int model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getModel(){
        return model;
    }

    public void setModel(int model){
        this.model = model;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println(name + " is calling.");
    }

    public static void receiveCall(String name, int number){
        System.out.println(name + " " + number + " is calling.");
    }

    public static void sendMessage(int...ph){
        for(int i = 0; i < ph.length; i++){
            System.out.print(ph[i] + " ");
        }
    }
}

