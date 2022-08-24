package ExamPreparation.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int rows = array[0];
        int cols = array[1];

        String[][] matrix = new String[rows][cols];

        char startLetter = 'a';

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindrome;
            }
            startLetter++;
        }
        printMatrix(matrix, rows, cols);

    }
    public static void printMatrix(String[][] matrix, int rows, int cols){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
