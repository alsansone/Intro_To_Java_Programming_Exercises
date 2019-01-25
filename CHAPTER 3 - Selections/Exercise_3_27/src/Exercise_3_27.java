import java.util.Scanner;

public class Exercise_3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Points in triangle
        final int x1 = 0;
        final int y1 = 0;
        final int x2 = 0;
        final int y2 = 100;
        final int x3 = 200;
        final int y3 = 0;
        // Area of main triangle
        final double AREA = Math.abs((x3 * (y1 - y2)) / 2.0);
        // Area of other triangle based on point user entered
        double A1 = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2.0);
        double A2 = Math.abs((x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2.0);
        double A3 = Math.abs((x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2.0);

        if (AREA == A1 + A2 + A3) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
