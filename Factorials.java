public class Factorials{
    
    public static int FirstFactorial(int num) {
    if(num == 0){
      num = 1;
    }else{
    for(int i = num; i > 1; i--){       
    num = num * (i-1);
    }
    return num;
  }
 
    return 1;
}

  public static void main (String[] args) {  
  for(int i = 0; i < 10; i++){
          
          System.out.println(i + "! " +  "= " + FirstFactorial(i));
        }
    }
  }
