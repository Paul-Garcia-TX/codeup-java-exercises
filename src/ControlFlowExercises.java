import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String [] args){
        System.out.println("Test");

//        int i = 5;
//
//        while (i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int x = 100;
//
//        do {
//            x = x - 5;
//            System.out.println("X is " + x);
//        }while (x > -10);

//        int y = 2;
//
//        do {
//            y = y * 2;
//            System.out.println("Y is " + y);
//        } while (y < 1000000);

//        for(int z = 1; z < 100; z++){
//            if (z % 2 == 1){
//                continue;
//            }
//            System.out.println("Z is " + z);
//        }

//        fizz buzz
//        for(int i = 1; i < 100; i++){
//            if(i % 3 == 0){
//                System.out.println(i + " fizz");
//            }
//            else if(i % 5 == 0){
//                System.out.println(i + " buzz");
//            }
////            System.out.println(i);
//        }
        Scanner aNumber = new Scanner(System.in);

        System.out.println("Please enger a number");

        String myUserString = aNumber.nextLine();

        int myUserInt = Integer.parseInt(myUserString);

        System.out.println("Number| Squared | Cubed");
        for (int i = 1; i <= myUserInt; i ++){
            int square = i * i;
            int cubed = i * i * i;
            System.out.println(i + "     |   " + square + "     |   " + cubed);
        }
        String texasName = "Texas, yeehaw";

        System.out.println("texasName.indexOf(\"texasName.indexOf yee is\" + texasName.indexOf('yee')) = " + texasName.indexOf("texasName.indexOf yee is" + texasName.indexOf("yee")));


    }
}

