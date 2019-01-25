/** Palindromic prime */
public class Exercise_6_26 {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 2; ; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");

                if (count % 10 == 0) {
                    System.out.println();
                }

                if (count == 100) {
                    break;
                }
                count++;
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

    public static int reversal(int num) {
        int result = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(int num) {
        return num == reversal(num);
    }
}
