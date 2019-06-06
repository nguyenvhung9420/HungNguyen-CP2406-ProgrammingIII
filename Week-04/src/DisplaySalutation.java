import java.util.Scanner;

public class DisplaySalutation {
    public static void displaySalut(String singleName) {
        System.out.println("Dear Mr. or Mrs " + singleName);
    }

    public static void displaySalut(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type something: ");
        String rawString = input.nextLine().trim();

        String[] names = rawString.split("\\s");

        switch (names.length) {
            case 1:
                displaySalut(names[0]);
                break;
            case 2:
                displaySalut(names[0], names[1]);
                break;
        }

    }
}
