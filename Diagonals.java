import java.util.Scanner;
public class Diagonals {
    
    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       System.out.println("Please enter an integer: ");
       int howMany = scan.nextInt();
       size(howMany);
    }
    public static int size(int lines){
        for(int i = 1; i <= lines; i++){
            for(int j= 1 ; j < i; j++){
                    System.out.print(" ");
                }
                System.out.println("L");
           
        }
         return lines;
    }
      
    }
    

