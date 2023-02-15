package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //testing the methods and inheritance
        Square testSquare = new Square(4);
        System.out.println(testSquare.getArea());
        System.out.println(testSquare.getPerimeter());

        Rectangle testRectangle = new Rectangle(3, 2);
        System.out.println(testRectangle.getArea());
        System.out.println(testRectangle.getPerimeter());

        System.out.println("--------------");


    }
}
