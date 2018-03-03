/**
 * This program reads a string, checks if forms a valid
 * hex numeral, and determines its decimal value.  The
 * input is assumed to be a valid hexadecimal number;
 * no error checking is performed.
 *
 * @author (Anna Traughber)
 * @version (March 02, 2018)
 */
import java.util.*;
public class HexProcessor
{
    public static void main (String[] args) 
    {
        // naming variables
        char response; // user response to continue or not
        int decimal; // decimal value computed
        String hex = ""; // input String from user
        Scanner input = new Scanner(System.in); // to read user input
        
        // display purpose and author
        System.out.println ("This program reads a string, checks if forms a valid"); 
        System.out.println ("hex numeral, and determines its decimal value.  The"); 
        System.out.println ("input is assumed to be a valid hexadecimal number;"); 
        System.out.println ("no error checking is performed."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: March 02, 2018"); 
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0);  
        System.out.println (); // print blank line
        
        while (response == 'y' || response == 'Y') { 
            System.out.print ("Enter a valid hexadecimal number: "); 
            hex = input.next();
            // determine value if valid and determine decimal value
            if (Hex.isValid(hex)) {
                decimal = Hex.parseInt(hex);
                System.out.println("The equivalent decimal value is 
