/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade. 
 * For example, if a user enters 4, print "A", and if they enter 0 print "F." 
 * You can assume that an integer between 0 and 4 will be input.
 */


import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args)
     {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
     Scanner s = new Scanner(System.in);
     int grade = s.nextInt();
     switch (grade) {
         case 0: System.out.println("F");
         break;
         case 1: System.out.println("D");
         break;
         case 2: System.out.println("C");
         break;
         case 3: System.out.println("B");
         break;
         case 4: System.out.println("A");
     }
    }
}