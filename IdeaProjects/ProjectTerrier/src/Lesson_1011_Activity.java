/*
 * Lesson 30 1/2 Coding Activity
 *
 * For this program you will input an int to represent the octal number
 * and translate to the base ten number. The octal number must be 8 digits or less.
 *
 * Your program should also check that all the digits are 0 - 7, then translate the
 * number to base ten.
 *
 * Sample Run 1:
 * Enter a number in base 8:
 * 1287
 * ERROR: Incorrect Octal Format
 *
 * Sample Run 2:
 * Enter a number in base 8:
 * 123
 * 83
 *
 * Sample Run 3:
 * Enter a number in base 8:
 * 1111111111
 * ERROR: Incorrect Octal Format
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_1011_Activity{
    public static void main(String[] args)
    {
/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
        Scanner s = new Scanner(System.in);
        String[] digits = {};
        System.out.println("Enter a number in base 8:");
        int num = s.nextInt();
        int base10 = 0;
        String numStr = Integer.toString(num);
        if (numStr.length() > 8)
            System.out.print("ERROR: Incorrect Octal Format");
        else if (numStr.contains("8") || numStr.contains("9"))
            System.out.print("ERROR: Incorrect Octal Format");
        else {
            digits = numStr.split("");
            int[] digitsInt = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                digitsInt[i] = Integer.parseInt(digits[i]);
                digitsInt[i] = (int) (digitsInt[i] * (Math.pow(8, digits.length - i - 1)));
                base10 += digitsInt[i];
            }
            System.out.print(base10);
        }




    }
}