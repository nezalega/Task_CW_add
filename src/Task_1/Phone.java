package Task_1;
//https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks

public class Phone {

    private String model;
    private double weight;
    private int number;
    private String callerName = "Misha";


    public static class receiveCall {
        String name;

         String getName() {
         return name ;
        }

        void setName(String name) {
            name = "Wowa";
        }
    }

//        static void receiveCall(String callerName1) {
//        callerName1 = "Debil";
//            System.out.println("Zvonit" + callerName1);
//
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Phone (String model, int number, double weight){
   //     super();
        this(model, number); // вызов конструктора с тремя параметрами конструктор с двумя
//        this.model = model;
//        this.number = number;
        this.weight = weight;

    }
    public Phone (String model, int number) {
        super();
        this.model = model;
        this.number = number;
    }
    public Phone () {

    }
    public static void main(String[] args) {
        Phone ph1 = new Phone("Siemens", 60, 5);
        Phone ph2 = new Phone("Nokia", 3310, 10);
        Phone ph3 = new Phone("HTC", 0, 1.5);

     //  ph1.setModel("RAINBOW");
     //   ph1.setCaller("LOH");
        receiveCall rc = new receiveCall();
        rc.name = "Имя";


        System.out.println(ph1.model + " " + ph1.number + " " + ph1.weight);
        System.out.println(ph2.model + " " + ph2.number + " " + ph2.weight);
        System.out.println(ph3.model + " " + ph3.number + " " + ph3.weight);
        System.out.println(ph1.model + " " + rc.name );
    }

}

