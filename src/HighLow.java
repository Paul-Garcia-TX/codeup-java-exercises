import java.util.Scanner;

public class HighLow {
    public static void main (String [] args){
        System.out.println("test");

        double rand = Math.random();

        int randomNum = (int)(rand * 100);

        System.out.println("Guess if a number I will pick" );

        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        if (userInput > randomNum){
            System.out.println("Oh that was too high it was actually: " + randomNum);
        } else if (userInput < randomNum) {
            System.out.println("Oh that was too low it was actually:  " + randomNum);
        }
        else {
            System.out.println("BOOM! NAILED IT!");
        }


    }


}
