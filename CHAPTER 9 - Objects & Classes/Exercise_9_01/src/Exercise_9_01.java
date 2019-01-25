public class Exercise_9_01 {
    public static void main(String[] args) {
        // create rectangle 1
        Rectangle rectangle1 = new Rectangle(40, 4);
        // display rectangle1
        System.out.println("Rectangle1: ");
        System.out.println("Length: " + rectangle1.length + "\n" +
                "Width: " + rectangle1.width + "\n" +
                "Area: " + rectangle1.getArea() + "\n" +
                "Perimeter: " + rectangle1.getPerimeter());
        // create rectangle 2
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);
        // display rectangle2
        System.out.println("\n" + "Rectangle2: ");
        System.out.println("Length: " + rectangle2.length + "\n" +
                "Width: " + rectangle2.width + "\n" +
                "Area: " + rectangle2.getArea() + "\n" +
                "Perimeter: " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    double length = 1;
    double width = 1;
    // no-arg constructor
    Rectangle() {
    }
    // arg constructor
    Rectangle(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;
    }
    // area method
    double getArea() {
        return length * width;
    }
    // perimeter method
    double getPerimeter() {
        return 2 * (length + width);
    }
    // set method
    void setDimensions(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;
    }
}
