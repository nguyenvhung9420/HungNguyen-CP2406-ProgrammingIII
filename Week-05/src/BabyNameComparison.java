import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three first names, use space: ");
        String raw = (input.nextLine()).trim();
        String[] rawStrings = raw.split("\\s");

        for (String string1 : rawStrings) {
            for (String string2 : rawStrings) {
                System.out.println(string1 + " " + string2);
            }
        }

    }
}
