/** Game: locker puzzle */
public class Exercise_7_23 {
    public static void main(String[] args) {

        // Print results
        System.out.println("Open Lockers: ");
        boolean[] lockers = lockerStatus();
        for (int i = 0; i < lockers.length; i++)
            if (lockers[i])
                System.out.println("Locker " + (i+1));
    }

    public static boolean[] lockerStatus() {
        boolean[] lockers = new boolean[100];
        // loop through students and lockers
        for (int s = 1; s <= lockers.length; s++)
            for (int b = s-1; b < lockers.length; b += s)
                lockers[b] = !lockers[b];

        return lockers;
    }
}
