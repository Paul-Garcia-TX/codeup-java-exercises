import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        sayHello(2);
        arithmetic(3);
        getInteger(1,10);
    }
    public static void sayHello ( int times){
        for (int i = 0; i < times; i += 1) {
            System.out.println("Hello");
        }

    }
    public static void arithmetic(int number){
        int something = 10;
        System.out.println("Addition " + (number + number));
        System.out.printf("Subtraction %d%n", something - number);
        System.out.println("Multiply " + number * number);
        System.out.println("Division " + something / number);
    }

    public static int getInteger(int min, int max){

        Scanner sc = new Scanner(System.in);
        int userInput;
        do{
            System.out.printf("Enter a number between %d and %d", min, max);
            while(!sc.hasNextInt()){
                System.out.printf("%s is not a valid number.%n", sc.next());
                System.out.printf("Enter a number between %d and %d", min, max);
            }
            userInput=sc.nextInt();
        }while (userInput < min || userInput > max);
            return userInput;


    }
    public static int factorial(int min, int max){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number");

        int n = sc.nextInt();
        if(n <= 0){
            return 1;
        } else {
            return n * factorial(n - 1);

        }

    }

}
