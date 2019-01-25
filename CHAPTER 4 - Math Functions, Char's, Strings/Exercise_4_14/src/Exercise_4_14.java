import java.util.Scanner;

public class Exercise_4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char letter = input.nextLine().charAt(0);

        int value = 0;

        if (Character.toUpperCase(letter) == 'A')
            value = 4;
        else if (Character.toUpperCase(letter) == 'B')
            value = 3;
        else if (Character.toUpperCase(letter) == 'C')
            value = 2;
        else if (Character.toUpperCase(letter) == 'D')
            value = 1;
        else if (Character.toUpperCase(letter) == 'F')
            value = 0;
        else {
            System.out.println(letter + " is an invalid grade");
            System.exit(1);
        }

        System.out.println("The numeric value for grade " + letter + " is " + value);
    }
}
