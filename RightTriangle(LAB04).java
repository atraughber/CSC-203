/**
 * This program reads three integers, checks if they form the 
 * sides of a valid triangle, and if they do, reports whether 
 * or not they also form a right-angled triangle.
 * 
 * @author (Anna Traughber) 
 * @version (February 14, 2018)
 */
import java.util.Scanner;
public class RightTriangle
{
    public static void main (String[] args)
    {
        int side1, side2, side3; // three sides 
        int temp; // used in swap
        char response; // user response to continue or not
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose and author
        System.out.println ("This program reads three integers, checks if they form the"); 
        System.out.println ("sides of a valid triangle, and if they do, reports whether"); 
        System.out.println ("or not they also form a right-angled triangle."); 
        System.out.println ("Author: Anna Traughber\tVersion: February 14, 2018");    
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0); 
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') { 
            // prompt and read three integer sides, one by one 
            /**** replace this line with code ****/
            System.out.print ("Please enter a number: ");
            side1 = input.nextInt();
            System.out.print ("Please enter a number: ");
            side2 = input.nextInt();
            System.out.print ("Please enter a number: ");
            side3 = input.nextInt();

            // if (side1 > side3) swap them
            /**** replace this line with code ****/
            if (side1 > side3) {
                side3 = side1;
            }                

            // if (side2 > side3) swap them
            /**** replace this line with code ****/
            if (side2 > side3) {
                side3 = side2;
            }

            // if the triangle condition is met 
            if (side1 + side2 > side3) {  // fill-in condition and remove this comment
                // if the right-angled triangle condition is met 
                if (((side1 * side1) + (side2 * side2)) == (side3 * side3)) {  // fill-in condition and remove this comment 
                    // print valid right triangle 
                    /**** replace this line with code ****/
                    System.out.println ("Valid right triangle.");
                }
                else {
                    // print valid triangle, not right-angled
                    /**** replace this line with code ****/
                    System.out.println ("Valid triangle, not right-angled.");
                }
            }
            else { 
                // print not a valid triangle 
                /**** replace this line with code ****/
                System.out.println ("Not a valid triangle.");
            }
            System.out.println (); // print blank line

            // prompt to see if user wants to tun the program 
            /**** replace this line with code ****/
            System.out.print ("Want to run? (enter y to run): "); 
            response = input.next().charAt(0); 
            System.out.println (); // print blank line
        }

        System.out.println ("Program has terminated."); 
        System.out.println (); // print blank line
    }  
}
