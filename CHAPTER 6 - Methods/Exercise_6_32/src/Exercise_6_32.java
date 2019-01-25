public class Exercise_6_32 {
    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < 10000; i++) {
            int dice = getDice();
            if (dice == 7 || dice == 11) {
                wins++;
            } else if (dice == 2 || dice == 3 || dice == 12) {
                losses++;
            } else {
                int point = dice;

                do {
                    dice = getDice();
                } while (dice != 7 && dice != point);

                if (dice == 7) {
                    losses++;
                } else {
                    wins++;
                }
            }
        }
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of losses: " + losses);
    }

    public static int getDice() {
        int d1 = (int)(1 + Math.random() * 6);
        int d2 = (int)(1 + Math.random() * 6);

        return d1 + d2;
    }
}
