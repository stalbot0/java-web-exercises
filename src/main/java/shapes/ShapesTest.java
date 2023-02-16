package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(3, 4);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
