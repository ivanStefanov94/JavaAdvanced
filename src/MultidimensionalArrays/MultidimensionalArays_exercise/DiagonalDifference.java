package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];

        for (int rows = 0; rows < size; rows++) {
            matrix[rows] = Arrays.stream(scan.nextLine().split("\\s+"))
                                    .mapToInt(Integer::parseInt).toArray();
        }

        int primaryDiagonalSum = primaryDiagonal(matrix, size);
        int secondaryDiagonalSum = secondaryDiagonal(matrix, size);

        int result  = primaryDiagonalSum - secondaryDiagonalSum;

        System.out.println(Math.abs(result));

    }

    private static int secondaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size ; col++) {
                if((row + col) == size-1 ){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int primaryDiagonal(int[][] matrix, int size) {

        int sum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col){
                    sum+=matrix[row][col];
                }
            }
        }
        return sum;
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
