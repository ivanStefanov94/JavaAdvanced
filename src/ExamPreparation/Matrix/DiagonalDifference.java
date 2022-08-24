package ExamPreparation.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+"))
                                    .mapToInt(Integer::parseInt).toArray();
        }

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row == col){
                    firstDiagonalSum+= matrix[row][col];
                }
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(col == size-1-row){
                    secondDiagonalSum += matrix[row][col];
                }
            }
        }
        System.out.println(Math.abs(firstDiagonalSum-secondDiagonalSum));

    }
    public static void printMatrix(int[][] matrix, int rows, int cols){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
