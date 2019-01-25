import java.util.Scanner;
/** Business: check ISBN-13 */
public class Exercise_5_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String s = input.nextLine();

        if (s.length() != 12) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        int checksum = 0;

        for (int i = 0; i < s.length(); i++) {
            checksum += (i % 2 == 0 ? 3 * Integer.parseInt(s.charAt(i) + "") :
                    Integer.parseInt(s.charAt(i) + ""));
        }

        checksum = 10 - checksum % 10;

        System.out.println("The ISBN-13 number is " + s + (checksum == 10 ? 0 : checksum));

    }
}
