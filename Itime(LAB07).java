/**
 * To keep track of time intervals for activities. 
 * 
 * @author (Anna Traughber) 
 * @version (March 28, 2018)
 */
public class Itime
{
    private int minutes;
    private double seconds;

    /**
     * Constructor for objects of class Itime
     */
    public Itime(int minutes, double seconds)
    {
        // initialise instance variables
        assert(minutes >= 0 && (seconds >= 0 && seconds < 60));
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Getter methods
     * 
     * @param    none
     * @return   minutes and seconds
     */
    public int getMinutes()
    {
        return minutes;
    }
    public double getSeconds()
    {
        return seconds;
    }
    /**
     * toString method
     */
    public String toString()
    {
        return(minutes + " minutes and " + seconds + " seconds");
    }
    /**
     * Adds the time values and returns the total time.
     * 
     * @param    Itime bTime
     * @return   int and double
     */
    public Itime addItime(Itime bTime)
    {
        int totalMinutes;
        double totalSeconds;
        totalMinutes = bTime.getMinutes() + this.minutes;
        totalSeconds = bTime.getSeconds() + this.seconds;
        if(totalSeconds >= 60){
            totalSeconds = totalSeconds - 60;
            totalMinutes = totalMinutes + 1;
        }
        return new Itime(totalMinutes, totalSeconds);
    }
}
