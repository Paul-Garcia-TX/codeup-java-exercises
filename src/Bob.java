import java.util.Scanner;

public class Bob {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob.");
        String userInput = sc.nextLine();

        if (userInput.endsWith("?")){
            System.out.println("Sure.");
        }
        else if (userInput.endsWith("!")) {
            System.out.println("Whoa, why are we yelling?");
        }
        else if (userInput.endsWith(".")){
            System.out.println("Yeah, sure whatever");
        }
        else {
            System.out.println("Oh the silent treatment, eh?");
        }

    }
}
