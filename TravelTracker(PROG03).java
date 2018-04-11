/**
 * This program tracks total distance in miles,
 * yards and feet covered in a trip. Invalid values
 * lead to error messages.
 *
 * @author (Anna Traughber)
 * @version (April 08, 2018)
 */
import java.util.*;
public class TravelTracker
{
    public static void main(String[] args)
    {
        // declare totalDistance of type Distance
        Distance totalDistance, dayDistance;
        int miles; int yards; int feet;  // user input values
        Scanner input = new Scanner (System.in);  // to read user input

        // display purpose and author
        System.out.println ("This program tracks total distance in miles, ");
        System.out.println ("yards and feet covered in a trip. Invalid values ");
        System.out.println ("lead to error messages.");
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: April 08, 2018"); 
        System.out.println (); // print blank line

        // specify format for input
        System.out.println ("Enter distance in miles, yards and feet, all in a ");
        System.out.println ("single line with spaces in between.  Entering all ");
        System.out.println ("zeros will terminate the program.");
        System.out.println (); // print blank line

        // create the totalDistance object of type Distance with 0 miles, 0 yards, and 0 feet
        totalDistance = new Distance(0, 0, 0);
        System.out.println ("Distance covered so far is: " + totalDistance.toString());
        System.out.println (); // print blank line

        // prompt and read distance for a day
        System.out.print ("Enter distance covered for a day: ");
        miles = input.nextInt();
        yards = input.nextInt();
        feet = input.nextInt();

        // accumulate if appropriate
        while(miles != 0 || yards != 0 || feet != 0) {           
            if(Distance.isValidDistance(miles, yards, feet)) {
                // create the dayDistance object of type Distance with given miles, yards, and feet
                dayDistance = new Distance(miles, yards, feet);
                // add totalDistance and dayDistance and put the result in totalDistance
                totalDistance = totalDistance.addDistance(dayDistance);
                System.out.println ("Distance covered so far is: " + totalDistance.toString());
                System.out.println (); // print blank line
            } else {
                System.out.print("**Invalid value.  Not processed.");
                System.out.println (); // print blank line
                System.out.println (); // print blank line
            }    
            // prompt and read distance for another day 
            System.out.print ("Enter distance covered for a day: ");
            miles = input.nextInt();
            yards = input.nextInt();
            feet = input.nextInt();
        }

        // wrap up and print final distance
        if((miles == 0) && (yards == 0) && (feet == 0)) {           
            System.out.println (); // print blank line
            System.out.println("Total distance covered in this trip is: " + totalDistance);
            System.out.println (); // print blank line
            System.out.println("Program has terminated.");
            System.out.println (); // print blank line
        }
    }     
}
