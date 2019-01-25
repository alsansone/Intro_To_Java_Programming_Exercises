public class Rectangle extends GeometricObject implements Comparable {
    private double width, height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    //Getters & Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle: width " + width + " height " + height;
    }

    // Abstract methods
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Overridden compareTo method
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((Rectangle)obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Rectangle)obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        return compareTo((Rectangle)obj) == 0;
    }
}
