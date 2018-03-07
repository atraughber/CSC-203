/**
 * This program converts weights expressed in pounds to kilograms.
 *
 * It prompts the user for a weight in pounds. If a negative value
 * is entered, it is considered invalid and an appropriate message
 * is printed. For a positive value entered, required conversion is
 * performed and the result is printed out.
 *
 * @author (Anna Traughber)
 * @version (Janurary 24, 2018)
 */
import java.util.Scanner;
public class WeightConverter
{
    public static void main (String[] args)
    {
        final double KG_PER_POUND = 0.453592; //conversion factor
        double pounds, kilograms; // weight values
        char response; // user response to continue or not
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose, author, and version
        System.out.println ("This program converts weights expressed "
            + "in pounds to kilograms.");
        System.out.println (); // print blank line
        System.out.println ("It prompts the user for a weight in pounds. "
            + "If a negative value");
        System.out.println ("is entered, it is considered invalid and an "
            + "appropriate message");
        System.out.println ("is printed. For a positive value entered, "
            + "required conversion is");
        System.out.println ("performed and the result is printed out.");
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: January 24, 2018");
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program
        System.out.print ("Want to run? (enter y to run): ");
        response = input.next().charAt(0);
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') {
            System.out.print ("Enter weight in pounds: ");
            pounds = input.nextDouble();
            // convert only if positive
            if (pounds < 0)
                System.out.println ("Negative weight value is not valid.");
            else {
                kilograms = pounds * KG_PER_POUND;
                System.out.println ("That equals " + kilograms
                    + " Kilograms.");
            }
            System.out.println (); // print blank line

            // prompt to see if user wants to run the program
            System.out.print ("Want to run? (enter y to run): ");
            response = input.next().charAt(0);
            System.out.println (); // print blank line
        }
        System.out.println ("Program has terminated.");
        System.out.println (); // print blank line
    }
}
