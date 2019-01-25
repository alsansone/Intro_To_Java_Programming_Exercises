import java.util.Scanner;

public class Exercise_8_06 {
    public static void main(String[] args) {

        double[][] matrix1 = getArray();
        double[][] matrix2 = getArray();
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of the matrices is");
        printResult(matrix1, matrix2, matrix3);
    }
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];

        System.out.print("Enter two 3-by-3 matrices: ");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = input.nextDouble();
            }
        }
        return array;
    }
    public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {

        double[][] result = new double[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < result. length; j++) {
                for (int k = 0; k < result[0].length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
    // Prints Results
    public static void printResult(double[][] m1, double[][] m2, double[][] m3) {
        // Loop through the rows of the matrices
        for (int i = 0; i < m1.length; i++) {
            // Loops through column of first array and prints values
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);
            // Condition to determine where to put the * symbol
            if (i == m1.length / 2)
                System.out.print( "  *  " );
            else
                System.out.print( "     " );
            // Loops through column of 2nd array and prints values
            for (int j = 0; j < m2[0].length; j++)
                System.out.print(" " + m2[i][j]);
            // Condition to determine where to put the = symbol
            if (i == m1.length / 2)
                System.out.print( "  =  " );
            else
                System.out.print( "     " );
            // Loops through columns of 3rd array and prints values
            for (int j = 0; j < m3[0].length; j++)
                System.out.printf("%-4.1f ", m3[i][j]);

            System.out.println();
        }
    }
}
