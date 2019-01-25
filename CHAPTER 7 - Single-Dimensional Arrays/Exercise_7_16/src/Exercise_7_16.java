import java.util.Arrays;

/** Execution time */
public class Exercise_7_16 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        int key = (int)(Math.random() * 100_000);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100_000);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(linearSearch(array, key));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Linear search: " + executionTime + " ms");

        Arrays.sort(array);
        startTime = System.currentTimeMillis();
        System.out.println(binarySearch(array, key));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Binary search: " + executionTime + " ms");


    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
