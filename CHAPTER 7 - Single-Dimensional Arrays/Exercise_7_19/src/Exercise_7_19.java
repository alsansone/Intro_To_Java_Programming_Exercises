import java.util.Scanner;

/** Sorted? */
public class Exercise_7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int number = input.nextInt();
        int[] list = new int[number];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.println("The list is " + (isSorted(list) ? "already" : "not") + " sorted");
    }

    public static boolean isSorted(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i+1])
                return false;
        }
        return true;
    }
}
