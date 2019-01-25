public class Exercise_6_14 {
    public static void main(String[] args) {

        System.out.println("i              m(i)");
        System.out.println("-------------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-3d%18.4f\n", i, estimatePi(i));
        }

    }
    public static double estimatePi(int num) {
        double m = 0;
        double sign = 1;

        for (int i = 1; i <= num; i++) {
            m += 4 * (sign / (2 * i - 1.0));
            sign = -sign;
        }
        return m;
    }
}
