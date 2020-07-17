package Task_3;

public class Main {

    public static void main(String[] args) {

        double[][] mmm1 = {{1.1,2.1,3.1,4.0}, {2.2,2.1,2.2,2.5}, {1.0,1.2,1.0,1.0}};
        Matrix m1 = new Matrix(mmm1, 3,4);
        double[][] mmm2 = {{0.1,0.1,3.0,4.1}, {2.0,2.0,2.0,2.1}, {1.1,1.1,1.4,1.4}};
        Matrix m2 = new Matrix(mmm2, 3,4);

        m1.showMatrix();

        m2.showMatrix();

        Matrix.addition(m1, m2);
        m1.multiplication(2);
    }
}

