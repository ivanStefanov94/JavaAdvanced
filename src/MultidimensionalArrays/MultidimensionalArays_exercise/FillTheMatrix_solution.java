package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.Scanner;

public class FillTheMatrix_solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] input = scan.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")){
            fillPatternA(matrix, size);
        }else if(pattern.equals("B")){
            fillPatternB(matrix, size);
        }
        printMatrix(matrix);

    }

    private static void fillPatternB(int[][] matrix, int size) {
        int startNumber = 1;

        for (int col = 0; col < size; col++) {
            if (col%2 == 0){
            for (int row = 0; row < size; row++) {
              matrix[row][col] +=startNumber;
              startNumber++;
            }}else{
            for (int row = size-1; row >= 0 ; row--) {
                matrix[row][col] += startNumber;
                startNumber++;
            }}
        }

    }

    private static void fillPatternA(int[][] matrix, int size) {
        int startNumber = 1;

        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] += startNumber;
                startNumber++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}

//3, A
//1 4 7
//2 5 8
//3 6 9

//3, B
//1 6 7
//2 5 8
//3 4 9