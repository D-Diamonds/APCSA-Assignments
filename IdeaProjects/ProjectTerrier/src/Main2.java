import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int guess;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = s.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!\n");

        System.out.println("PHASE 1\n" + "Enter a number:");
        guess = s.nextInt();
        if (guess == 3) {
            System.out.println("Correct!\n");
            System.out.println("PHASE 2\n" + "Enter a number:");
            guess = s.nextInt();
            if (guess == 1 || (guess >= 33 && guess <= 100)) {
                System.out.println("Correct!\n");
                System.out.println("PHASE 3\n" + "Enter a number:");
                guess = s.nextInt();
                if ((guess > 0) && (guess % 3 == 0 || guess % 7 == 0))
                    System.out.println("Correct!\n" + "You have cracked the code!");
                else
                    System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
            }
            else
                System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
        }

        else
            System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");

    }
}
