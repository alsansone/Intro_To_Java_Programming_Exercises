/** Find the smallest number such that n*n < 12000 */
public class Exercise_5_12 {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 2) <= 12000) {
            n++;
        }
        System.out.println("The smallest number is " + n);
    }
}
