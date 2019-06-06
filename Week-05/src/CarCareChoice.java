import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] choices = {"oil change", "tire rotation", "battery check", "brake inspection"};
        String[] prices = {"$25", "$22", "$15", "$5"};

        System.out.println("Please input your choice, exactly: ");
        String userChoice = (input.nextLine()).trim();

        var n =0;
        String price = "";
        for (String choice: choices){
            if (userChoice.equals(choice)){
                price = prices[n];
                System.out.println("The price is: " + price);
            }
        }

        if (price.equals( "")){
            System.out.println("Invalid choice.");
        }
    }
}
