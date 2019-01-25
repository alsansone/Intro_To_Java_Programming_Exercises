public class Exercise_5_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms      Pounds     |      Pounds      Kilograms");
        for (int i=1, j=20; i<=199 && j<=515; i+=2, j+=5) {
            System.out.printf("%-10d %10.1f     |      %-10d %10.2f\n", i, (i*2.2), j, (j/2.2));
        }
    }
}
