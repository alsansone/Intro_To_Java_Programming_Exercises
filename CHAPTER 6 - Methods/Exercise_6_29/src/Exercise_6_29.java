/** Twin primes */
public class Exercise_6_29 {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.print("(" + i + ", " + (i+2) + ")\n");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
