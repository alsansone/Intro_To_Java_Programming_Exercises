/**Find the largest n such that n*n*n < 12000**/
public class Exercise_5_13 {
    public static void main(String[] args) {
        int n = 1;
        int largest = 0;
        while (Math.pow(n, 3) < 12000) {
            if (n > largest) {
                largest = n;
                n++;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
