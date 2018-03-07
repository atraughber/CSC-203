/**
 * Handles Roman Numeral Strings.
 * 
 * @author (Anna Traughber) 
 * @version (January 31, 2018)
 */
public class Roman
{
    /**
     * Verify if a string is a valid roman numeral 
     * 
     * @param   roman   a String 
     * @return  true    if valid; false, otherwise
     */
    public static boolean isValid (String roman)
    {
        // this method is not implemented yet
        return true; 
    }

    /**
     * Compute the decimal value of a valid roman numeral string 
     * 
     * @param   roman   a String 
     * @return  int     decimal value of the roman numeral string
     */
    public static int parseInt (String roman)
    {
        int decimalValue; // final result
        int len; // length of the string 
        int index; // to step through the string 
        char currentChar; 
        int valueOfCurrentChar, valueOfPrevChar; 

        // change to all uppercase and determine length
        roman = roman.toUpperCase();
        len = roman.length(); 

        // process first character
        currentChar = roman.charAt(0); 
        valueOfCurrentChar = Roman.value (currentChar); 
        decimalValue = valueOfCurrentChar; 

        // process the rest, one char at a time
        valueOfPrevChar = valueOfCurrentChar;
        for (index = 1; index < len; index++) {
            currentChar = roman.charAt(index); 
            valueOfCurrentChar = Roman.value (currentChar); 
            if (valueOfCurrentChar <= valueOfPrevChar) 
                decimalValue = decimalValue + valueOfCurrentChar; 
            else 
                decimalValue = decimalValue + valueOfCurrentChar 
                - 2 * valueOfPrevChar; 
            valueOfPrevChar = valueOfCurrentChar; 
        }
        return decimalValue;
    }

    /**
     * Compute the decimal value of a single roman character 
     * 
     * @param   roman   a character 
     * @return  int     decimal value of the roman character
     */
    private static int value (char romanChar)
    {
        int valueOfChar; 
        switch (romanChar) {
            case 'M': valueOfChar = 1000; break; 
            case 'D': valueOfChar =  500; break; 
            case 'C': valueOfChar =  100; break; 
            case 'L': valueOfChar =   50; break; 
            case 'X': valueOfChar =   10; break; 
            case 'V': valueOfChar =    5; break; 
            case 'I': valueOfChar =    1; break; 
            default:  valueOfChar =    0; break; 
        }
        return valueOfChar;   
    }
}
