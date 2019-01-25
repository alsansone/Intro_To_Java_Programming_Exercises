public class Exercise_5_40 {
    public static void main(String[] args) {

        int numberOfHeads = 0;
        int numberOfTails = 0;
        int count = 0;

        while (count < 1_000_000) {
            int headsOrTails = (int)(Math.random() * 2);
            if (headsOrTails == 0) {
                numberOfHeads++;
            } else {
                numberOfTails++;
            }
            count++;
        }
        System.out.println("Number of Heads: " + numberOfHeads + "\nNumber of Tails: " + numberOfTails);
    }
}
