package Shapes;


public class ShapesTest {


    public static void main (String[] args){


        Rectangle box1 = new Rectangle(20,20);
        System.out.println("Box 1 perimeter: " + box1.getPerimeter());
        System.out.println("Box 1 area: " + box1.getArea());
        Square box2 = new Square(20);
        System.out.println("Box 2 perimeter: " + box2.perimeter());
        System.out.println("Box 2 area: "+ box2.area());

    }
}
