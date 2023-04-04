package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double width;
    protected  double height;

    public Rectangle(double length, double width) {
        super(length, width);
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setSqLength(double SqLength) {

    }
}
