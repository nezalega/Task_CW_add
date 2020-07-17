package Task_11;

abstract class Shape {

    private String color;

    public Shape() {
        super();
    }

    public Shape(String color) {
        super();
        this.color = color;
    }

    abstract void draw();
    abstract boolean equals();

}