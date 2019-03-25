import java.text.DecimalFormat;
import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first double number: ");
        double num_1 = Double.parseDouble(input.nextLine());

        System.out.print("Type the second double number: ");
        double num_2 = Double.parseDouble(input.nextLine());

        String output = String.format("%.2f is %s percent of %.2f",
                num_1,
                computePercent(num_1, num_2),
                num_2);

        System.out.println(output);
    }

    static String computePercent(double doub1, double doub2){
        double percent = (doub1 / doub2) * 100;
        String formatted = "";
        DecimalFormat df;

        //Check if the number has decimal part:
        if ((percent - (int)percent) != 0){
            df = new DecimalFormat("#.#");
            formatted = df.format(percent * 100) + "%";
        } else {
            formatted = ((int) percent) + "%";
        }

        return formatted;

    }
}
