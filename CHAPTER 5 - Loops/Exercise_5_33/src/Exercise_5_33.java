/** Perfect number */
public class Exercise_5_33 {
    public static void main(String[] args) {

        int sum = 0;
        int numberOfPerfectNumbers = 0;

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " is a perfect number");
                numberOfPerfectNumbers++;
            }
            sum = 0;
        }
        System.out.println("There are " + numberOfPerfectNumbers + " perfect numbers");
    }
}
