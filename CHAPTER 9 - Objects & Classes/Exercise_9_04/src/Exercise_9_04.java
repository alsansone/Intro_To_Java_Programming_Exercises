import java.util.Random;

public class Exercise_9_04 {
    public static void main(String[] args) {

        // Create Random object w/ seed
        Random random = new Random(1000);

        // Loop through numbers 0-100
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }
}
