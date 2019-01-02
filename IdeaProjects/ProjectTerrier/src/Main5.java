import java.util.Scanner;

public class Main5 {

    private static String getNames(String num) {
        Scanner s = new Scanner(System.in);
        String names = "";
        System.out.println("Enter the values for the " + num + " array, up to 10000 values, enter 'End' to quit");
        String name;
        while (true) {
            name = s.nextLine();
            if (name.toLowerCase().equals("end"))
                break;
            else
                names += name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " ";
        }
        return names.substring(0, names.length() - 1);
    }

    private static boolean isAlph(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0)
                return false;
        }
        return true;
    }

    private static String[] merge(String[] namesAr1, String[] namesAr2) {
        String[] result = new String[namesAr1.length + namesAr2.length];

        // This should end at Ar1 length
        int indexAr1 = 0;
        // This should end at Ar2 length
        int indexAr2 = 0;

        // This should end at Ar1 + Ar2 length
        int indexResultAr = 0 ;

        // Sort alphabetically until either at end of Ar1 or Ar2 increasing index counts
        while (indexAr1 < namesAr1.length && indexAr2 < namesAr2.length) {
            if (namesAr2[indexAr2].compareTo(namesAr1[indexAr1]) > 0)
                result[indexResultAr++] = namesAr1[indexAr1++];
            else
                result[indexResultAr++] = namesAr2[indexAr2++];
        }

        // Add remaining values from array that has not been completely merged
        while (indexAr1 < namesAr1.length)
            result[indexResultAr++] = namesAr1[indexAr1++];
        while (indexAr2 < namesAr2.length)
            result[indexResultAr++] = namesAr2[indexAr2++];

        return result;
    }

    private static void ArToString(String[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i < ar.length - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String names = "";
        System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
        String name;
        while (true) {
            name = s.nextLine();
            if (name.toLowerCase().equals("end"))
                break;
            else
                names += name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " ";
        }

        String[] namesAr1 = names.split(" ");
        System.out.println();

        names = "";
        System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
        while (true) {
            name = s.nextLine();
            if (name.toLowerCase().equals("end"))
                break;
            else
                names += name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " ";
        }
        String[] namesAr2 = names.split(" ");

        if (!isAlph(namesAr1) || !isAlph(namesAr2))
            System.out.println("Error: Arrays not in correct order");


        String [] result = merge(namesAr1, namesAr2);

        System.out.println("\nFirst Array");
        ArToString(namesAr1);
        System.out.println("\nSecond Array");
        ArToString(namesAr2);

        System.out.println("\nMerged Array");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1)
                System.out.print(" ");
        }
    }

}
