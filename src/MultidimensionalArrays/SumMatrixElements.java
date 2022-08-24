package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = readArray(scan.nextLine());

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int sum = 0;

        int[][] matrix = readMatrix(rows, cols, scan);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int current = matrix[row][col];
                sum+=current;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);



    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan.nextLine());

        }
        return matrix;
    }

    private static int[] readArray(String nextLine) {
        return Arrays.stream(nextLine.split(", "))
                                .mapToInt(Integer::parseInt).toArray();
    }
}

//        Input:
//        3, 6
//        7, 1, 3, 3, 2, 1
//        1, 3, 9, 8, 5, 6
//        4, 6, 7, 9, 1, 0
//        Output:
//        3 --> rows
//        6 --> cols
//        76 --> sum of all numbers in matrix