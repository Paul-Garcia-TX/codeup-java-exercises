package Shapes;


public class ShapesTest {


    public static void main (String[] args){

        Measurable shape;

        shape = new Rectangle(50,100);
        System.out.println("Area of rectangle: " + shape.getArea());
        System.out.println("Perimeter of rectangle: " + shape.getPerimeter());

        shape = new Square(20);

        System.out.println("Area of square: " + shape.getArea());
        System.out.println("Perimeter of square: " + shape.getPerimeter());

    }
}
