public class SummerAssignmentLandsman {
    public static int countAbsences(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 4)
                count++;
        }
        return count;
    }

    public static boolean plagarism(String text, String phrase) {
        return text.toLowerCase().contains(phrase.toLowerCase());
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0);
    }

    public static String getDate(int days, int year) {
        if (days < 1)
            return "Invalid number of days.\nDay Number: " + days + "\nYear: " + year;

        int[] monthToDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year))
            monthToDays[1] = 29;

        int totalDays = 0;
        for (int i = 0; i < monthToDays.length; i++)
            totalDays += monthToDays[i];

        if (days > totalDays)
            return "Invalid number of days.\nDays Beyond 1 Year: " + (days - totalDays);

        int day = 0;
        int count = 0;
        for (int i = 0; i < monthToDays.length; i++) {
            for (int j = 0; j < monthToDays[i]; j++) {
                if (days != count) {
                    count++;
                    day++;
                }
            }
            if (count == days)
                return i + 1 + "/" + day + "/" + year;
            day = 0;
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println("1999 is a leap year: " + isLeapYear(1999));
        System.out.println("2000 is a leap year: " + isLeapYear(2000));
        System.out.println("2004 is a leap year: " + isLeapYear(2004));
        System.out.println("2100 is a leap year: " + isLeapYear(2100));

        System.out.println("\n");

        System.out.println("Day 247 of 2018: " + getDate(247, 2018));
        System.out.println("Day 365 of 2020: " + getDate(365, 2018));
        System.out.println("Day 365 of 2020: " + getDate(365, 2020));
        System.out.println("Day 366 of 2020: " + getDate(366, 2020));

        System.out.println();

        System.out.println(getDate(0, 2018));
        System.out.println(getDate(366, 2018));

        System.out.println("\n");

        System.out.println("Joke 1 is Stolen: " + plagarism("There are 10 types of people; those who understand binary, and those who don't.", "those who understand binary"));
        System.out.println("Joke 2 is Stolen: " + plagarism("Binary is as easy as 01-10-11.", "it's as easy"));
        System.out.println("Joke 3 is Stolen: " + plagarism("The semicolon: Hide and seek champion since 1958.", "Champion"));

        System.out.println("\n");

        int[] student1 = {3, 7, 7, 4, 7};
        int[] student2 = {7, 7, 7, 7, 7};
        int[] student3 = {0, 0, 3, 0, 0};

        System.out.println("Student 1 Absences: " + countAbsences(student1));
        System.out.println("Student 2 Absences: " + countAbsences(student2));
        System.out.println("Student 3 Absences: "+ countAbsences(student3));







    }

}
