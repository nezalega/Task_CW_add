package Task_11;

    public class Circle extends Shape {

        private int x;
        private int y;
        private String color;

        public Circle(int x, int y, String color) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public Circle() {
            super();
        }

        public void draw() {
            System.out.println("circle " + color + " is printed " + x + " " + y);
        }

//	public static boolean equals(Circle c, Circle cc) {
//		boolean a;
        //	a = (c.x ==cc.x && c.y == cc.y && c.color == cc.color);
        //	return a;
//	}

        public boolean equals() {
            return false;
        }
    }
