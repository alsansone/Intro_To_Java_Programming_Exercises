import java.util.Scanner;

/** Sort students */
public class Exercise_7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] names = new String[numberOfStudents];
        int[] grades = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the students' name: ");
            names[i] = input.next();
            System.out.print("Enter the students' grades: ");
            grades[i] = input.nextInt();
        }

        System.out.println("Student grades in descending order: ");
        selectionSort(names, grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }

    public static void selectionSort(String[] names, int[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            int max = grades[i];
            int maxIndex = i;
            String maxStudent = names[0];

            for (int j = i + 1; j < grades.length; j++) {
                if (max < grades[j]) {
                    max = grades[j];
                    maxIndex = j;
                    maxStudent = names[j];
                }
            }

            if (maxIndex != i) {
                grades[maxIndex] = grades[i];
                grades[i] = max;
                names[maxIndex] = names[i];
                names[i] = maxStudent;
            }
        }
    }
}
