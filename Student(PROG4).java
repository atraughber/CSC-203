/**
 * Keeps information about students.
 * 
 * @author (Anna Traughber) 
 * @version (April 30, 2018)
 */
import java.text.*;
public class Student
{
    // instance variables 
    private String bannerID;
    private String name;
    private int creditsCompleted;
    private double cumulativeGPA;

    /**
     * Constructor for objects of class Student
     */
    public Student(String bannerID, int creditsCompleted, double cumulativeGPA, String name)
    {
        // initialise instance variables
        this.bannerID = bannerID;
        this.name = name;
        this.creditsCompleted = creditsCompleted;
        this.cumulativeGPA = cumulativeGPA;
    }

    /**
     * Getter methods.
     */
    public String getBannerID ()
    {
        return bannerID;
    }

    public String getName ()
    {
        return name;
    }

    public int getCreditsCompleted ()
    {
        return creditsCompleted;
    }

    public double getCumulativeGPA ()
    {
        return cumulativeGPA;
    }

    public String toString ()
    {
        DecimalFormat GPAFormatter = new DecimalFormat ("0.00");
        DecimalFormat CompletedFormatter = new DecimalFormat ("000");
        String result = "";
        result = result + GPAFormatter.format(cumulativeGPA) + "\t" +
                 CompletedFormatter.format(creditsCompleted) + "\t" +
                 getBannerID() + "\t" + getName();
        return result;         
    }
}
