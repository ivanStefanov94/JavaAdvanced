package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = readArray(scan.nextLine());

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols, scan);
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
