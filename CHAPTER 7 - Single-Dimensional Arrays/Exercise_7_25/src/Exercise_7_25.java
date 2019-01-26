import java.util.Scanner;

/** Algebra: solve quadratic equations */
public class Exercise_7_25 {
    public static void main(String[] args) {
        double[] eqn = new double[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < eqn.length; i++)
            eqn[i] = input.nextDouble();

        // real roots
        double[] roots = new double[2];
        // number of roots
        int numberOfRoots = solveQuadratic(eqn, roots);

        System.out.print("The equation has " + numberOfRoots + (numberOfRoots == 1 ? " root " : " roots "));
        if (numberOfRoots == 2)
            System.out.print(roots[0] + " and " + roots[1]);
        if (numberOfRoots == 1)
            System.out.print(roots[0]);
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        int numberOfRoots = 0;
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            numberOfRoots = 2;
        } else if (discriminant == 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            numberOfRoots = 1;
        }

        return numberOfRoots;
    }
}
