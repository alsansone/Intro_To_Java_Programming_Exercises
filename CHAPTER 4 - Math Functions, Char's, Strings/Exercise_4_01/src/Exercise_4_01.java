import java.util.Scanner;

public class Exercise_4_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the enter to a vertex: ");
        double radius = input.nextDouble();

        double side = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5)));

        System.out.printf("The area of the pentagon is %5.2f", area);
    }
}
