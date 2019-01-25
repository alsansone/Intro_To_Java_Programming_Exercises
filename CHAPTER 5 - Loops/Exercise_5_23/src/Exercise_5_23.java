/** Demonstrate cancellation errors */
public class Exercise_5_23 {
    public static void main(String[] args) {
        double seriesLeftToRight = 0;

        for (int n = 1; n <= 50000; n++) {
            seriesLeftToRight += 1.0 / n;
        }
        System.out.println("The sum from left to right is " + seriesLeftToRight);

        double seriesRightToLeft = 0;

        for (int n = 50000; n >= 1; n--) {
            seriesRightToLeft += 1.0 / n;
        }
        System.out.println("The sum from right to left is " + seriesRightToLeft);
    }
}
