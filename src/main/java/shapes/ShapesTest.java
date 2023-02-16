package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(3, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
