/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args)
     {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
     Scanner s = new Scanner(System.in);
     int x = ((int)(Math.random()*12)) + 1;
     int y = ((int)(Math.random()*12)) + 1;
     System.out.println(x);
     System.out.println(y);
     int guess = s.nextInt();
     if (guess == x*y)
         System.out.println("Correct!");
     else
         System.out.println("Wrong");
     }
}