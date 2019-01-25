import java.util.Scanner;

public class Exercise_3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        final double RADIUS = 10;
        final double x1 = 0;
        final double y1 = 0;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance <= RADIUS) {
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        } else {
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
        }
    }
}
