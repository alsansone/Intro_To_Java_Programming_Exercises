/** Compute e */
public class Exercise_5_26 {
    public static void main(String[] args) {
        for (int i = 10_000; i <= 100_000; i += 10_000) {
            double e = 1.0;
            double item = 1.0;
            for (int j = 2; j <= i; j++) {
                e += item;
                item /= j;
            }
            System.out.println("i = " + i + ": e = " + e);
        }
    }
}
