import java.util.Scanner;

/** Count occurrence of numbers */
public class Exercise_7_03 {
    public static void main(String[] args) {
        int[] counts = new int[101];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int number = input.nextInt();
        while (number != 0) {
            counts[number]++;
            number = input.nextInt();
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] >= 1) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
            }
        }
    }
}
