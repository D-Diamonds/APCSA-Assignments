import java.util.Scanner;

public class Main6 {

    public static String duplicate(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (str.length() % 2 == 0)
                for (int j = 0; j < str.length() * 2; j++)
                    result += Character.toString(str.charAt(i));
            else
                for (int j = 0; j < str.length(); j++)
                    result += Character.toString(str.charAt(i));
        return result;
    }

    public static boolean isEdhesivePalindrome(String str) {
        if (str.length() <= 3 || str.length() >= 15)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4')
                str = str.substring(0, i) + "a" + str.substring(i + 1);
            if (str.charAt(i) == '3')
                str = str.substring(0, i) + "e" + str.substring(i + 1);
            if (str.charAt(i) == '0')
                str = str.substring(0, i) + "o" + str.substring(i + 1);
        }

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static double numberScramble(double num) {
        if (num < 0)
            return 0;
        return Math.sqrt((num + 5) / 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        System.out.println("The duplicated String is: " + duplicate(s.nextLine()));
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        System.out.println((isEdhesivePalindrome(s.nextLine()) ? "Nice, you found an Edhesive Palindrome!" : "Too bad, that isn't an Edhesive Palindrome."));
        System.out.println("Almost done! Please enter a number to scramble.");
        System.out.println("The scrambled number is: " + numberScramble(s.nextDouble()));
    }
}
