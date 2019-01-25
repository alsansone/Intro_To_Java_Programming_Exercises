/** Summation */
public class Exercise_5_35 {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1, j = 2; j <= 625; i++, j++) {
            sum += 1.0 / (Math.sqrt(i) + Math.sqrt(j));
        }
        System.out.println("The sum is " + sum);
    }
}
