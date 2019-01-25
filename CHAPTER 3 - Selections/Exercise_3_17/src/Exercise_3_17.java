import java.util.Scanner;

public class Exercise_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int) (Math.random() * 3);

        System.out.print("Enter rock (0), paper (1), or scissors (2): ");
        int player = input.nextInt();

        if (player > 2) {
            System.out.println("Invalid Selection");
            System.exit(-1);
        }

        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print("rock. ");
                break;
            case 1:
                System.out.print("paper. ");
                break;
            case 2:
                System.out.print("scissors. ");
        }
        System.out.print("You are ");
        switch (player) {
            case 0:
                System.out.print("rock. ");
                break;
            case 1:
                System.out.print("paper. ");
                break;
            case 2:
                System.out.print("scissors. ");
        }

        boolean win = (player == 0 && computer == 2)
                || (player == 1 && computer == 0)
                || (player == 2 && computer == 1);

        if (computer == player) {
            System.out.println("It is a draw.");
        } else if (win) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.");
        }
        // Using pure if/else statements
        /*if (player == 0 && computer == 2) {
            System.out.println("The computer is scissors. You are rock. You win");
        } else if (player == 0 && computer == 1) {
            System.out.println("The computer is paper. You are rock. You lose");
        } else if (player == 0 && computer == 0) {
            System.out.println("The computer is rock. You are rock. It is a draw");
        } else if (player == 1 && computer == 0) {
            System.out.println("The computer is rock. You are paper. You win");
        } else if (player == 1 && computer == 2) {
            System.out.println("The computer is scissors. You are paper. You lose");
        } else if (player == 1 && computer == 1) {
            System.out.println("The computer is paper. You are paper. It is a draw");
        } else if (player == 2 && computer == 1) {
            System.out.println("The computer is paper. You are scissors. You win");
        } else if (player == 2 && computer == 0) {
            System.out.println("The computer is rock. You are scissors. You lose");
        } else if (player == 2 && computer == 2) {
            System.out.println("The computer is scissors. You are scissors. It is a draw");
        } else {
            System.out.println("Invalid Selection");
        }*/
    }
}
