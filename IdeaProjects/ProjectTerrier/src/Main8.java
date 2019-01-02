import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String word;
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while(true) {
            word = s.nextLine();
            if (word.equals("STOP"))
                break;
            list.add(word);
        }
        for (String str : list)
            System.out.println(str.contains("a") ? str : "");
    }
}
