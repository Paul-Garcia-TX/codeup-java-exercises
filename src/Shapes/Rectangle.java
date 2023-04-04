package Shapes;

public class Rectangle {
    protected double width;
    protected  double height;

    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    public double getPerimeter(){
        double perimeter = (height * 2) + (width * 2);

        return perimeter;
    }
    public double getArea(){
        double area = height * width;
        return area;
    }


}
