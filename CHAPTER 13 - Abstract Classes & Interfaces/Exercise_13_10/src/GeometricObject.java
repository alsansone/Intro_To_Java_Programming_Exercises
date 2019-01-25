import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Default geometric object
    protected GeometricObject() {
        dateCreated = new Date();
    }

    // Constructor with color and filled
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    // Getters & Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
}
