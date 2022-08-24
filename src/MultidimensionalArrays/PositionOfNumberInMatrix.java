package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOfNumberInMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = readArray(scan.nextLine());

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols, scan);

        int number = Integer.parseInt(scan.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int current = matrix[row][col];
                if(current == number){
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }

        }
        if(!isFound){
            System.out.println("not found");
        }

    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scan.nextLine());
        }
        return matrix;
    }

    private static int[] readArray(String nextLine) {
        return Arrays.stream(nextLine.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
