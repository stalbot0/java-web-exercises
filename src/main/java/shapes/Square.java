package shapes;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getLength() {
        return this.side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    protected double getArea() {
//        System.out.println("Squares getArea");
//        return side * side;
//    }
//
//    @Override
//    protected double getPerimeter() {
//        System.out.println("Squares getPerimeter");
//        return 4 * side;
//    }
}
