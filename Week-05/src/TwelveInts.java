import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input twelve ints, use space: ");
        String rawString = input.nextLine();
        String[] intString = rawString.split("\\s");

        int[] ints = new int[4];

        int n =0;
        for (String str: intString) {
            ints[n] = Integer.parseInt(str.trim());
            n++;
        }
        System.out.println("From first to last: ");
        for (int num:ints) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("From last to first: ");
        n = 0;
        for (n = ints.length-1; n >= 0; n--) {
            System.out.print(ints[n] + " ");
        }
    }
}
