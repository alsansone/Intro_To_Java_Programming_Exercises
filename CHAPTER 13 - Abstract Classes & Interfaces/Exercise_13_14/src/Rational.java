public class Rational extends Number implements Comparable<Rational> {

    // Data fields for numerator & denominator
    private long[] r = new long[2];

    // Constructors
    public Rational() {
        this(1, 0);
    }

    public Rational(long n, long d) {
        long gcd = gcd(n, d);
        this.r[0] = n/gcd;
        this.r[1] = d/gcd;
    }

    // Find gcd
    public long gcd(long n, long d) {
        long t1 = Math.abs(n);
        long t2 = Math.abs(d);
        long remainder = t1 % t2;

        while (remainder != 0) {
            t1 = t2;
            t2 = remainder;
            remainder = t1 % t2;
        }

        return t2;
    }

    // Getters
    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    // Add two rational numbers
    public Rational add(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() +
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // Subtract two rational numbers
    public Rational subtract(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() -
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // Multiply two rational numbers
    public Rational multiply(Rational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // Divide two rational numbers
    public Rational divide(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new Rational(n, d);
    }

    // Override string method
    @Override
    public String toString() {
        return (r[1] == 1 || r[0] == 0 ? r[0] + "" : r[0] + "/" + r[1]);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        return this.subtract((Rational)(obj)).getNumerator() == 0;
    }

    // Implement abstract intValue method
    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    // Abstract doubleValue method
    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }

    // Abstract floatValue method
    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    // Abstract longValue method
    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    // Override compareTo method
    @Override
    public int compareTo(Rational o) {
        return (this.subtract(o).getNumerator() > 0 ? 1 : (this.subtract(o).getNumerator() < 0 ? -1 : 0));
    }
}
