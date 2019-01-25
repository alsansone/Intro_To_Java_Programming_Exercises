/** Compute PI */
public class Exercise_5_25 {
    public static void main(String[] args) {
        for (int i = 10_000; i <= 100_000; i += 10_000) {
            double sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += Math.pow(-1, j+1) / (2 * j - 1);
            }
            sum *= 4;
            System.out.printf("PI approximated at i = %d is %f\n", i, sum);
        }
    }
}
