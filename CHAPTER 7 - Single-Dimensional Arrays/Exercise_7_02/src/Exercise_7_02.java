import java.util.Scanner;

/** Reverse the numbers entered */
public class Exercise_7_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] numbers = new int[10];
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = input.nextInt();
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}
