import java.util.Scanner;


public class NumbersDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the first number: ");
        int number_1 = Integer.parseInt(input.nextLine());

        System.out.print("Please type the second number: ");
        int number_2 = Integer.parseInt(input.nextLine());

        displayTwiceTheNumber(number_1);
        displayTwiceTheNumber(number_2);

        System.out.println(displayNumberPlusFive(number_1));
        System.out.println(displayNumberPlusFive(number_2));

        System.out.println(displayNumberSquared(number_1));
        System.out.println(displayNumberSquared(number_2));

    }

    static void displayTwiceTheNumber(int number){
        System.out.println(number + " " + number);
    }

    static int displayNumberPlusFive(int number) {
        return (number + 5);
    }

    static int displayNumberSquared(int number){
        return (number * number);
    }


}
