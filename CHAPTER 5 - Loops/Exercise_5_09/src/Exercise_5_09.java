import java.util.Scanner;

public class Exercise_5_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        double maxScore = 0, secondMax = 0;
        String maxName = " ", secondMaxName = " ";

        for (int i=0; i< numberOfStudents; i++) {
            System.out.print("Enter student " + (i+1) +  "'s name and score: ");
            String name = input.next();
            double score = input.nextDouble();

            if (score > maxScore) {
                secondMax = maxScore;
                secondMaxName = maxName;
                maxScore = score;
                maxName = name;
            } else if (score > secondMax) {
                secondMax = score;
                secondMaxName = name;
            }
        }
        System.out.println("The student with the highest score is " + maxName + "\nscore: " + maxScore);
        System.out.println("The student with the second highest score is " + secondMaxName + "\nscore: " + secondMax);
    }
}
