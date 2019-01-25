import java.util.Scanner;
/** Check password */
public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (passwordCheck(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }

    public static boolean passwordCheck(String password) {
        // Check that password only contains letters and digits
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        }

        // Check length
        if (password.length() < 8)
            return false;

        // Count number of digits
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                count++;
        }
        return count >= 2;
    }
}
