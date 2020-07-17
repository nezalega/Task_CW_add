package Task_11;

public class Rectangle extends Shape {

    private int x1;
    private int y1;
    private String color;

    public Rectangle(int x1, int y1, String color) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
    }

    public void draw() {
        System.out.println("rectangle " + color + "  is printed " + x1 + " " + y1);
    }

    public String getColor() {
        return color;
    }

    public boolean equals() {
        return false;
    }

}
