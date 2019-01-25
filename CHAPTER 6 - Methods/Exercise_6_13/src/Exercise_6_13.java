public class Exercise_6_13 {
    public static void main(String[] args) {

        int start = 1;
        double end = 20.0;
        System.out.println("i            m(i)");
        System.out.println("----------------------");
        for (int i = start; i <= end; i++)
        System.out.printf("%-2d%18.4f\n", i, sumSeries(i));
    }
    public static double sumSeries(double num) {
        double m = 0;
        for (double i = 1; i <= num; i++) {
            m += i / (i + 1);
        }
        return m;
    }
}
