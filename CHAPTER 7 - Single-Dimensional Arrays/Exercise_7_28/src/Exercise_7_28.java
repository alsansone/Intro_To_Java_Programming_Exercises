import java.util.Scanner;

/** Math: combinations */
public class Exercise_7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;
        int[] n = new int[SIZE];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < SIZE; i++) {
            n[i] = input.nextInt();
        }

        for (int i = 0; i < SIZE; i++)
            for (int j = i + 1; j < SIZE; j++)
                System.out.println(n[i] + " " + n[j]);
    }
}
