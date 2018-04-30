/**
 * Used for tracking deposits into an account.
 * 
 * @author (Anna Traughber) 
 * @version (April 25, 2018)
 */
import java.util.*; 
public class CheckingAccount
{
    public static void main(String[] args) 
    {
        String accountKind; String depositKind; // US or CN dollar for account and deposit
        int dollars, cents;
        NAMoney balance, deposit, convertedDeposit;  
        Scanner keyboard = new Scanner (System.in); // to read user input

        // display purpose 
        System.out.println ("This program tracks deposits in "
            + "dollars and cents,"); 
        System.out.println ("in US or CN currencies.  Invalid " 
            + "currency value"); 
        System.out.println ("leads to termination of program."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Anna Traughber\tVersion: April 25, 2018");
        System.out.println ();  // print blank line 

        // Obtain account type -- either US or CN  
        System.out.print ("Enter US or CN to indicate"  
            + " type of account maintained: ");   
        accountKind = keyboard.next(); 
        while (!accountKind.equals("US") && !accountKind.equals("CN")) { 
            System.out.print ("Enter US or CN to indicate"  
                + " type of account maintained: ");   
            accountKind = keyboard.next();
        }

        // create zero balance object of account kind and print 
        balance = new NAMoney (0, 0, accountKind); 
        System.out.println ("Initial balance is " + balance.toString());  
        System.out.println ();  // print blank line

        // Get deposit amount
        System.out.print ("Enter currency kind of deposit, dollars, "
            + "and cents: "); 
        depositKind = keyboard.next();
        dollars = keyboard.nextInt();
        cents = keyboard.nextInt();        
        CurrencyConverter v = new CurrencyConverter();

        // process valid deposits 
        while ((depositKind.equals("US") || depositKind.equals("CN"))
        && dollars >= 0 && cents >= 0) { 
            // create deposit object with input values 
            deposit = new NAMoney(dollars, cents, depositKind); 
            // convert deposit amount to account kind
            convertedDeposit = v.convertNAMoney(deposit, accountKind); 
            System.out.println ("Amount credited to the account is " + 
                convertedDeposit.toString ()); 

            // add converted deposit to balance 
            balance = balance.addMoney(convertedDeposit); 
            System.out.println ("Current balance is " + balance.toString());  
            System.out.println ();  // print blank line 

            // Get deposit amount
            System.out.print ("Enter currency kind of deposit, dollars, "
                + "and cents: "); 
            depositKind = keyboard.next();
            dollars = keyboard.nextInt();
            cents = keyboard.nextInt();

        }

        // print final balance
        System.out.println (); // print blank line
        System.out.println("Final balance is " + balance.toString());

        System.out.println ();  // print blank line 
        System.out.println ("Thank you for your business."); 
        System.out.println ();  // print blank line 
    }        
}
