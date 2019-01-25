/** Mersenne prime */
public class Exercise_6_28 {
    public static void main(String[] args) {

        System.out.println("p\t2*p-1");
        System.out.println("----------");
        for (int p = 2; p <= 31; p++) {
            int i = (int)(Math.pow(2, p) - 1);

            if (isPrime(i)) {
                System.out.println(p + "\t" + i);
            }
        }
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
