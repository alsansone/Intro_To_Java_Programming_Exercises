import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        //Loops through the lines from 1 to lines
        for (int rows = 1; rows <= lines; rows++) {
            //Loops through the rows and adds the spaces
            for (int spaces = 1; spaces <= (lines - rows); spaces++) {
                System.out.print("**");
            }
            //Prints numbers in decreasing order
            for (int i = rows; i >= 1; i--) {
                System.out.print(i + " ");
            }
            //Prints numbers in increasing order starting from rows + 1
            for (int j = 2; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
