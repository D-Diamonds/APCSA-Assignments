import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String str = s.nextLine();
        System.out.println("Enter the pivot String: ");
        String pivot = s.nextLine();

        if (str.contains(pivot))
            System.out.println(str.substring(str.indexOf(pivot) + pivot.length()) + pivot + str.substring(0 , str.indexOf(pivot)));
        else
            System.out.print("Error: Pivot String not found.");
    }
}
