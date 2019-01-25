public class Exercise_8_04 {
    public static void main(String[] args) {

        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[][] totals = totalHours(hours);
        selectionSort(totals);

        for (int[]e: totals) {
                System.out.print("Employee " + e[0] + ": " + e[1] + "\n");
            }
            System.out.println();
    }
    // Compute total hours
    public static int[][] totalHours(int[][] hours) {
        int[][] totals = new int[hours.length][2];

        for (int row = 0; row < hours.length; row++) {
            for (int column = 0; column < hours[row].length; column++) {
                totals[row][1] += hours[row][column];
                totals[row][0] = row;
            }
        }
        return totals;
    }
    // Sort the hours in decreasing order
    public static void selectionSort(int[][] totals) {
        for (int i = 0; i < totals.length; i++) {
            int maxCol0 = totals[i][0];
            int maxCol1 = totals[i][1];
            int maxIndex = i;

            for (int j = i + 1; j < totals.length; j++) {
                if (maxCol1 < totals[j][1]) {
                    maxCol1 = totals[j][1];
                    maxCol0 = totals[j][0];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                totals[maxIndex][1] = totals[i][1];
                totals[maxIndex][0] = totals[i][0];
                totals[i][1] = maxCol1;
                totals[i][0] = maxCol0;
            }
        }
    }
}
