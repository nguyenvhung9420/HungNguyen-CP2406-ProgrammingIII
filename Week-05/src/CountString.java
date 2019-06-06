import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a sentence, use space: ");
        String raw = (input.nextLine()).trim();
        String[] rawStrings = raw.split("\\s");
        System.out.println("The number of words is: "+rawStrings.length);
    }
}
