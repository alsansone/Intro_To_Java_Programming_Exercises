import java.util.Scanner;

/** Process string */
public class Exercise_5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i) + "";
        }
        System.out.println(result);
    }
}
