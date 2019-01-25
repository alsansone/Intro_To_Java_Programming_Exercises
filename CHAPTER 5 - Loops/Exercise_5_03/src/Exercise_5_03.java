public class Exercise_5_03 {
    public static void main(String[] args) {

        System.out.println("Kilograms      Pounds");
        for (int i = 1; i < 200; i+=2) {
            System.out.printf("%-10d %10.1f\n", i, (i * 2.20462));
        }
    }
}
