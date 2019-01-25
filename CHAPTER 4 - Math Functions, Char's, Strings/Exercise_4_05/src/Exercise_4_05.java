import java.util.Scanner;

public class Exercise_4_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides)));

        System.out.println("The area of the " + numberOfSides + "-sided polygon is " + area);
    }
}
