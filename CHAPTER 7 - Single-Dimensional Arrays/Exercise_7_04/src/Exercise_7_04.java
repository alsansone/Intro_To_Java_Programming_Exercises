import java.util.Scanner;

/** Analyze scores */
public class Exercise_7_04 {
    public static void main(String[] args) {
        double[] scores = new double[100];
        double sum = 0;
        int count = 0;
        double score = 0;

        Scanner input = new Scanner(System.in);
        while (score >= 0){
            System.out.print("Enter a score: ");
            score = input.nextDouble();

            if (score >= 0) {
                scores[count++] = score;
                sum += score;
            }
        }

        double average = sum / count;

        analyzeScores(scores, average, count);
    }

    public static void analyzeScores(double[] array, double average, int count) {
        int aboveAverage = 0;
        int belowAverage = 0;

        for (int i = 0; i < count; i++) {
            if (array[i] >= average) {
                aboveAverage++;
            } else {
                belowAverage++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Above average: " + aboveAverage);
        System.out.println("Below average: " + belowAverage);
    }
}
