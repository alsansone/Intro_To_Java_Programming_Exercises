import java.util.Scanner;

/** Strictly identical arrays */
public class Exercise_7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list 1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list 2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        System.out.print("Two lists ");
        System.out.print(equals(list1, list2) ? "are" : "are not");
        System.out.println(" strictly identical");

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i])
                return false;

        return true;
    }
}
