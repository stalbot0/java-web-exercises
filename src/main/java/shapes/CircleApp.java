package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input userRadiusInput = new Input();
        do {
            System.out.printf("What is the radius of your circle?%n");
            Circle userCircle = new Circle(userRadiusInput.getDouble());
            System.out.printf("Area of your circle: %f%nCircumference of the circle: %f%n", userCircle.getArea(), userCircle.getCircumference());
            System.out.print("Would you like to make another circle? [Y/N]: ");
        } while (userRadiusInput.yesNo());
    }
}
