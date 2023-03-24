import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello World");
        System.out.println("How is it going?");

        int myfavnumber = 21;
        System.out.println("My favorite number is " + myfavnumber);

        String weird = "What's cooking, good looking?";

        System.out.println(weird);

//        weird = 3.141589;
        long myNumber;

        myNumber = 123;

        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println("y is: " + ++y);
        System.out.println("Y is now: " + y);

//        var class = "something";
        int newX = 4;
        newX = newX +5;

        System.out.println(newX);
        System.out.println(" ");
        Scanner myScannerObject = new Scanner(System.in);

        System.out.println("Input something?>");

        String myUserString = myScannerObject.nextLine();

        System.out.println(myUserString);
        System.out.println(" ");
        double pi = 3.14159;
        System.out.println(" ");
        System.out.println("The value of pi is " + pi);

        Scanner age = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Hold is your kid?");
        String kidAge = age.nextLine();
        System.out.printf("Oh they are %s years old?", kidAge);


    }
}
