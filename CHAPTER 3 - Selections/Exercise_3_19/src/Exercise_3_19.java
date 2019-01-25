import java.util.Scanner;

public class Exercise_3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lengths of the sides ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            System.out.println("The perimeter is " + (s1 + s2 + s3));
        } else {
            System.out.println("The input is invalid");
        }
    }
}
