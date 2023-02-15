package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
    }

    @Override
    protected int getArea() {
        System.out.println("Squares getArea");
        return (int) Math.pow(side, 2);
    }

    @Override
    protected int getPerimeter() {
        System.out.println("Squares getPerimeter");
        return 4 * side;
    }
}
