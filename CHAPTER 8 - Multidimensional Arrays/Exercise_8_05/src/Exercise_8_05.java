import java.util.Scanner;

public class Exercise_8_05 {
    public static void main(String[] args) {

        double[][] matrix1 = getArray();
        double[][] matrix2 = getArray();
        double[][] matrix3 = addMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);

    }
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][3];

        System.out.print("Enter two " + m.length + "-by-" + m[0].length + " matrices: ");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        return m;
    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        if (a.length != b.length && a[0].length != b[0].length) {
            System.out.println("Matrices must have the same dimensions");
            System.exit(1);
        }
            for (int row = 0; row < c.length; row++) {
                for (int col = 0; col < c[row].length; col++) {
                    c[row][col] = a[row][col] + b[row][col];
                }
            }
        return c;
    }

    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }

    public static void print(double[][] a, double[][] b, double[][] c) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(a, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(b, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(c, i);
            System.out.println();
        }
    }
}
