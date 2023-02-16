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
    //the code fails to compile if you no longer use getPerimeter in rectangle because it is being implemented in its' superclass.
    //getWidth and getLength can't be accessed by the Measurable object instance
}
