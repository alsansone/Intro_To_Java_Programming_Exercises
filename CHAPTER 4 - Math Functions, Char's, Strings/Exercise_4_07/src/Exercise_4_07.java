import java.util.Scanner;

public class Exercise_4_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        final double ANGLES_OF_PENTAGON = 2 * Math.PI / 5;

        double x = radius * Math.sin(0);
        double y = radius * Math.cos(0);
        double x1 = radius * Math.sin(ANGLES_OF_PENTAGON);
        double y1 = radius * Math.cos(ANGLES_OF_PENTAGON);
        double x2 = radius * Math.sin(ANGLES_OF_PENTAGON * 2);
        double y2 = radius * Math.cos(ANGLES_OF_PENTAGON * 2);
        double x3 = radius * Math.sin(ANGLES_OF_PENTAGON * 3);
        double y3 = radius * Math.cos(ANGLES_OF_PENTAGON * 3);
        double x4 = radius * Math.sin(ANGLES_OF_PENTAGON * 4);
        double y4 = radius * Math.cos(ANGLES_OF_PENTAGON * 4);

        System.out.println("The coordinates of five points on the pentagon are: ");
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");

    }
}
