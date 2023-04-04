package Shapes;

public class Square extends Rectangle {
    protected static double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public double perimeter(){
        double perimeter = side + side + side + side;

        return perimeter;
    }

    public double area(){
        double area = side * 2;
        return area;
    }

}
