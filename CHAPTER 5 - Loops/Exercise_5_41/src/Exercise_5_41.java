import java.util.Scanner;

/** Occurrence of ma numbers */
public class Exercise_5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int numbers;
        int max = 0;
        int count = 0;

        while ((numbers = input.nextInt()) != 0) {
            if (numbers > max) {
                max = numbers;
                count = 1;
            } else if (numbers == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is "
                + count);
    }
}
