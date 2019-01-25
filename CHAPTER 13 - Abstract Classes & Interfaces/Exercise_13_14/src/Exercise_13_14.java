public class Exercise_13_14 {
    public static void main(String[] args) {
        // Create two Rational numbers
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r1.compareTo(r2));
        System.out.println(r1.equals(r2));
        System.out.println(r2.toString());
        System.out.println(r2.doubleValue());
    }
}
