package shapes;

public class Rectangle {

    protected double length;

    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double getArea() {
        System.out.println("Rectangles getArea");
        return length * width;
    }

    protected double getPerimeter() {
        System.out.println("Rectangles getPerimeter");
        return (2 * length) + (2 * width);
    }

    //accessors
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
