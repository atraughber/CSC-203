/**
 * Handles Hexadecimal Strings.
 *
 * @author (Anna Traughber)
 * @version (March 02, 2018)
 */
public class Hex
{
   /** 
    * Verify if a string is a valid hexadecimal number
    * 
    * @param hex a String
    * @return true if valid; false, otherwise
    */
   public static boolean isValid (String hex)
   {
       // this method is not implemented yet 
       return true;
   }   
   /**
    * Compute the decimal value of a valid hexadecimal number string
    * 
    * @param hex a String
    * @return int decimal value of the hexadecimal number string
    */
   public static int parseInt (String hex)
   {
       int decimalValue = 0; // final result
       int len; // length of string
       int index; // to step through the string
       char hexChar;
       // change to all uppercase and determine length
       hex = hex.toUpperCase();
       len = hex.length();
      
       for (index = 0; index < len; index++) {
           hexChar = hex.charAt(index);
           decimalValue = decimalValue * 16 + value(hexChar);
        }
        return decimalValue;
}   
   /**
    * Compute the decimal value of a single hexadecimal character
    * 
    * @param hex a character
    * @return int decimal value of the hexadecimal character
    */
   private static int value (char hexChar)
   {
       int valueOfChar = 0;
       switch (hexChar) {
           case '0': valueOfChar = 0; break;
           case '1': valueOfChar = 1; break;
           case '2': valueOfChar = 2; break;
           case '3': valueOfChar = 3; break;
           case '4': valueOfChar = 4; break;
           case '5': valueOfChar = 5; break;
           case '6': valueOfChar = 6; break;
           case '7': valueOfChar = 7; break;
           case '8': valueOfChar = 8; break;
           case '9': valueOfChar = 9; break;
           case 'A': valueOfChar = 10; break;
           case 'B': valueOfChar = 11; break;
           case 'C': valueOfChar = 12; break;
           case 'D': valueOfChar = 13; break;
           case 'E': valueOfChar = 14; break;
           case 'F': valueOfChar = 15; break;
        }
        return valueOfChar;
    }
}
