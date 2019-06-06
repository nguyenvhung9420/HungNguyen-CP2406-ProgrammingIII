import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int anInt = input.nextInt();

        if (anInt % 2 == 0){
            System.out.println(anInt + " is an even number.");
        } else {
            System.out.println(anInt + " is an odd number.");
        }
    }

}
