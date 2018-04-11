/**
 * Simple list manipulation routines using an array.
 * 
 * @author (Anna Traughber) 
 * @version (April 04, 2018)
 */
import java.util.Scanner; 
import java.text.DecimalFormat;
public class ArrayProcessor
{
    /**
     * Read a list of integers
     * 
     * @param   nums  an int array
     * @return  void  
     */
    public static void readList (int[] nums)
    {
        Scanner input = new Scanner (System.in); // to read user input
        int len  = nums.length; 
        System.out.println ("You need to enter " + len
            + " integers in the range -50 to +50."); 
        System.out.println ("Please enter one per line."); 
        for(int index = 0; index < len; index++) {
            System.out.print("Enter an integer: ");
            nums[index] = input.nextInt();
        }
    }

    /**
     * Print a list of integers, at most 5 per line
     * 
     * @param   nums  an int array 
     * @return  void  
     */
    public static void printList (int[] nums)
    {
        DecimalFormat formatter = new DecimalFormat ("000"); 
        int len = nums.length; int index; 
        for (index = 0; index < len; index++) {
            System.out.print (formatter.format(nums[index]) + "  "); 
            if (index % 5 == 4) 
                System.out.println ();  
        }
        if (len % 5 != 0) 
            System.out.println (); 
    }

    /**
     * Count and return the number of negatives
     * 
     * @param   nums  an int array 
     * @return  int   count of the number of negatives     
     */
    public static int negativeCount (int[] nums)
    {
        int neg = 0; // count of the number of negatives
        for(int index = 0; index < nums.length; index++)
            if(nums[index] < 0)
                neg++;
        return neg; 
    }

    /**
     * Copy non-negatives and construct a revised array of integers
     * 
     * @param   nums         an int array to be processed
     * @param   revisedNums  an int array with only non-negatives
     * @return  void       
     */
    public static void copyNonNegatives (int[] nums, int[] revisedNums)
    {
        int revisedIndex = 0; 
        for(int index = 0; index < nums.length; index++)
            if(nums[index] >= 0) {
                revisedNums[revisedIndex] = nums[index];
                revisedIndex++;
            }

    } 
}
