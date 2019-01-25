import java.util.Scanner;

public class Exercise_5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        System.out.print("Enter the students name: ");
        String name1 = input.next();
        System.out.print("Enter the students score: ");
        double score1 = input.nextDouble();

        for (int i = 0; i < students-1; i++) {
            System.out.print("Enter the students name: ");
            String name = input.next();
            System.out.print("Enter the students score: ");
            double score = input.nextDouble();

            if (score > score1) {
                score1 = score;
                name1 = name;
            }
        }

        System.out.println("The top student is " + name1 + " with a score of " + score1);
    }
}
