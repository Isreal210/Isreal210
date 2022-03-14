
/**
 *
 * @author amir
 */
public class FibonacciNumbers {

    // The sequence should look like as below
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    // start the 
   public static int num(int num1)
    {
       for (int i = 2; i <num1; i++) {
       
        
            n2 = n0 + n1;
            System.out.print(", " + n2);
            n0 = n1;
            n1 = n2;
        }
        System.out.println("");
        return(num1);
    }
    
    static int n0 = 0, n1 = 1, n2 = 0;
    public static void main(String[] args){
      
  System.out.print(n0 + ", " + n1);
        //We are starting the loop form 2. So, we should take care of 0 and 1
        num(10);

}
}
