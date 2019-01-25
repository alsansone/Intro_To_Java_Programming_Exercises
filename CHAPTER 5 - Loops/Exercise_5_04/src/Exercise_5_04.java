public class Exercise_5_04 {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers");
        for (int i = 1; i<= 10; i++) {
            System.out.printf("%-10d %-10.3f\n", i, (i*1.609));
        }
    }
}
