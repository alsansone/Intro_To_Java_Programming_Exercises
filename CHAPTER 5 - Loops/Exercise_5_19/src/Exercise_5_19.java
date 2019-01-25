public class Exercise_5_19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {

            for (int s = 1; s <= (8-i); s++) {
                System.out.print("    ");
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int)Math.pow(2, j));
            }

            for (int k = i - 2; k >= 0; k--) {
                System.out.printf("%4d", (int)Math.pow(2, k));
            }
            System.out.println();
        }
    }
}
