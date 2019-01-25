import java.util.Scanner;

/** Longest common prefix */
public class Exercise_5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 =input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The strings are identical");
            System.exit(0);
        }

        int l = s2.length();
        int p = 0;

        if (s1.length() < s2.length()) {
            l = s1.length();
        }

        for (int i = 0; i <= l; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            p++;
        }

        if (p == 0) {
            System.out.println(s1 + " and " + s2 + " have no common prefix");
            System.exit(0);
        }

        System.out.println("The common prefix is " + s1.substring(0, p));
    }
}
