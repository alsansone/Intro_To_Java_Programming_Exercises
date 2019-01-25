import java.util.Scanner;

/** Computer architecture: bit-level operations */
public class Exercise_5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        byte number = input.nextByte();

        System.out.print("The 16 bits are ");
        for (int i = 15; i >= 0; i--) {
            int temp = number >> i;
            int bit = temp & 1;
            System.out.print(bit);
        }
    }
}
