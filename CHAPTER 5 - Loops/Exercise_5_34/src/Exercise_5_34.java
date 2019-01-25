import java.util.Scanner;

/** Game: rock, paper, scissor */
public class Exercise_5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;

        while (Math.abs(score) <= 2) {
            System.out.print("rock (0), paper (1), scissor (2): ");
            int player = input.nextInt();

            if (player > 2) {
                System.out.println("Invalid Selection");
                System.out.print("rock (0), paper (1), scissor (2): ");
                player = input.nextInt();
            }

            int computer = (int)(Math.random() * 3);

            switch (computer) {
                case 0:
                    if (player == 0) {
                        System.out.println("Draw");
                    } else if (player == 1) {
                        System.out.println("You won");
                        score++;
                    } else if (player == 2) {
                        System.out.println("You lose");
                        score--;
                    }
                    break;
                case 1:
                    if (player == 0) {
                        System.out.println("You lose");
                        score--;
                    } else if (player == 1) {
                        System.out.println("Draw");
                    } else if (player == 2) {
                        System.out.println("You won");
                        score++;
                    }
                    break;
                case 2:
                    if (player == 0) {
                        System.out.println("You won");
                        score++;
                    } else if (player == 1) {
                        System.out.println("You lose");
                        score--;
                    } else if (player == 2) {
                        System.out.println("Draw");
                    }
                    break;
            }
        }
        if (score > 2) {
            System.out.println("You win the game!");
        } else {
            System.out.println("The computer wins");
        }
    }
}
