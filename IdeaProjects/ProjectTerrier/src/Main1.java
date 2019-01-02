import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Seconds Since Unix Epoch:");
        int epoch = s.nextInt();

        // This annoys me... so much repetition...
        int second = epoch % 60;
        int second1 = epoch / 60;
        int minute = second1 % 60;
        int minute1 = second1 / 60;
        int hour = minute1 % 24;
        int hour1 = minute1 / 24;
        int day = hour1 % 30;
        int day1 = hour1 / 30;
        int months = day1 % 12;
        int months1 = day1 / 12;
        int year = 1970 + (months1 % 360);
        System.out.println("Year: " + year + "\nMonth: " + months + "\nDay: " + day + "\nHour: " + hour + "\nMin: " + minute + "\nSec: " + second);

    }
}
