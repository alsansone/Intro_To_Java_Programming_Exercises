import java.util.Scanner;

/**
 * Eliminate duplicates
 */
public class Exercise_7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] distinctList = eliminateDuplicates(list);

        for (int i : distinctList) {
            if (i > 0)
                System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int index = 0;

        for (int i1 : list) {
            if (linearSearch(distinctList, i1) == -1) {
                distinctList[index] = i1;
                index++;
            }
        }
        return distinctList;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
