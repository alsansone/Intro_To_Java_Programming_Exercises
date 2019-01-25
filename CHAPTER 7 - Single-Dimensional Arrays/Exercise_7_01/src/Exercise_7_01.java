import java.util.Scanner;

/** Assign grades */
public class Exercise_7_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] scores = new int[n];
        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        int bestScore = getBestScore(scores);

        for (int j = 0; j < scores.length; j++) {
            char grade = getGrade(scores[j], bestScore);
            System.out.println("Student " + j + " score is " + scores[j] + " and grade is " + grade);
        }
    }

    public static char getGrade(int score, int bestScore) {
        char grade;

        if (score >= bestScore - 10) {
            grade = 'A';
        } else if (score >= bestScore - 20) {
            grade = 'B';
        } else if (score >= bestScore - 30) {
            grade = 'C';
        } else if (score >= bestScore - 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static int getBestScore(int[] array) {
        int bestScore = array[0];

        for (int i = 1; i < array.length; i++) {
            if (bestScore < array[i]) {
                bestScore = array[i];
            }
        }
        return bestScore;
    }
}
