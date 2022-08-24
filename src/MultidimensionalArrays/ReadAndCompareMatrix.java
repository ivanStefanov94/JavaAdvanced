package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndCompareMatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = readArray(scan.nextLine());

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] firstMatrix =readMatrix(rows, cols, scan);

        rowsAndCols = readArray(scan.nextLine());

        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

        int[][] secondMatrix =readMatrix(rows, cols, scan);

        if (matricesAreEqual(firstMatrix, secondMatrix)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int row = 0; row < firstMatrix.length ; row++) {
            int[] firstArray = firstMatrix[row];
            int[] secondArray = secondMatrix[row];

            if(firstArray.length != secondArray.length){
                return false;
            }

            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]){
                    return false;
                }
            }
            
        }
        return true;
    }

    public static int[][] readMatrix(int rows, int cols, Scanner scan){

        int[][] matrix = new int[rows][cols];

        //пълнене на матрицата
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan.nextLine());

        }
            return matrix;
    }

    public static void printMatrix(int[][] matrix){

        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        //печатане на матрицата
//        Input:
//        2 3
//        1 2 3
//        2 1 3
//        Output:
//        1 2 3
//        2 1 3

//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }
    }

    private static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}

//        2 3
//        1 2 3
//        2 1 3
//        2 3
//        1 2 3
//        2 1 3
//        output: equal


//        2 3
//        1 2 3
//        4 5 6
//        2 2
//        1 3
//        4 5
//        output: not equal