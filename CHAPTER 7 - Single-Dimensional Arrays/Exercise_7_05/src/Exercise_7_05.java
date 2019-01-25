import java.util.Scanner;

/** Print distinct numbers */
public class Exercise_7_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        int[] numbers = new int[10];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();

            if (isDistinct(numbers, number)) {
                numbers[count] = number;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int number : numbers) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isDistinct(int[] array, int number) {
        for (int i1 : array) {
            if (number == i1) {
                return false;
            }
        }
        return true;
    }
}
