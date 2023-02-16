package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double len, double wid) {
        length = len;
        width = wid;
    }

    //abstract accessors
    public double getLength() {
        return length;
    };

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    };

    public abstract void setWidth(double width);
}
