import java.text.DecimalFormat;
import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your name: ");
        String name = input.nextLine();

        System.out.print("Please type your grade: ");
        double grade = Double.parseDouble(input.nextLine());

        System.out.print(displayCredit(grade, name));

    }

    static String displayCredit(double grade, String name){
        double credit = grade * 10;
        DecimalFormat df = new DecimalFormat("$#.##");
        String creditOutput = df.format(credit);

        String outputString = String.format("Name: %s\nGrade: %.2f\nCredit: %s",
                name,
                grade,
                creditOutput
                );
        return outputString;
    }
}
