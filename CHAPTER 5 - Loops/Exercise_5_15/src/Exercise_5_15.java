public class Exercise_5_15 {
    public static void main(String[] args) {

        int count = 1;
        for (char i = 33; i <= 126; i++) {
            System.out.print((count++ % 10 != 0) ? i + " " : i + "\n");
        }
    }
}
