package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//    protected double length;
//
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    protected double getArea() {
//        System.out.println("Rectangles getArea");
//        return length * width;
//    }
//
//    protected double getPerimeter() {
//        System.out.println("Rectangles getPerimeter");
//        return (2 * length) + (2 * width);
//    }
//
//    //accessors
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
