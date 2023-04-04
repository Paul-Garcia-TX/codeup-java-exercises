package Shapes;


public class ShapesTest {


    public static void main (String[] args){

        Measurable shape;

        shape = new Rectangle(5,4);
        System.out.println("Area of rectangle: " + shape.getArea());
        System.out.println("Perimeter of rectangle: " + shape.getPerimeter());


    }
}
