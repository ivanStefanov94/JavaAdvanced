package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.Scanner;

public class ArrayToMatrix5by5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int[][] matrix = fillMatrix(rows, cols);


        printMatrix(matrix);

    }

    private static int[][] fillMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int[] array = new int[rows*cols];
        int values = 1;

        for (int i = 0; i < rows*cols; i++) {
            array[i] = values;
            values++;
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                for (int i = array.length-1; i >= 0; i--) {
                    matrix[row][col] = array[i];
                    array[i]++;
                }
            }

        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}

//        5 5 --> създаване на масив с елементи от 1 до 25(5*5) и пълнене на матрица 5 на 5 с числата от масива
//
//        1 2 3 4 5
//        6 7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25