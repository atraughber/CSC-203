/**
 * Keeps track of dollars and cents.
 * 
 * @author (Anna Traughber) 
 * @version (April 25, 2018)
 */
public class Money
{
    // instance variables
    protected int dollars;
    protected int cents;

    /**
     * Constructor for objects of class Money
     */
    public Money(int dollars, int cents)
    {
        assert(dollars >= 0 && cents >= 0);
        // initialise instance variables
        this.dollars = dollars + cents / 100;
        this.cents = cents % 100;
    }

    /**
     * Getter methods. 
     */
    public int getDollars()
    {
        return dollars;
    }

    public int getCents()
    {
        return cents;
    }
}
