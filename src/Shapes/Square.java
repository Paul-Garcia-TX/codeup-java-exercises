package Shapes;

import java.util.Scanner;

public class Square {
    protected double side;

    public class Square(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the measurement of one of the sides of the square?");
        side = scanner.nextDouble();
    }
}
