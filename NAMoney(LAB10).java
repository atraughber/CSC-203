/**
 * Keeps track of North American money, creates string,
 * and adds amount together.
 * 
 * @author (Anna Traughber) 
 * @version (April 25, 2018)
 */
public class NAMoney extends Money
{
    // instance variables
    private String kind;

    /**
     * Constructor for objects of class NAMoney
     */
    public NAMoney(int dollars, int cents, String kind)
    {
        super(dollars, cents);
        assert(dollars >= 0 && cents >= 0 && 
              (kind.equals("US") || kind.equals("CN")));
        // initialise instance variables
        this.kind = kind;
    }

    /**
     * Getter method.
     */
    public String getKind()
    {
       return kind;
    }
   
    /*
     * toString method
     */
    public String toString()
    {
        String s = (kind + ("$ ") + dollars + ("."));
        if(cents >= 10)
            s = s + cents;
        else
            s = s + ("0" + cents);
        return s;    
    }
    
    /*
     * addMoney method
     * 
     * @param   NAMoney  amount2
     * @return  NAMoney  amount3
     */
    public NAMoney addMoney(NAMoney amount2)
    {
        NAMoney amount3;
        int totalDollars = dollars + amount2.getDollars();
        int totalCents = cents + amount2.getCents();
        String totalKind = kind;
        amount3 = new NAMoney(totalDollars, totalCents, totalKind);
        return amount3;
    }
}
