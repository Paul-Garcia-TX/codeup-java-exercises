package Shapes;

public class Square extends Quadrilateral {
 private double side;

    public Square(double side) {
        super(side, side);
        this.side=side;
    }

    @Override
    public double getPerimeter() {

        return side + side + side + side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }


}
