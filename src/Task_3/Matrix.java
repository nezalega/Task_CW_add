package Task_3;

public class Matrix {
    private double[][] mtrx;
    private int lines;
    private int columns;

    public Matrix(){
        super();
    }

    public Matrix(double[][] mtrx, int lines, int columns){
        this.columns = columns;
        this.mtrx = mtrx;
        this.lines = lines;
    }

    public void setMtrx(double[][] mtrx){
        this.mtrx = mtrx;
    }

    public double[][] getMtrx() {
        return mtrx;
    }

    public int getLines(){
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public void setColumns(int columns){
        this.columns = columns;
    }

    public int getColumns(){
        return columns;
    }

    public void showMatrix(){
        System.out.println();
        System.out.println("matrix ");
        for(int i = 0; i < mtrx.length; i++){
            for(int j = 0; j < mtrx[i].length; j++){
                System.out.print(mtrx[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addition(Matrix matr1, Matrix matr2){
        System.out.println();
        System.out.println("addition: ");
        for(int i = 0; i < matr1.getLines(); i++){
            for(int j = 0; j < matr1.getColumns(); j++){
                System.out.print((matr1.mtrx[i][j] + matr2.mtrx[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void multiplication(int a){
        System.out.println();
        System.out.println("multiplication by " + a);
        for(int i = 0; i < mtrx.length; i++){
            for(int j = 0; j < mtrx[i].length; j++){
                System.out.print((mtrx[i][j] * a) + " ");
            }
            System.out.println();
        }
    }

}