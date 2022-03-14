/**
 * File: Lab1.java
 * Author: Isreal Adegbie
 * Purpose: Java Review
 * Date: 1/30/22
 * Course: CSC142
 *
 */

public class Lab1 {
    
   public static int countOhs(String testString) {
        int count = 0;
        for(int i = 0; i < testString.length(); i++ ){
            if((testString.charAt(i) == 'O') || (testString.charAt(i) == 'o')){
                count++;
            }
        }        
        return count; 
    }
  /**
     * Given a word, print it vertically: e.g.
     * "good" becomes:
     * g
     * o
     * o
     * d
     *
     * @param printMe - the String to print vertically
     */
   
    public static void printVertical(String printMe) {
       for (int i = 0; i < printMe.length(); i++){
            System.out.println(Character.toUpperCase(printMe.charAt(i)));
         }      
    }
   /**
     * Given two words, print them vertically: e.g.
     * "hot soup" becomes:
     * h s
     * o o
     * t u
     *   p
     * @param firstWord - the first String to print vertically
     * @param secondWord - the first String to print vertically
     */
    public static void printVertical(String firstWord, String secondWord) {
        // fill in code here:
            
        if (firstWord.length() == secondWord.length()){   
        for (int i = 0; i < firstWord.length(); i++){
         System.out.print(firstWord.charAt(i));
         System.out.println(" " + secondWord.charAt(i));
        }}else if (firstWord.length() > secondWord.length()){
        int LongerWord =  firstWord.length() - secondWord.length();

        for(int j = 0; j < LongerWord; j++){
        secondWord = secondWord + " ";
        }
       
       for (int i = 0; i < firstWord.length(); i++){
        System.out.print(firstWord.charAt(i));
      System.out.println(" " + secondWord.charAt(i));
     
        }
        }else if(firstWord.length() < secondWord.length()){
     int LongerWord =  secondWord.length() - firstWord.length();
     for(int j = 0; j < LongerWord; j++){
        firstWord = firstWord + " ";
        }
        for (int i = 0; i < firstWord.length(); i++){
         System.out.print(firstWord.charAt(i));
         System.out.println(" " + secondWord.charAt(i));
        }
        }
    }
  
    /**
     * @returns true - only when either first or second is true, but not both.
     * @param first - the first boolean to check
     * @param second - the second boolean to check
     */
    public static boolean xOR(boolean first, boolean second) {
        // fill in code here:
         if(first != second){
         return true;
        }        // fix this to return the right thing at the right time.
        return false; 
    }
    
}
