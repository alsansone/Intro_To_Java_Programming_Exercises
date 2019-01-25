public class Exercise_8_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] correctCount = studentScores(answers, key);
        selectionSort(correctCount);

        for (int[] e: correctCount) {
            System.out.println("Student " + e[0] + "'s score is " + e[1]);
        }

    }
    public static int[][] studentScores(char[][] answers, char[] key) {
        int[][] scores = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            scores[i][0] = i;
            scores[i][1] = correctCount;
        }
        return scores;
    }
    public static void selectionSort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            // Find the min in the column 1
            int minCol1 = m[i][1];
            int minCol0 = m[i][0];
            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (minCol1 > m[j][1]) {
                    minCol1 = m[j][1];
                    minCol0 = m[j][0];
                    minIndex = j;
                }
            }

            // Swap
            if (minIndex != i) {
                m[minIndex][1] = m[i][1];
                m[minIndex][0] = m[i][0];
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }
}
