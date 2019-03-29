import java.util.Scanner;

public class TicketNumber {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the ticket number: ");

        String ticketNumStr = input.nextLine();
        int ticketNum = Integer.parseInt(ticketNumStr);
        int lastNum = Integer.parseInt(ticketNumStr.substring(5 ,6));
        int beforeLastNum = Integer.parseInt(ticketNumStr.substring(0 ,5));

        System.out.println(beforeLastNum);
        System.out.println(lastNum);

        boolean theComparison = false;

        if ((beforeLastNum % 7) == lastNum) {
            theComparison = true;
        }

        System.out.print(theComparison);

    }
}
