package shapes;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    protected double getArea() {
        System.out.println("Squares getArea");
        return side * side;
    }

    @Override
    protected double getPerimeter() {
        System.out.println("Squares getPerimeter");
        return 4 * side;
    }
}
