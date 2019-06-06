import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {

        //boolean beingEven = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int anInt = input.nextInt();

        while (anInt != 999) {

            System.out.print("Please input an integer: ");
            anInt = input.nextInt();

            while (anInt % 2 != 0) {
                System.out.print("Please input the number again: ");
                anInt = input.nextInt();
            }

        }
    }
}
