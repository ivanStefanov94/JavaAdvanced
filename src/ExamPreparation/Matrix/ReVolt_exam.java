package ExamPreparation.Matrix;

import java.util.Scanner;

public class ReVolt_exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int linesCount = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[size][size];

        //position [0] -> row of the player
        //position [1] -> col of the player
        int[] position = new int[2];


        //въвеждане на матрицата и намиране на индекса на стартовата позиция
        for (int row = 0; row < size; row++) {
            String line = scan.nextLine();
            matrix[row] = line.toCharArray();

            if(line.contains("f")){
                position[0] = row;
                position[1] = line.indexOf("f");
            }
        }


        boolean playerWon = false;

        while(linesCount-- > 0 && !playerWon){
            String command = scan.nextLine();

            //UP - row-1, col 0
            //DOWN - row+1, col 0
            //LEFT - row 0, col-1
            //RIGHT - row 0, col+1

            if(command.equals("up")){
                playerWon = movePlayer(position, matrix, -1, 0);
            }else if(command.equals("down")){
                playerWon = movePlayer(position, matrix, 1, 0);
            }else if(command.equals("left")){
                playerWon = movePlayer(position, matrix, 0, -1);
            }else if(command.equals("right")){
                playerWon = movePlayer(position, matrix, 0, 1);
            }
        }

        if(playerWon){
            System.out.println("Player won!");
        }else{
            System.out.println("Player lost!");
        }

        printMatrix(matrix, size, size);

    }


    //POSITION MODIFIER
    private static boolean movePlayer(int[] position, char[][] matrix, int rowModification, int colModification) {
        //UP - row-1
        //original position
        int row = position[0];
        int col = position[1];
        //new position
        int newRow = ensureIndexIsInBounds(row + rowModification, matrix.length);
        int newCol = ensureIndexIsInBounds(col + colModification, matrix.length);

        boolean hasWon = false;

        //finish - Winning the game, ending the program
        if (matrix[newRow][newCol] == 'F'){
            hasWon = true;
        //Bonus- ако стъпиш на бонус, правиш допълнителна стъпка в посоката в която си тръгнал
        }else if(matrix[newRow][newCol] == 'B'){
            newRow = ensureIndexIsInBounds(newRow + rowModification, matrix.length);
            newCol = ensureIndexIsInBounds(newCol + colModification, matrix.length);
            if(matrix[newRow][newCol] == 'F'){
                hasWon = true;
            }
        //Trap - като стъпиш на капан, се връщаш на позицията от която си дошъл(не прогресираш, седиш на място)
        }else if(matrix[newRow][newCol] == 'T'){
            newRow = row;
            newCol = col;
        }

        //сетваме "-" на старата позиция
        matrix[row][col] = '-';
        //сетваме "f" на новата позиция
        matrix[newRow][newCol] = 'f';
        //позициите от които си дошъл стават равни на новия ред и новата колона
        position[0] = newRow;
        position[1] = newCol;
        return hasWon;
    }

    //ако излезе от матрицата да отиде в другия край на матрицата
    private static int ensureIndexIsInBounds(int index, int bounds) {
        if(index<0 ){
            index = bounds - 1;
        }
        else if(index >= bounds){
            index = 0;
        }
        return index;
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
