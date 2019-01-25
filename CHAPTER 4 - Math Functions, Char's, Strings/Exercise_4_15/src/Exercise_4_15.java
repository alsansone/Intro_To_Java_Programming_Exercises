import java.util.Scanner;

public class Exercise_4_15 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);

        int value = 0;

        if (Character.toLowerCase(letter) >= 'a' && Character.toLowerCase(letter) <= 'c')
            value = 2;
        else if (Character.toLowerCase(letter) >= 'd' && Character.toLowerCase(letter) <= 'f')
            value = 3;
        else if (Character.toLowerCase(letter) >= 'g' && Character.toLowerCase(letter) <= 'i')
            value = 4;
        else if (Character.toLowerCase(letter) >= 'j' && Character.toLowerCase(letter) <= 'l')
            value = 5;
        else if (Character.toLowerCase(letter) >= 'm' && Character.toLowerCase(letter) <= 'o')
            value = 6;
        else if (Character.toLowerCase(letter) >= 'p' && Character.toLowerCase(letter) <= 's')
            value = 7;
        else if (Character.toLowerCase(letter) >= 't' && Character.toLowerCase(letter) <= 'v')
            value = 8;
        else if (Character.toLowerCase(letter) >= 'w' && Character.toLowerCase(letter) <= 'z')
            value = 9;
        else {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }

        System.out.println("The corresponding number is " + value);
    }
}
