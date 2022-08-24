package ExamPreparation.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSwapElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = array[0];
        int cols = array[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scan.nextLine().split(" ");
        }

        String input = scan.nextLine();

        while (!input.equals("END")) {

            String[] tokens = input.split("\\s+");
            if (tokens.length == 5) {
                String command = tokens[0];
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                if (command.equals("swap") && row1 <= rows && row2 <= rows
                        && col1 <= cols && col2 <= cols) {
                    String element1 = matrix[row1][col1];
                    String element2 = matrix[row2][col2];
                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            matrix[row1][col1] = element2;
                            matrix[row2][col2] = element1;
                        }
                    }
                    printMatrix(matrix, rows, cols);

                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            input = scan.nextLine();
        }

    }

    public static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
