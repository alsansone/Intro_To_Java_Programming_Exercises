import java.util.Scanner;

public class Exercise_8_08 {
    public static void main(String[] args) {

        double[][] points = getArray();

        //Initial Shortest distance and indices of points
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        // Array to hold equal shortest distance points
        int[][] indices = new int[points.length][2];
        // Initial index of first pair
        int k = 0;

        // Loops through row of points
        for (int i = 0; i < points.length; i++) {
            // Loops through next row of points
            for (int j = i + 1; j < points.length; j++) {
                // Calculate distance
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                // Check if distance is less than initial distance
                if (distance < shortestDistance) {
                    // Reset k if needed
                    k = 0;
                    // Update indices array with new shortest distance
                    indices[k][0] = i;
                    indices[k][1] = j;
                    // Update shortest distance
                    shortestDistance = distance;
                // if distance is equal add pair to the indices array and updated k
                } else if (distance == shortestDistance) {
                    indices[k][0] = i;
                    indices[k][1] = j;
                    k++;
                }
            }
        }
        // Loop through indices array and print all matching pairs
        for (int i = 0; i < k; i++) {
            p1 = indices[i][0]; p2 = indices[i][1];
            System.out.println("The closest two points are " +
                    "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                    points[p2][0] + ", " + points[p2][1] + ")");
        }
        System.out.println("their distance is " + shortestDistance);
    }
    // Create an array from user input
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }
    // Calculate distance of given points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
