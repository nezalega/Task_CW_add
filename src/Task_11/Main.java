package Task_11;

    public class Main {
        public static void main(String[] args) {

            Circle c1 = new Circle(1, 5, "yellow");
            Circle c2 = new Circle(1, 5, "yellow");
            Circle c3 = new Circle(1, 5, "black");

            Rectangle r1 = new Rectangle(5, 3, "green");
            Rectangle r2 = new Rectangle(3, 1, "grey");
            Rectangle r3 = new Rectangle(1, 2, "pink");

            Shape[] sh = {c1,r1,c2,r2,c3,r3};
            for(int i = 0; i < sh.length; i++) {
                sh[i].draw();
            }

            //System.out.println(Circle.equals(c1, c2));
        }

    }