import java.util.Scanner;

/**
 *
 * @author toluadegbie
 */

public class PBMPixel {
    private int value;
   PBMPixel(Scanner s) {
 
     value = s.nextInt();
           
  }
  
   public int getValue(){
       return value;
   }
    public  int getInvertedValue(){
        if(value == 0){
            return 1;
        }
        return 0;
    }
}
