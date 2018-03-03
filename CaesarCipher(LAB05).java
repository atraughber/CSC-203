/**
 * Performs simple substitution cipher. 
 * Needs an int key for shift in the alphabet. 
 * 
 * @author (Anna Traughber) 
 * @version (February 28, 2018)
 */
public class CaesarCipher
{
    // private named constants 
    private final int ALPHABET_SIZE = 26; 
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // private instance variables
    private int shiftKey; // shift key supplied to the constructor
    private int effKey;   // effective key value
    private String encodeMap = ""; // used for encrypting 
    private String decodeMap = ""; // used for decrypting
    
    /**
     * Constructor for objects of class with an int key for encode 
     */
    public CaesarCipher(int key)
    {
        // set the values for shiftKey and effKey        
        shiftKey = key; 
        effKey = key % ALPHABET_SIZE;  
    
        // construct encode map 
        encodeMap = ALPHABET.substring (effKey, ALPHABET_SIZE) +
                    ALPHABET.substring (0, effKey); 
         
        // construct decode map
        decodeMap = ALPHABET.substring (ALPHABET_SIZE - effKey, ALPHABET_SIZE) +
                    ALPHABET.substring (0, ALPHABET_SIZE - effKey);
    }

    /**
     * Encrypt the plain text using the encode map
     * 
     * @param      plainText    a String to be encrypted  
     * @return     String       encrypted text 
     */
    public String encrypt (String plainText)
    {
        String cipherText = ""; 
        int index; // loop control 
        char plainCh, plainUpper, cipherCh, cipherUpper; 
        int plainPos; // position of plainCh in ALPHABET

        int length = plainText.length();
        for (index = 0; index < length; index++) { 
            plainCh = plainText.charAt(index); 
            plainUpper = Character.toUpperCase(plainCh); 
            plainPos = ALPHABET.indexOf(plainUpper); 
            if (plainPos == -1) { 
                // plainCh is not in ALPHABET
                cipherCh = plainCh; 
            }
            else {
                // plainCh is in ALPHABET
                cipherUpper = encodeMap.charAt(plainPos); 
                if (Character.isUpperCase(plainCh)) 
                    cipherCh = cipherUpper; 
                else 
                    cipherCh = Character.toLowerCase(cipherUpper); 
            }
            cipherText = cipherText + cipherCh; 
        }  
        return cipherText; 
    }

    /**
     * Decrypt the cipher text using the decode map
     * 
     * @param      cipherText   a String to be decrypted  
     * @return     String       decrypted text 
     */
    public String decrypt (String cipherText)
    {
        String plainText = ""; 
        int index; // loop control
        char plainCh, plainUpper, cipherCh, cipherUpper;
        int cipherPos; // position of plainCh in ALPHABET
        
        int length = cipherText.length();
        for (index = 0; index < length; index++) {
            cipherCh = cipherText.charAt(index);
            cipherUpper = Character.toUpperCase(cipherCh);
            cipherPos = ALPHABET.indexOf(cipherUpper);
            if (cipherPos == -1) {
                // plainCh is not in ALPHABET
                plainCh = cipherCh;
            }    
            else {
                // plainCh is in ALPHABET
                plainUpper = decodeMap.charAt(cipherPos);
                if (Character.isUpperCase(cipherCh))
                    plainCh = plainUpper;
                else
                    plainCh = Character.toLowerCase(plainUpper);
                }
                plainText = plainText + plainCh;
            }    
        return plainText; 
    }
}
