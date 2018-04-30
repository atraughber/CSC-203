/**
 * Analyzes majors that are top earners and produces a report 
 * 
 * @author (Anna Traughber) 
 * @version (April 18, 2018)
 */
import java.util.*;  
import java.io.*; 
public class TopEarner
{
    public static void main (String args[]) 
    { 
        String inFileName; // obtained through keyboard input
        File inFile; // File object to process salary data file 
        Scanner keyboard; // to read user input
        Scanner input; // to read file input 
        
        Major[] careers; // array of possible of majors 
        int numMajors; // number of possible majors in the input  
        int index; // index for the array
         
        int sal2014; // Major 2014 starting salary 
        int sal2013; // Major 2013 starting salary
        String description; // Major description 
        Major newMajor; // one Major object 
  
        // display purpose 
        System.out.println ("This program processes a text file containing survey information ");
        System.out.println ("regarding starting salaries for majors and generates a report of ");
        System.out.println ("top earners in 2014 with percentage increase from 2013.");
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: April 18, 2018"); 
        System.out.println(); // print blank line 
        
        // create a Scanner object named keyboard to handle keyboard input 
        keyboard = new Scanner (System.in);
        // prompt and read file name
        System.out.print ("Enter file name (show complete path): ");
        inFileName = keyboard.next();    
        System.out.println(); // print blank line
 
        // open data file and read into an array 
        try {
            // create a File object 
            inFile = new File (inFileName);  
            // create a Scanner object named input to handle the file input 
            input = new Scanner (inFile);

            // create an array named careers to hold Major objects (256 components)
            careers = new Major[256];
            // initilaize numMajors to zero 
            numMajors = 0;

            // initialize index for the array
            index = 0;   

            // process line by line until end 
            while (input.hasNext()) { 
                // read three pieces of information for a major from the next line of the file 
               sal2014 = input.nextInt();
               sal2013 = input.nextInt();
               description = input.nextLine();
                // create a new Major object with data obtained from file and call it newMajor
                newMajor = new Major (sal2014, sal2013, description); 
                // place newMajor in the array  
                careers[index] = newMajor; 
                // increment numMajors 
                numMajors++;
                // increment index for the array
                index++; 
            }

            // close the file
            input.close();

            // sort careers array in decreasing order of 2014 starting salary
            // use bubble sort code for simplicity
            for (int pass = 0; pass < numMajors-1; pass++) { 
                for (index = numMajors-1; index >= pass+1; index--) {
                    // Compare startSalary2014 of careers[index] and 
                    //         startSalary2014 of careers[index-1] 
                    // and swap careers[index] and careers[index-1] if necessary 
                    if(careers[index].getStartSalary2014() > careers[index - 1].getStartSalary2014()) {
                        Major temp;
                        temp = careers[index];
                        careers[index] = careers[index - 1];
                        careers[index - 1] = temp;
                    }
                }
            } 
                      
            // print report  
            System.out.println ("Number of majors processed: " 
                + numMajors); 
            System.out.println (); 
            System.out.println ("Below is the list of top 10 earners based on"
                + " 2014 starting salary"); 
            System.out.println ("--------------------------------------------"
                + "---------------------");
            for(index = 0; index < 10; index++) {
                System.out.println(careers[index].toString());
            }    
            System.out.println ();
            System.out.println ("Below is the list of bottom 10 earners based on"
                + " 2014 starting salary"); 
            System.out.println ("-----------------------------------------------"
                + "---------------------");
            for(index = numMajors - 1; index > numMajors - 11; index--) {
                System.out.println(careers[index].toString()); 
            }    
            
            // display closing message 
            System.out.println(); // print blank line
            System.out.println ("Program has terminated."); 
        }
        catch (FileNotFoundException exception) {
            System.out.println ("The file " + inFileName 
                + " was not found."); 
            System.out.println(); // print blank line
        }
    }   
}
