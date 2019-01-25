import java.util.Scanner;

/** Display matrix of 0s and 1s */
public class Exercise_6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
