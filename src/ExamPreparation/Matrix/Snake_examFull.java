package ExamPreparation.Matrix;

import java.util.Scanner;

public class Snake_examFull {
    //по този начин можем да ползваме food и в методите(без да го подаваме в метода)
    public static  int food = 0;

    //индекси на реда и колоната на S(стартовата позиция), static за да може да ги достъпваме в метода
    public static int rowSnake = 0;
    public static int colSnake = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[size][size];


        for (int row = 0; row < size; row++) {
            String line = scan.nextLine();
            matrix[row] = line.toCharArray();

            if(line.contains("S")){
                rowSnake = row;
                colSnake = line.indexOf("S");
            }

        }

        while(food < 10){
            String command = scan.nextLine();

            if(command.equals("up")){
                if(isOutOfBounds(rowSnake -1, colSnake, matrix )){
                    break;
                }else{
                    if (!moveSnake(rowSnake, colSnake, rowSnake-1, colSnake, matrix)) {
                        rowSnake--;
                    }
                }
            }else if(command.equals("down")){
                if(isOutOfBounds(rowSnake + 1, colSnake, matrix )){
                    break;
                }else{
                    if (!moveSnake(rowSnake, colSnake, rowSnake+1, colSnake, matrix)) {
                        rowSnake++;
                    }
                }
            }else if(command.equals("left")){
                if(isOutOfBounds(rowSnake, colSnake -1, matrix )){
                    break;
                }else{
                    if (!moveSnake(rowSnake, colSnake, rowSnake, colSnake - 1, matrix)) {
                        colSnake--;
                    }
                }
            }else if(command.equals("right")){
                if(isOutOfBounds(rowSnake, colSnake + 1, matrix )){
                    break;
                }else{
                    if (!moveSnake(rowSnake, colSnake, rowSnake, colSnake + 1, matrix)) {
                        colSnake++;
                    }
                }
            }

        }

        if(food<10){
            System.out.println("Game over!");
            System.out.println("Food eaten: " + food);
        }else{
            System.out.println("You won! You fed the snake.");
            System.out.println("Food eaten: " + food);
        }


        printMatrix(matrix, size, size);

    }

    private static boolean moveSnake(int oldRow, int oldCol, int newRow, int newCol, char[][] matrix) {
        if(matrix[newRow][newCol] == '-'){
            matrix[newRow][newCol] = 'S';
        }else if (matrix[newRow][newCol] == '*'){
            matrix[newRow][newCol] = 'S';
            food++;
        }
        else if(matrix[newRow][newCol] == 'B'){
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if(matrix[row][col] == 'B' && row != newRow || col != newCol){
                        matrix[row][col] = 'S';
                        matrix[newRow][newCol] = '.';
                        matrix[oldRow][oldCol] = '.';
                        rowSnake = row;
                        colSnake = col;
                        return true;
                    }
                }
            }
        }
        matrix[oldRow][oldCol] = '.';
        return false;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    public static void printMatrix(char[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}

