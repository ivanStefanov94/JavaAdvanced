package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int rows = scan.nextInt();
        int cols = scan.nextInt();

        String[][] matrix = new String[rows][cols];
        char startLetter = 'a';

        for (int row = 0; row < rows; row++) {
            int add = 0;
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + startLetter + (char)(startLetter+add) + startLetter;
                matrix[row][col] = palindrome;
                add++;
            }
            startLetter = (char)(startLetter+1);

        }

            printMatrix(matrix);
    }
    private static void printMatrix(String[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
