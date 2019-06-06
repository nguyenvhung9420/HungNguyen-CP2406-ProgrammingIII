import java.util.Scanner;

public class Billing {

    public static Double computeBill(Double price) {
        return (price + price * 0.8);
    }

    public static Double computeBill(Double price, int quantity) {
        return (price * quantity + (price * quantity) * 0.8);
    }

    public static Double computeBill(Double price, int quantity, Double coupon) {
        return ((price * quantity - coupon) + (price * quantity - coupon) * 0.8);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please inp");
        String inputedString = input.nextLine();
        String[] words = inputedString.split("\\s");

        double finalPrice = 0.0;

        switch (words.length) {
            case 1:
                finalPrice = computeBill(Double.parseDouble(words[0]));
                break;
            case 2:
                finalPrice = computeBill(Double.parseDouble(words[0]),
                        Integer.parseInt(words[1]));
                break;
            case 3:
                finalPrice = computeBill(Double.parseDouble(words[0]),
                        Integer.parseInt(words[1]),
                        Double.parseDouble(words[2]));
                break;
        }

        System.out.println("The final price is: " + finalPrice);

    }
}
