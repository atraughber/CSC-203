/**
 * For use in calendar-related computation.
 * 
 * @author (Anna Traughber) 
 * @version (February 7, 2018)
 */

public class MyCalendar
{
    /**
     * Check for leap year
     * 
     * @param  year   an int for year
     * @return        true if leap year; false, otherwise
     */
    public static boolean isLeapYear(int year)
    {
        boolean leapYear; 
        leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
        return leapYear;
    }

    /**
     * Compute next leap year
     * 
     * @param  year   an int for year
     * @return        if the given year is a leap year
     *                   simply return the same;
     *                else
     *                   compute & return next leap year 
     */
    public static int nextLeapYear(int year)
    {
        int newYear = 0; // next leap year to be computed  
        if (MyCalendar.isLeapYear(year)) 
            newYear = year; 
        else {
            // assign newYear a value higher than year
            // that is the next multiple of 4
            newYear = year - year % 4  + 4;
                 
            // if newYear is a multiple of 100 but not a multiple of 400,
            // change it by adding 4 to it
            if (newYear % 100 == 0 && newYear % 400 != 0)  
                newYear = newYear + 4;
 
        }
        return newYear;
    }    
}
