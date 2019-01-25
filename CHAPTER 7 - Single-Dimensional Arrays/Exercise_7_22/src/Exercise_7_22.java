/** Game: Eight Queens */
public class Exercise_7_22 {
    public static void main(String[] args) {
        // Queen positions
        int[] queens = new int[8];
        // Set array to -1 meaning no queen found
        for (int i = 0; i < 8; i++)
            queens[i] = -1;
        // Initial queen at (0, random col)
        queens[0] = (int)(Math.random() * 8);
        // Number of queens positioned
        int k = 1;

        while (k >= 0 && k <= 7) {
            int j = findPosition(k, queens);
            // Check j if < 0 if not put j in array
            if (j < 0) {
                queens[k] = -1;
                // Go up a row
                k--;
            } else {
                queens[k] = j;
                k++;
            }
        }

        printBoard(queens);
    }

    public static int findPosition(int k, int[] queens) {
        // which row to start on
        int start = (k == -1 ? 0 : queens[k] + 1);
        // loop through each column in row to see if queen can be placed
        for (int i = start; i < 8; i++)
            if (isValid(k, i, queens))
                return i;

        return -1;
    }
    // Return true if a queen can be placed at (k, j)
    public static boolean isValid(int k, int j, int[] queens) {
        // Check jth column
        for (int i = 0; i < k; i++)
            if (queens[i] == j)
                return false;
        // Check major diagonal
        for (int row = k - 1, column = j - 1; row >= 0 && column >= 0; row--, column--)
            if (queens[row] == column)
                return false;
        // Check minor diagonal
        for (int row = k - 1, column = j + 1; row >= 0 && column <= 7; row--, column++)
            if (queens[row] == column)
                return false;

        return true;
    }
    // Print board
    public static void printBoard(int[] queens) {
        for (int i = 0; i < 8; i++)
            System.out.println(i + "," + queens[i]);
        System.out.println();

        // Display the output
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < queens[i]; j++)
                System.out.print("| ");
            System.out.print("|Q|");
            for (int j = queens[i] + 1; j < 8; j++)
                System.out.print(" |");
            System.out.println();
        }
    }
}
