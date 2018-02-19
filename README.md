/**
 * This program computes the date for Easter Sunday for any
 * given year in the range 1982-2048. If the year entered
 * is outside the permitted range, it is considered invalid
 * and an appropriate message is printed.
 *
 * @author (Anna Traughber)
 * @version (February 15, 2018)
 */
import java.util.*;
public class EasterSunday
{
    public static void main (String[] args) 
    {
        // naming variables
        char response; // user response to continue or not
        int year;
        int p;
        int q;
        int r;
        int s;
        int t;
        int d;

        Scanner input = new Scanner (System.in); // to read user input

        // display purpose and author
        System.out.println ("This program computes the date for Easter Sunday for any "); 
        System.out.println ("given year in the range 1982-2048. If the year entered"); 
        System.out.println ("is outside the permitted range, it is considered invalid"); 
        System.out.println ("and an appropriate message is printed."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: February 15, 2018"); 
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0);  
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') { 
            System.out.print ("Enter a year (between 1982 to 2048): "); 
            year = input.nextInt(); 

            // assigning values to variables
            p = year % 19;
            q = year % 4;
            r = year % 7;
            s = (19 * p + 24) % 30;
            t = (2 * q + 4 * r + 6 * s + 5) % 7;
            d = 22 + s + t;

            // process if year is outside of range
            if (year < 1982 || year > 2048) 
                System.out.println ("Years outside the range 1982 to 2048 are not valid.
                
            // process years within range
            else {
                if (d <= 31) {
                    System.out.println("Easter is Sunday, March " + d + " in " + year + ".");
                }    
                else {
                    System.out.println("Easter is Sunday, April " + (d - 31) + " in " + year + ".");
                }   
            }

            System.out.println (); // print blank line

            // prompt to see if user wants to tun the program 
            System.out.print ("Want to run? (enter y to run): "); 
            response = input.next().charAt(0); 
            System.out.println (); // print blank line
        }
        System.out.println ("Program has terminated."); 
        System.out.println (); // print blank line           

    }  
}               
