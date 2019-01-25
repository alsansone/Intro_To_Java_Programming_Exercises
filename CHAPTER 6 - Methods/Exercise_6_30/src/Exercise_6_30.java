/** Game: craps */
public class Exercise_6_30 {
    public static void main(String[] args) {
        int dice = getDice();
        if (dice == 7 || dice == 11) {
            System.out.println("You win");
            System.exit(1);
        } else if (dice == 2 || dice == 3 || dice == 12) {
            System.out.println("You lose");
            System.exit(2);
        } else {
            int points = dice;
            System.out.println("points are " + points);
            do {
                dice = getDice();
            } while (dice != 7 && dice != points);

            System.out.println(dice == 7 ? "You lose" : "You win");
        }
    }

    public static int getDice() {
        int d1 = (int)(1 + Math.random() * 6);
        int d2 = (int)(1 + Math.random() * 6);

        System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1 + d2));
        return d1 + d2;
    }
}
