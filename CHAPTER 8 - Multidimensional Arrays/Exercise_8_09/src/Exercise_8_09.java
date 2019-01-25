import java.util.Scanner;

public class Exercise_8_09 {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        char player = 'X';

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(updateBoard(board, player));
            }
            System.out.println();
        }

    }

    public static char[][] updateBoard(char[][] board, char player) {
        Scanner input = new Scanner(System.in);
        char[][] tBoard = new char[3][3];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                System.out.print("Enter a row for player " + player + ": ");
                int row = input.nextInt();
                System.out.print("Enter a column for player " + player + ": ");
                int column = input.nextInt();

                board[row][column] = player;
            }
        }

        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
        return tBoard;
    }
}
