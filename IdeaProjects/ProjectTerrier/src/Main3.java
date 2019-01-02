import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arrowCount = 0;
        int qeyCount = 0;
        int dollarCount = 0;
        boolean bad = false;


        String input = s.nextLine();
        String name = input.substring(0, input.indexOf(" "));
        String text = input.substring(input.indexOf(" ") + 3).toLowerCase();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("^^")) {
                arrowCount++;
                bad = true;
            }
            if (words[i].equals("qey")) {
                qeyCount++;
                bad = true;
            }
            if (words[i].equals("$")) {
                dollarCount++;
                bad = true;
            }
        }

        System.out.println("Results: \n");
        if (bad) {
            System.out.println("BAD");
            System.out.println(name);
            System.out.println("^^: " + arrowCount + "\nqey: " + qeyCount + "\n$: " + dollarCount);
        }
        else
            System.out.println("CLEAN");
    }
}
