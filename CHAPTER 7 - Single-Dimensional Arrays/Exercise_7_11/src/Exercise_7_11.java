import java.util.Scanner;

/** Statistics: compute deviation */
public class Exercise_7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] num = new double[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }

        System.out.printf("The mean is %-5.2f\n", mean(num));
        System.out.printf("The standard deviation is %-7.5f", deviation(num));

    }

    public static double deviation(double[] x) {
        double deviation = 0.0;

        for (double x1 : x) {
            deviation += Math.pow(x1 - mean(x), 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0.0;

        for (double x1 : x) {
            sum += x1;
        }
        return sum / x.length;
    }
}

