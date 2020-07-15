package Task_3;

import java.util.Arrays;

public class Matrix{

//    int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
//    System.out.printLn(Arrays.deepToString(myArray));

    int [][] myArray = {{5,7,3,17}, {7,0,1,12}}; //объявили массив и заполнили его элементами

    {

        for (int i = 0; i < 2; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + myArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
    public static class MatrixMulty{ // умножение матриц

        int [][] twoDimArray1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] twoDimArray2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        //процесс умножения матриц
        int[][]twoDimArray3 = new int [twoDimArray1.length][twoDimArray2[0].length];{
        for (int i=0; i<twoDimArray3[0].length; i++){
                for (int j=0; j<twoDimArray3.length; j++){
                    int k;
                    for (k=0; k<twoDimArray1[0].length; k++) {
                    twoDimArray3[i][j] = twoDimArray3[i][j] + twoDimArray1[i][k] * twoDimArray2[k][j];
                }}}

        for (int i = 0; i < twoDimArray3.length; i++) { //вывод на экран
            for (int j = 0; j < twoDimArray3[0].length; j++) {
                System.out.print(" " + twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }
    }}
    public static void main(String[] args) {
        Matrix neo = new Matrix();

        System.out.println("++++++++++++++++++++++");
        MatrixMulty z = new MatrixMulty();

        System.out.println("++++++++++++++++++++++");
        System.out.println(neo.myArray.length);

    }
}
