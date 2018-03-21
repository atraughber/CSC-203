/**
 * Simulate an alarm clock.
 * 
 * @author (Anna Traughber) 
 * @version (March 21, 2018)
 */
public class AlarmClock
{
    // instance variables - replace the example below with your own
    private Time clockTime;
    private Time alarmTime;

    /**
     * Constructor for objects of class AlarmClock
     */
    public AlarmClock()
    {
        // initialise instance variables
        clockTime = new Time(12, 0 , true);
        alarmTime = new Time(12, 0 , true);        
    }

    /**
     * Getter method.
     * 
     * @param      none
     * @return      cloclTime
     */
    public Time getClockTime ()
    {
        return clockTime;
    }

    /**
     * Getter method.
     * 
     * @param      none
     * @return      cloclTime
     */
    public Time getAlarmTime ()
    {
        return alarmTime;
    }

    /** 
     * Allows setting the clock
     * 
     * @param      hourDesired      an integer in the range 1-12    
     * @param      minuteDesired    an integer in the range 0-59 
     * @param      amIndicatorDesired   a boolean
     * @return     void
     */
    public void setClock (int hourDesired, int minuteDesired, boolean amIndicatorDesired) 
    {
        while(clockTime.getMinute() != minuteDesired) {
            clockTime.advanceMinute();
        }   
        while(clockTime.getHour() != hourDesired) {
            clockTime.advanceHour();
        }
        clockTime.isAM();
        if(clockTime.isAM() != amIndicatorDesired){
            for (int i = 0; i < 12; i++)
                clockTime.advanceHour();
        }
    }   

    /** 
     * Allows setting the alarm
     * 
     * @param      hourDesired      an integer in the range 1-12    
     * @param      minuteDesired    an integer in the range 0-59 
     * @param      amIndicatorDesired   a boolean
     * @return     void
     */
    public void setAlarm (int hourDesired, int minuteDesired, boolean amIndicatorDesired)
    {
        while(alarmTime.getMinute() != minuteDesired) {
            alarmTime.advanceMinute();
        }   
        while(alarmTime.getHour() != hourDesired) {
            alarmTime.advanceHour();
        }
        alarmTime.isAM();
        if(alarmTime.isAM() != amIndicatorDesired){
            for (int i = 0; i < 12; i++)
                clockTime.advanceHour();
        }
    }
}
