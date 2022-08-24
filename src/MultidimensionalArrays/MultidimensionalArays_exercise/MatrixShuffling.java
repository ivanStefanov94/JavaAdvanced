package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.Arrays;
import java.util.Scanner;


public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int rows = array[0];
        int cols = array[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+"))
                                    .mapToInt(Integer::parseInt).toArray();
        }

        String input = scan.nextLine();

        while(!input.equals("END")){

            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int row1 = Integer.parseInt(tokens[1]);
            int col1 = Integer.parseInt(tokens[2]);
            int row2 = Integer.parseInt(tokens[3]);
            int col2 = Integer.parseInt(tokens[4]);

            if(command.equals("swap")){
                if (tokens.length == 5){
                    if(row1 <= rows && row2 <= rows && row1 >=0 && row2 >=0
                            && col1 <= cols && col2 <= cols && col1 >=0 && col2 >=0){

                        int element1 = matrix[row1][col1];
                        int element2 = matrix[row2][col2];

                       matrix[row1][col1] = element2;
                       matrix[row2][col2] = element1;

                       printMatrix(matrix);

                    }else{
                        System.out.println("Invalid input!");
                    }
                }else{
                    System.out.println("Invalid input!");
                }


            }else{
                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }

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

//        2 3
//         1 2 3
//         4 5 6
//         swap 0 0 1 1
//         swap 10 9 8 7
//         swap 0 1 1 0
//         END
//
//         5 2 3
//         4 1 6
//         Invalid input!
//         5 4 3
//         2 1 6