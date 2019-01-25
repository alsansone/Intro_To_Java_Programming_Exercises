import java.util.Scanner;

/** The MyTriangle class */
public class Exercise_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if (isValid(s1, s2, s3)) {
            System.out.printf("The area is %-8.4f", area(s1, s2, s3));
        } else {
            System.out.println("Invalid input");
        }

    }

    /* Return true if the sum of any two sides is
        greater than the third side */
    public static boolean isValid(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    }
    /* Return the area of the triangle */
    public static double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2.0;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}
