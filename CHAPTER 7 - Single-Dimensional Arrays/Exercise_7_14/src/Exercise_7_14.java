import java.util.Scanner;

/** Computing gcd */
public class Exercise_7_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The GCD is " + gcd(array));

    }

    public static int gcd(int... numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = gcd(gcd, numbers[i]);
        }
        return gcd;
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int testGCD = 1;

        while (testGCD <= n1 && testGCD <= n2) {
            if (n1 % testGCD == 0 && n2 % testGCD == 0) {
                gcd = testGCD;
            }
            testGCD++;
        }
        return gcd;
    }
}
