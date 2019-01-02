/*
 * Lesson 4 Coding Activity Question 2
 * 
 * Ask the user their name and age and print out how many years until 
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 
Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_4_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */

        Scanner s= new Scanner(System.in);
        System.out.println("Hi there. What is your name?");
        String name = s.nextLine();
        System.out.println("Hi " + name + ". How old are you?");
        int age = s.nextInt();
        System.out.println(name + ", you will be 100 in " + (100 - age) + " years.");
        int x = 56;
        int y = 30;
        System.out.print ("Answer = " + x + y);
    }
}