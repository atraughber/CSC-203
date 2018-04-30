/**
 * Represents possible majors for Bachelor's Degree
 * 
 * Data from National Association of Colleges and 
 * Employer's Surveys are used for starting salaries.
 * 
 * @author (Anna Traughber) 
 * @version (April 18, 2018)
 */
import java.text.*;
public class Major
{
    // instance variables 
    private int startSalary2014;
    private int startSalary2013;
    private double percentIncrease;
    private String description;
    
    /** 
     * Constructor for objects of class Major 
     */
    public Major (int startSalary2014, int startSalary2013, String description)
    {
        this.startSalary2014 = startSalary2014;
        this.startSalary2013 = startSalary2013;
        this.description = description; 
        percentIncrease = (startSalary2014 - startSalary2013) * 100.0 / startSalary2013;
    }

    
    /** 
     * getter methods 
     */
    public int getStartSalary2014 ()
    {
        return startSalary2014;
    }
    public int getStartSalary2013 ()
    {
        return startSalary2013;
    }
    public double getPercentIncrease ()
    {
        return percentIncrease;
    }
    public String getDescription ()
    {
        return description;
    }

    
    /** 
     * toString method
     */
    public String toString () 
    { 
        DecimalFormat increaseFormatter = new DecimalFormat ("00.00");
        DecimalFormat salaryFormatter = new DecimalFormat ("$00,000"); 
        String result = ""; 
        result = result 
            + salaryFormatter.format (startSalary2014) + "    " 
            + salaryFormatter.format (startSalary2013) + "    "; 
        if (percentIncrease >= 0 ) 
            result = result + "+"; 
        result = result 
            + increaseFormatter.format (percentIncrease) + "%   " 
            + description; 
        return result;     
    }   
}
