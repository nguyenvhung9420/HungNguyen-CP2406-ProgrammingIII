import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(input.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(input.nextLine());

        System.out.print("height: ");
        double height = Double.parseDouble(input.nextLine());

        //Calcutlate the wall area of the room:
        double wallArea = calcWallArea(length, width, height);
        System.out.println("Wall area: " + wallArea);

        //Return the number of gallon needed for an area of wall (in feet):
        final int PAINT_PER_FEET = 350;
        double paintNeeded = calcPaintAmount(wallArea, PAINT_PER_FEET);
        System.out.println("Paint needed: " + paintNeeded);

        //Calculate the price:
        int paintNeeded_Int = (int) paintNeeded;
        final int PAINT_PRICE_PER_UNIT = 32;
        int priceToPay = paintNeeded_Int * PAINT_PRICE_PER_UNIT;
        System.out.println("Total you need to pay: $" + priceToPay);

    }

    static double calcWallArea(double length, double width, double height){
        return (2 * length * height + 2 * width * height) ;
    }

    static double calcPaintAmount(double area, double paint_per_feet){
        return (area / paint_per_feet);
    }

}
