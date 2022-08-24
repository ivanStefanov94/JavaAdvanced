package MultidimensionalArrays.MultidimensionalArays_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire_ListMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        List<List<Integer>> matrix = new ArrayList<>();
        
        fillMatrix(matrix, rows, cols);

        String command = scan.nextLine();

        while(!command. equals("Nuke it from orbit")){

            String[] tokens = command.split(" ");
            int rowToDestroy = Integer.parseInt(tokens[0]); //
                                                            //----> position of element to destroy
            int colToDestroy = Integer.parseInt(tokens[1]);//
            int radius = Integer.parseInt(tokens[2]); //range of destruction

            //destroy up/down (radius times)
            for (int currentRow = rowToDestroy-radius; currentRow <= rowToDestroy + radius ; currentRow++) {

                matrix.get(currentRow).remove(colToDestroy);
            }
            //destroy left/right (radius times)
            for (int currentCol = colToDestroy-radius; currentCol <= colToDestroy + radius; currentCol++) {
               // matrix.get(currentCol).remove(rowToDestroy);

                matrix.get(rowToDestroy).remove(currentCol);
            }

            command = scan.nextLine();
        }

        printMatrix(matrix);
    }



    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // List matrix (List<List<Integer>>)
    private static void fillMatrix( List<List<Integer>> matrix, int rows, int cols) {

        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }

    }
}
