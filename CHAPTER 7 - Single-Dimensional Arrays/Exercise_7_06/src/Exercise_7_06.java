/** Revise Listing 5.15, PrimeNumber.java */
public class Exercise_7_06 {
    public static void main(String[] args) {

        int[] firstFiftyPrimes = new int[50];
        boolean isPrime = true;
        int n = 2;
        int count = 0;

        while (count < 50) {

            for (int i = 0; i < count && firstFiftyPrimes[i] <= Math.sqrt(n); i++) {
                isPrime = true;

                if (n % firstFiftyPrimes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                firstFiftyPrimes[count] = n;
                count++;

                if (count % 10 == 0) {
                    System.out.println(n);
                } else {
                    System.out.print(n + " ");
                }
            }
            n++;
        }
    }
}
