public class Exercise_6_01 {
    public static void main(String[] args) {
        // Declare number of lines to print
        final int NUMBER_OF_LINES = 10;
        // Loop through 1-100 adding 1 each iteration
        for (int i = 1; i <= 100; i++) {
            // Determine if line is completed and can start new line
            if (i % 10 == 0) {
                // Print line using getPentagonalNumber method
                System.out.printf("%-7s\n", getPentagonalNumber(i));
            } else
                // Print number using getPentagonalNumber method
                System.out.printf("%-7s", getPentagonalNumber(i));
        }
    }
    // Method to determine the pentagonal number
    public static int getPentagonalNumber(int n) {
        // Formula to determine pentagonal number
        return (n * (3 * n - 1)) / 2;
    }
}
