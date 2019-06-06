import java.util.Scanner;
import java.util.Arrays;

public class AscendingandDescending {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three things: ");
        String str = input.nextLine();
        String[] str2 = str.split("\\s");
        Arrays.sort(str2);

        for (String out: str2){
            System.out.println(out + " ");
        }
    }
}
