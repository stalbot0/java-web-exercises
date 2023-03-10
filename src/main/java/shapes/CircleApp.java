package shapes;

import util.Input;

import java.util.Arrays;

public class CircleApp {

    public static void main(String[] args) {

        Input userRadiusInput = new Input();
        do {
            System.out.format("What is the radius of your circle?%n");
            Circle userCircle = new Circle(userRadiusInput.getDouble());
            System.out.format("""
                            Area of your circle: %f
                            Circumference of the circle: %f%n"""
                    , userCircle.getArea(), userCircle.getCircumference());
            System.out.print("Would you like to make another circle? [Y/N]: ");
        } while (userRadiusInput.yesNo());;
    }

    //accessors

}
