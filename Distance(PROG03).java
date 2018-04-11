/**
 * Small java program that will keep track
 * of the total distance covered by a biker
 * in a trip. 
 *
 * @author (Anna Traughber)
 * @version (April 08, 2018)
 */
public class Distance
{
    // constant variables
    public static final int YARDS_IN_MILE = 1760;
    public static final int FEET_IN_YARD = 3;    

    // instance variables
    private int miles;
    private int yards;
    private int feet;

    /**
     * Constructor for objects of class Distance
     */
    public Distance(int miles, int yards, int feet)
    {
        // initialise instance variables
        assert((miles >= 0) && (yards >= 0) && (feet >= 0) && (yards < YARDS_IN_MILE) && (feet < FEET_IN_YARD));
        this.miles = miles;
        this.yards = yards;
        this.feet = feet; 
    }

    /**
     * Method that finds out if there was a valid Distance inputted.
     * 
     * @param  int miles
     * @param  int yards
     * @param  int feet 
     * @return  boolean  true if they can form a valid Distance; otherwise, false. 
     */
    public static boolean isValidDistance(int miles, int yards, int feet) 
    {
        if((miles < 0 || yards < 0 || feet < 0) || (yards >= YARDS_IN_MILE || feet >= FEET_IN_YARD))
            return false;
        return true;    
    }

    /**
     * Getter methods
     *
     * @param   none
     * @return  miles, yards, and feet  
     */
    public int getMiles()
    {
        return miles;
    }

    public int getYards()
    {
        return yards;
    }

    public int getFeet()
    {
        return feet;
    }

    /**
     * Adds the distance values and returns the total distance.
     * 
     * @param Distance bDistance
     * @return  int
     */
    public Distance addDistance(Distance bDistance)
    {
        int totalMiles;
        int totalYards;
        int totalFeet;
        totalMiles = bDistance.getMiles() + this.miles;
        totalYards = bDistance.getYards() + this.yards;
        totalFeet = bDistance.getFeet() + this.feet;
        if(totalFeet >= FEET_IN_YARD) {
            totalFeet = totalFeet - FEET_IN_YARD;
            totalYards = totalYards + 1;
        }
        if(totalYards >= YARDS_IN_MILE) {
            totalYards = totalYards - YARDS_IN_MILE;
            totalMiles = totalMiles + 1;
        }      
        return new Distance(totalMiles, totalYards, totalFeet);
    }

    /**
     * toString method
     */
    public String toString()    
    {
        return(miles + "m:" + yards + "y:" + feet + "f"); 
    }
}
