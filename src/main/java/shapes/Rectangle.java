package shapes;

public class Rectangle {

    protected int length;

    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    protected int getArea() {
        System.out.println("Rectangles getArea");
        return length * width;
    }

    protected int getPerimeter() {
        System.out.println("Rectangles getPerimeter");
        return (2 * length) + (2 * width);
    }

    //accessors
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
