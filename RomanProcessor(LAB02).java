/**
 * This program reads a string, checks if it forms a  
 * valid roman numeral and determines its decimal value.
 * 
 * @author (Anna Traughber) 
 * @version (January 31, 2018)
 */
import java.util.Scanner;
public class RomanProcessor
{
    public static void main (String[] args)
    {
        char response; // user response to continue or not
        String str;  // input String from user 
        int decimal;   // decimal value computed
        Scanner input = new Scanner (System.in); // to read user input
        
        // display purpose
        System.out.println ("This program reads a string, checks if forms a"); 
        System.out.println ("vallid roman numeral and determines its decimal value."); 
        System.out.println ("Author: Anna Traughber\tVersion: January 31, 2018");    
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0); 
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') { 
            System.out.print ("Enter a roman numeral string: "); 
            str = input.next(); 
            //determine value if valid and determine decimal value
            if (Roman.isValid(str)) {
                decimal = Roman.parseInt(str); 
                System.out.println ("The equivalent decimal " 
                    + "value is " + decimal + "."); 
            }
            else 
                System.out.println ("Invalid roman numeral."); 
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
