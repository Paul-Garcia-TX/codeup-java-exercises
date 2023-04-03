package Shapes;

import java.util.Scanner;
public class Circle {
    public static void main (String[] args){
        Circles myCircle = new Circles();
        System.out.println("The radius of my circle is: "+ myCircle.radius);
        System.out.println("The area of my circle is: "+ myCircle.getArea());
        System.out.println("The circumference of my circle is: " + myCircle.getCircumference());

    }


    public static class Circles {
        private double radius;

        public Circles() {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the radius of your circle?");
            this.radius = input.nextDouble();
        }

        public double getArea(){
            double area = Math.PI * (radius * radius);

            return area;
        }
        public double getCircumference(){
          double  circumference = 2 * Math.PI * radius;
          return circumference;
        }

    }

}
