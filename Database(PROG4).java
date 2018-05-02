/**
 * This program processes a text file containing student information, and 
 * generates a report in descending order of GPA.
 * 
 * @author (Anna Traughber) 
 * @version (April 30, 2018)
 */

import java.util.*;
import java.io.*;
public class Database
{
    public static void main (String[] args)
    {
        String inFileName;  // obtained through keyboard scanner
        File inFile;  // File object to process data file
        Scanner keyboard, input;  // to read user inputs

        Student[] activeStudents;  // array of students
        int numStudents;  // number of students 
        int index;  // index for the array

        String bannerIDNumber;  
        String studentName;
        int creditsCompleted;  
        double cumulativeGPA; 
        Student newStudent;  // student object

        // display purpose
        System.out.println ("This program processes a text file containing student information, and ");
        System.out.println ("generates a report in descending order of GPA.");                    
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: April 30, 2018");
        System.out.println (); // print blank line

        // create a Scanner object named keyboard to handle keyboard input
        keyboard = new Scanner(System.in);
        // prompt and read file name
        System.out.print ("Enter file name (show complete path): "); 
        inFileName = keyboard.next();
        System.out.println (); // print blank line

        // open data file and read into an array
        try {
            // create a File object
            inFile = new File(inFileName);
            // create a Scanner object named input to handle the file input
            input = new Scanner(inFile);

            // create an array named careers to hold Major objects (256 components)
            activeStudents = new Student[256];
            // initialize numberStudents to zero
            numStudents = 0;
            // initialize index for the array
            index = 0;

            // process line by line until the end
            while(input.hasNext()) {
                // read three pieces of information for a major from the next line of the file
                bannerIDNumber = input.next();
                creditsCompleted = input.nextInt();
                cumulativeGPA = input.nextDouble();
                studentName = input.nextLine();
                // create a new Student object with data obtained from file and call it newStudent
                newStudent = new Student(bannerIDNumber, creditsCompleted, cumulativeGPA, studentName);
                // place newStudent in the array
                activeStudents[index] = newStudent;
                // increment numStudents
                numStudents++;
                // increment index for the array
                index++;
            }

            // close the file
            input.close();

            // sort array in decreasing order of cumulativeGPA
            // use bubble sort for simplicity
            for(int pass = 0; pass < numStudents - 1; pass++) {
                for(index = numStudents - 1; index >= pass + 1; index--) {
                    if(activeStudents[index].getCumulativeGPA() > activeStudents[index - 1].getCumulativeGPA()) {
                        Student temp;
                        temp = activeStudents[index];
                        activeStudents[index] = activeStudents[index - 1];
                        activeStudents[index - 1] = temp;
                    }
                }
            }

            // print report  
            System.out.print ("Number of students processed: " 
                + numStudents); 
            System.out.println (); 
            System.out.println ("Below is the list of students in decreasing"
                + " order of cumulative GPA"); 
            System.out.println ("--------------------------------------------"
                + "---------------------");
            for(index = 0; index < numStudents; index++) {
                System.out.print(activeStudents[index].toString());
                if(activeStudents[index].getCreditsCompleted() >= 120) {
                    System.out.print ("\tReady to graduate\n");
                }
                else
                    System.out.println(); // print blank line

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
