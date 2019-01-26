/** Simulation: coupon collector's problem */
public class Exercise_7_24 {
    public static void main(String[] args) {
        // number of cards in the deck
        final int NUMBER_OF_CARDS = 52;
        // card suits
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        // card numbers
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
        "9", "10", "Jack", "Queen", "King"};
        // cards found
        boolean[] cardsFound = new boolean[4];
        // number of picks
        int numberOfPicks = 0;
        // tracks cardsFound
        int count = 0;

        while (count < 4) {
            numberOfPicks++;
            // pick random card
            int index = (int)(Math.random() * NUMBER_OF_CARDS);
            // check for card has been found yet
            if (!cardsFound[index / 13]) {
                cardsFound[index / 13] = true;
                count++;
                // print cards found
                String suit = suits[index / 13];
                String rank = ranks[index % 13];
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println("Number of picks: " + numberOfPicks);
    }
}
