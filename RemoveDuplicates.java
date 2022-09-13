/*
 * Remove duplicate letters in a string.
 * Givin a string S of lowercase letters, a duplicate removal 
 * consists of choosing two adjacent and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * Example 1
 * input: "xyyxzx"
 * output: "zx"
 * Explanation: In "xyyxzx", the first round removeal is "yy".
 * After "yy" has been removed, the string is "xxzx". Then, in the next round,
 * "xx" will be removed. "zx" is the final result.
 * Please name your java file as RemoveDuplicates.java
 */
import java.util.*;
public class RemoveDuplicates {
  
  public static void main(String[] args) {
     // program starts here.
 Scanner keyboard = new Scanner(System.in);
String Dupli = keyboard.nextLine();
for(int i = 0; i < Dupli.length()-1; i++){
if(Dupli.charAt(i) == Dupli.charAt(i+1)){
Dupli= Dupli.substring(0,i)+""+Dupli.substring(i+2,Dupli.length());
  i=0;
}


} 
 System.out.print(Dupli);


  }
}
  
