import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter three words: ");
      String firstWord = scan.next();
      String secondWord = scan.next();
       String thirdWord = scan.next();
        Acronym(firstWord, secondWord, thirdWord);
    }
     public static void Acronym(String firstWord, String secondWord, String thirdWord){  
// I chose this method because it allows me to access each word and the first letter seprately, then change it to a string and capitalize it
   char firstLetter = firstWord.charAt(0);
   String a = Character.toString(firstLetter).toUpperCase();
   char secondLetter = secondWord.charAt(0);
   String b = Character.toString(secondLetter).toUpperCase();
   char thirdLetter = thirdWord.charAt(0);
   String c = Character.toString(thirdLetter).toUpperCase();
   System.out.println( "The acronym is: " + a + b + c);
     }
      
    }   



