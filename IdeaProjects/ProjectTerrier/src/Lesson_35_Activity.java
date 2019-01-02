/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */


import java.util.Random;
import java.util.Scanner;

class Lesson_35_Activity {

    public static int randomize(int x, int y) {
        return ((int)(Math.random() * (Math.abs(x - y) + 1))) + Math.min(x, y);
    }

    public static int randomize(int x) {
        return (int)(Math.random() * (x + 1));
    }

    public static double randomize(double x, double y) {
        return Math.min(x, y) + ((Math.max(x, y) - Math.min(x, y)) * new Random().nextDouble());
    }

    public static double randomize(double x) {
        return Math.random() * x;
    }
     
    public static void main(String[] args)
     {
     for (int i = 0; i < 100000; i++) {
         System.out.println(randomize(0.0, 1.0));
     }
    }
}