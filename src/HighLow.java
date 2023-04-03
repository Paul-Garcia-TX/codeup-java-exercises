import java.util.Scanner;

public class HighLow {
    public static void main (String [] args){
        System.out.println("test");

        double rand = Math.random();

        int randomNum = (int)(rand * 100);

        System.out.println("Guess if a number I will pick" );

        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Attempt #" + i + ":");
            int userInput = input.nextInt();

            if (userInput > randomNum) {
                System.out.println("Oh that was too high.");
            } else if (userInput < randomNum) {
                System.out.println("Oh that was too low");
            } else {
                System.out.println("BOOM! NAILED IT!");
                return;
            }

        }
        System.out.println("Sorry, you ran out of guess it was actually: "+ randomNum);
    }


}
