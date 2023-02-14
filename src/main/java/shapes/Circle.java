package shapes;

import util.Input;
import shapes.CircleApp;
public class Circle {
    private double radius;

//    private static int circleCounter = 0;

    public Circle(double radius) {
        this.radius = radius;
//        circleCounter++;
    }

    public double getArea() {
        return (Math.PI * (Math.pow(this.radius, 2)));
    }

    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }

//    public static int getCircleCounter() {
//        return circleCounter;
//    }
//
//    public static void setCirclesCreated(int circleCounter) {
//        CircleApp.circleCounter = circleCounter;
//    }
}
