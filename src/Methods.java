public class Methods {

    public static void main(String[] args) {
        sayHello(2);
        arithmetic(3);
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

}
