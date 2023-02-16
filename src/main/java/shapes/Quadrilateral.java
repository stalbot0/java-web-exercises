package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //abstract accessors
    public abstract double getLength();

    public abstract void setLength(double length);

    public abstract double getWidth();

    public abstract void setWidth(double width);
}
