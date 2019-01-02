import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while (true) {
            name = s.nextLine();
            if (name.equals("STOP"))
                break;
            names.add(name);
        }
        System.out.println(names.size() + "\n" + names);
        if (names.size() > 2) {
            names.remove(0);
            names.remove(names.size() - 1);
            System.out.println(names);
        }
    }
}
