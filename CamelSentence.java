/**
 * In this program, please 
 * (1) Accept a string such as "StopAndSmellTheRoses."
 * (2) Convert the string to a sentence in which the words are
 *     separated by spaces and only the first word starts with
 *     an uppercase letter
 * (3) display the string
 * (4) please name your java source file as CamelSentence.java
 * For example:
 * Example 1:
 * input:StopAndSmellTheRoses.
 * output:Stop and smell the roses.

 * Example 2:
 * input:KnowledgeIsPower.
 * output:Knowledge is power.
 */
import java.util.*;
public class CamelSentence {
  
  
  public static void main(String[] args) {
    // program starts running here.
    Scanner scan = new Scanner(System.in);
System.out.print("Please enter a string with lower case, upper case, and no spaces: ");
String sent = scan.nextLine();
String newW = "";
String space = " ";
for(int i = 1; i <= sent.length()-1; i++){
if(Character.isUpperCase(sent.charAt(i))){
newW =  newW + space;
}
newW = newW + Character.toLowerCase(sent.charAt(i));
   } 
   System.out.println(sent.charAt(0) + newW);
  }
  
  
}
