import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrank {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        int x1 =scan.nextInt();
        double x2 =scan.nextDouble();
        scan.nextLine();
        String s1 =scan.nextLine();

        System.out.println(i+x1);
        System.out.println(d+x2);
        System.out.println(s+s1);
        scan.close();
    }
}