package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesOrNo() {
        System.out.println("Enter yes or no: ");
        String input = scanner.nextLine();
        boolean isYes = input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        if (isYes){
            System.out.println("Yes.");

        }
        else{
            System.out.println("No.");
        }
        return isYes;

    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            input = scanner.nextInt();
        } while (input < min || input > max);
        scanner.nextLine(); // clear the input buffer
        return input;
    }

    public int getInt() {
        System.out.println("Please enter an integer: ");
        int input = scanner.nextInt();
        scanner.nextLine(); // clear the input buffer
        return input;
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Please enter a decimal between %.2f and %.2f: ", min, max);
            input = scanner.nextDouble();
        } while (input < min || input > max);
        scanner.nextLine(); // clear the input buffer
        return input;
    }

    public double getDouble() {
        while(true) {
            System.out.println("Please enter a decimal: ");

            if (scanner.hasNextDouble()){
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            }
        else{
                System.out.println("Please enter a valid input");
                scanner.nextLine();
            }
        }
    }


    public static void main (String[] args){
        Input input = new Input();
//
//        String str = input.getString();
//        System.out.printf("You entered: %s%n", str);
//
//        boolean yn = input.yesOrNo();
//        System.out.printf("You said: %b%n", yn);
//
//        int num = input.getInt();
//        System.out.printf("you entered %s%n", num);
//
//        int minMax = input.getInt(0,10);
//        System.out.printf("You entered %d%n", minMax);

        double duble = input.getDouble();
        System.out.println(duble);

        double mixMan = input.getDouble(0, 5.5);
        System.out.println(mixMan);
    }

}

