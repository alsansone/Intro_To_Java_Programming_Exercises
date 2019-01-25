import java.util.Scanner;

/** Game: bean machine */
public class Exercise_7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] ballPath = ballPath(numberOfBalls, numberOfSlots);
        int max = max(ballPath);
        printGaltonBox(ballPath, max);

    }

    public static int[] ballPath(int balls, int slot) {
        char c;
        int numberOfRs;
        int[] slots = new int[slot];

        for (int i = 0; i < balls; i++) {
            numberOfRs = 0;
            for (int j = 0; j < slot-1; j++) {
                if ((int) (Math.random() * 2) == 1) {
                    c = 'L';
                } else {
                    c = 'R';
                    numberOfRs++;
                }
                System.out.print(c);
            }
            System.out.println();
            slots[numberOfRs]++;
        }
        return slots;
    }

    public static void printGaltonBox(int[] array, int max) {
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == max) {
                    System.out.print("0");
                    array[j]--;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            max--;
        }
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
