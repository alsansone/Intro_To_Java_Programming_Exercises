import java.util.Scanner;

public class Exercise_8_02 {
    public static void main (String[] args) {

        double[][] m = getArray();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }
    // Create a 2d array through user input
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[4][4];
        System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
    // Compute sum of diagonal numbers
    public static double sumMajorDiagonal(double[][] m) {
        double total = 0;

        for (int i = 0; i < m.length; i++) {
            total += m[i][i];
        }
        return total;
    }
}
