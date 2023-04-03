package Shapes;

import java.util.Scanner;

public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the height of your rectangle?");
        height = scanner.nextDouble();
        System.out.println("What is the width of your rectangle");
        width = scanner.nextDouble();

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
