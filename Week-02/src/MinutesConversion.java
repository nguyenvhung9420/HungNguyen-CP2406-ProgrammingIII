import java.util.Scanner;
public class MinutesConversion {

    public static void main (String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Please type the minutes number: ");

        int minutes = Integer.parseInt(input.nextLine());

        int hours = minutes / 60;
        int days = hours/24;

        System.out.println(String.format("Number of days of %s minutes is %s days",minutes, days));
        System.out.print(String.format("Number of hours of %s minutes is %s hours",minutes, hours));
    }
}
