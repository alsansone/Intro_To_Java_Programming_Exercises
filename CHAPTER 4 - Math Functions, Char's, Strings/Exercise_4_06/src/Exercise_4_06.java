public class Exercise_4_06 {
    public static void main(String[] args) {

        // Radius
        final int RADIUS = 40;

        System.out.println("The random three points are: ");
        // Generate random angle
        double angle = Math.toRadians(Math.random() * 360);
        // Calculate x and y based on angle
        double x = RADIUS * Math.cos(angle);
        double y = RADIUS * Math.sin(angle);
        System.out.println("(" + x + ", " + y + ")");

        angle = Math.toRadians(Math.random() * 360);
        x = RADIUS * Math.cos(angle);
        y = RADIUS * Math.sin(angle);
        System.out.println("(" + x + ", " + y + ")");

        angle = Math.toRadians(Math.random() * 360);
        x = RADIUS * Math.cos(angle);
        y = RADIUS * Math.sin(angle);
        System.out.println("(" + x + ", " + y + ")");
    }
}
