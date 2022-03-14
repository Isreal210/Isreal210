import java.util.Scanner;

    public class Ordering {
      public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter three integers: ");
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       System.out.println("The numbers in ascending order are: " + Ascending(a,b,c));
       System.out.println("The numbers in descending order are: " + Descending(a,b,c));
      }  
        
     public static String Ascending(int a, int b, int c) {   
         if((a >= b )&& (a >= c)){
             int biggest = a; 
             String firstnum = Integer.toString(biggest);
             if(b >= c){
                 int middle = b;
                  String secondnum = Integer.toString(middle);
             
             int smallest = c;
              String thirdnum = Integer.toString(smallest);
              return thirdnum + " " + secondnum + " " + firstnum;
             }
         }else if((b >= c) && (b >= a)){
             int biggest = b;
              String firstnum = Integer.toString(biggest);
             if(c >= a){
                 int middle =c;
                  String secondnum = Integer.toString(middle);
             
             int smallest = a;
              String thirdnum = Integer.toString(smallest);
              return thirdnum +  " " + secondnum +  " " + firstnum;
             }
         }if ((c >= b) && (c >= a)){
             int biggest = c;
              String firstnum = Integer.toString(biggest);
             if(b >= a){
                int middle = b;
                 String secondnum = Integer.toString(middle);
             
             int smallest= a;
              String thirdnum = Integer.toString(smallest);
              return thirdnum +  " " + secondnum +  " " + firstnum;
             }
          
         }if((a >= b )&& (a >= c)){
             int biggest = a; 
             String firstnum = Integer.toString(biggest);
             if(c >= b){
                 int middle = c;
                  String secondnum = Integer.toString(middle);
             
             int smallest = b;
              String thirdnum = Integer.toString(smallest);
              return thirdnum +  " " + secondnum +  " " + firstnum;
             }
         }else if((b >= c) && (b >= a)){
             int biggest = b;
              String firstnum = Integer.toString(biggest);
             if(a >= c){
                 int middle =a;
                  String secondnum = Integer.toString(middle);
             
             int smallest = c;
              String thirdnum = Integer.toString(smallest);
              return thirdnum +  " " + secondnum +  " " + firstnum;
             }
       }if ((c >= b) && (c >= a)){
             int biggest = c;
              String firstnum = Integer.toString(biggest);
             if(a >= b){
                int middle = a;
                 String secondnum = Integer.toString(middle);
             
             int smallest= b;
              String thirdnum = Integer.toString(smallest);
              return thirdnum +  " " + secondnum +  " " + firstnum;
             }
       }
          return null;
   }    
   
    
         
    
    public static String Descending(int a, int b, int c) {
          if((a >= b )&& (a >= c)){
             int biggest = a; 
             String firstnum = Integer.toString(biggest);
             if(b >= c){
                 int middle = b;
                  String secondnum = Integer.toString(middle);
             
             int smallest = c;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
         }else if((b >= c) && (b >= a)){
             int biggest = b;
              String firstnum = Integer.toString(biggest);
             if(c >= a){
                 int middle =c;
                  String secondnum = Integer.toString(middle);
             
             int smallest = a;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
         }if ((c >= b) && (c >= a)){
             int biggest = c;
              String firstnum = Integer.toString(biggest);
             if(b >= a){
                int middle = b;
                 String secondnum = Integer.toString(middle);
             
             int smallest= a;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
          
         }if((a >= b )&& (a >= c)){
             int biggest = a; 
             String firstnum = Integer.toString(biggest);
             if(c >= b){
                 int middle = c;
                  String secondnum = Integer.toString(middle);
             
             int smallest = b;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
         }else if((b >= c) && (b >= a)){
             int biggest = b;
              String firstnum = Integer.toString(biggest);
             if(a >= c){
                 int middle =a;
                  String secondnum = Integer.toString(middle);
             
             int smallest = c;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
       }if ((c >= b) && (c >= a)){
             int biggest = c;
              String firstnum = Integer.toString(biggest);
             if(a >= b){
                int middle = a;
                 String secondnum = Integer.toString(middle);
             
             int smallest= b;
              String thirdnum = Integer.toString(smallest);
              return firstnum +  " " + secondnum +  " " + thirdnum;
             }
       
   
         
         
    }
        return null;
    }
    }
