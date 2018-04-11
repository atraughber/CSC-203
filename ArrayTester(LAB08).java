/**
 * This program reads a list of integers, copies non-negatives, 
 * and prints a revised list with no negatives.
 * 
 * @author (Anna Traughber) 
 * @version (April 04, 2018)
 */
import java.util.Scanner; 
public class ArrayTester
{
    public static void main(String args[])
    {
        int listSize = 0; // number of elements in the list 
        int numberOfNegatives = 0; // number of negatives in the list
        int revisedListSize = 0; // number of elements after removing negatives            
        Scanner input = new Scanner (System.in); // to read user input
        
        // declare list and revisedList as (references to) arrays of int
        int[] list;
        int[] revisedList;

        // display purpose
        System.out.println ("This program reads a list of integers, "
            + "copies non-negatives,"); 
        System.out.println ("and prints a revised list with no negatives."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: April 04, 2018"); 
        System.out.println (); // print blank line

        // prompt and read list size 
        System.out.print ("Enter size of the list, 0 to terminate: "); 
        listSize = input.nextInt(); 
        while (listSize > 0) {
            // create list as an array with listSize components 
            list = new int[listSize]; 
 
            // invoke readList method to read the list 
            ArrayProcessor.readList(list); 

            // invoke negativeCount method and assign to numberOfNegatives
            numberOfNegatives = ArrayProcessor.negativeCount(list);

            System.out.println ("The list has " + numberOfNegatives 
                + " negative values."); 

            // compute and assign revisedListSize
            revisedListSize = listSize - numberOfNegatives;  

            // check if revisedListSize is 0; if so, print message
            // else create revisedList array, invoke copyNonNegatives,
            // and print a revised list
            if (revisedListSize == 0) 
                System.out.println ("After copying non-negatives, there" 
                    + " are no values left to print."); 
            else { 
                // create revisedList as an array with revisedListSize components
                revisedList = new int[revisedListSize];
                // invoke copyNonNegatives method to construct revisedList
                ArrayProcessor.copyNonNegatives(list, revisedList); 
                // print the revised list
                System.out.println ("After copying non-negatives, there" 
                    + " are " + revisedListSize + " values left to print."); 
                // invoke printList method to print revisedList 
                ArrayProcessor.printList(revisedList);
            }
            System.out.println (); // print blank line                
            // prompt and read list size 
            System.out.print ("Enter size of the list, 0 to terminate: "); 
            listSize = input.nextInt(); 
        }
 
        System.out.println (); // print blank line 
        System.out.println ("Program has terminated.");  
    }
}
