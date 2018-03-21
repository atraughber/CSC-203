/**
 * Computation relating to time.
 * 
 * @author (Anna Traughber) 
 * @version (March 21, 2018)
 */
public class Time
{
    // instance variables 
    private int hour;            // valid range 1-12
    private int minute;          // valid range 0-59
    private boolean amIndicator; // true, if AM 

    /**
     * Constructor for objects of class Time
     */
    public Time(int hour, int minute, boolean beforeNoon)
    {
        // initialize instance variables
        assert (1 <= hour && hour <= 12 && 0 <= minute && minute <= 59); 
        this.hour = hour; this.minute = minute; 
        amIndicator = beforeNoon; 
    }

    /**
     * Advance minute by 1; does not change hour
     * 
     * @param      none
     * @return     void 
     */
    public void advanceMinute()
    {
        // valid range for minute is 0-59
        minute++; 
        if (minute == 60) 
            minute = 0; 
        return;
    }

    /**
     * Advance hour by 1; may change amIndicator
     * 
     * @param      none
     * @return     void 
     */
    public void advanceHour()
    {
        // valid range for hour is 1-12
        hour++; 
        if (hour == 13) 
            hour = 1; 
        if (hour == 12) 
            amIndicator = !amIndicator; 
        return;
    }

    /**
     * Check for equality of time
     * 
     * @param      time     a parameter of type Time 
     * @return     boolean  true of this Time object matches the paramater 
     *                      passed; false, otherwise 
     */
    public boolean equals (Time time)
    {
        return (this.hour == time.getHour() && this.minute == time.getMinute() 
            && this.amIndicator == time.isAM()); 
    }

    /** Check for relative order of time
     * 
     * @param      time     a paramter of type Time
     * @return     int      returns -1 if this Time object precedes the parameter 
     *                      passed; returns 0 if equal; returns +1 if this Time 
     *                      object follows the parameter passed  
     */
    public int compareTo (Time time)
    {
        if (this.amIndicator != time.isAM())
            if (this.amIndicator) 
                return -1; 
            else 
                return +1; 
        else { 
            if (this.hour != time.getHour()) 
                if ((this.hour % 12) < (time.getHour() % 12)) 
                    return -1; 
                else 
                    return +1;
            else 
            if (this.minute != time.getMinute())
                if (this.minute < time.getMinute()) 
                    return -1; 
                else 
                    return +1; 
            else 
                return 0;               
        }   
    }

    /**
     * getter methods    
     */
    public int getHour ()  { return hour; }

    public int getMinute() { return minute; }

    public boolean isAM () { return amIndicator; }

    /** 
     * toSting method 
     */
    public String toString()
    {
        String time = ""; 
        if (hour < 10) 
            time = time + " " + hour + ":"; 
        else 
            time = time + hour + ":";           
        if (minute < 10) 
            time = time + "0" + minute; 
        else 
            time = time + minute;  
        if (amIndicator) 
            time = time + " AM"; 
        else 
            time = time + " PM";  
        return time; 
    }
}
