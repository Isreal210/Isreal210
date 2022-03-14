import java.util.Scanner;


public class OddFives {
    
    public static void main(String[] args) {
      int number;
      int newnumber = 0;
     final int SENTINEL = -1;
     Scanner in = new Scanner(System.in);
      System.out.print("Enter a positive integer or -1 to exit: ");
      number = in.nextInt();
     if(isOdd(number) && hasFive(number) == true){
           newnumber = number + newnumber;
        
         }
           
       while (number != SENTINEL) {  // Read until input is -1
          
           System.out.print("Enter a positive integer or -1 to exit: ");
           number = in.nextInt();
           if(isOdd(number) && hasFive(number) == true){
           newnumber = number + newnumber;
        
         }
           
       }       
       System.out.println("The magic sum is: " + newnumber);
    }
    
    public static boolean isOdd(int number){
        return number % 2 != 0;
    }
    public static boolean hasFive(int number){
     
       for(int i = 0; i < Integer.toString(number).length(); i++){
           if(Integer.toString(number).charAt(i) == '5'){
               return true;
           }
       }
       return false;
    }
    
}
