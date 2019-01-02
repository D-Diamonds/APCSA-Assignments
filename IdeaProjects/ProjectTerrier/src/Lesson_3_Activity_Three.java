/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Hi there. What is your name?");
        String name = s.nextLine();
        System.out.println("What adjective describes you?");
        String adj = s.nextLine();
        System.out.print("My name is " + name + ". I am " + adj + ".");
        int y = 2147483647;
        y++;
        System.out.println(y);

    }
}