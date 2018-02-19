/**
 * This program reads an integer, checks if it is a leap year, 
 * and, if not, prints the next leap year. 
 *
 * The current rule for computing leap years was formulated 
 * by Pope Gregory XIII only in 1582.
 *
 * @author (Anna Traughber) 
 * @version (February 7, 2018)
 */
import java.util.*;
public class LeapYearTester
{
    public static void main (String[] args)
    {
        char response; // user response to continue or not
        int year;      // input year  
        int newYear;   // next leap year computed
        Scanner input = new Scanner (System.in); // to read user input
        
        // display purpose and author
        System.out.println ("This program reads an integer, checks if " 
            + "it is a leap year, "); 
        System.out.println ("and, if not, prints the next leap year."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: February 7, 2018"); 
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0);  
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') { 
            System.out.print ("Enter a year > 1582: "); 
            year = input.nextInt(); 
            // process if year > 1582
            if (year > 1582) { 
                if (MyCalendar.isLeapYear(year)) 
                    System.out.println (year + " is a leap year."); 
                else { 
                    System.out.println (year + " is not a leap year."); 
                    newYear = MyCalendar.nextLeapYear (year); 
                    System.out.println (newYear + " is the next leap year.");              
                }
            }
            else {
                System.out.println ("Invalid Input.  The current rule for"
                    + " computing leap years");  
                System.out.println ("was formulated by Pope Gregory XIII"
                    + " only in 1582."); 
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
