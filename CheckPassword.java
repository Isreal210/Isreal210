/**
 * Imagine you are developing a software package for Amazon.com
 * that requires users to enter their own passwords. 
 * Your software requires that users' passwords meet the following
 * criteria:
 * (1) The password should be at least six characters long
 * (2) The password should contain at least one uppercase and
 * at least one lowercase letter
 * (3) The password should have at least one digit
 * (4) If the password meet the requirement, please display 
 * "true", otherwise, display "false".
 * Please write a program and name it CheckPassword.java
 * For example:
 * Example 1:
 * input: "1234"
 * output: false
 * Example 2: "Abc123!"
 * output: true
 */
import java.util.*;
public class CheckPassword {
  
  
  public static void main(String[] args) {
    // program starts running here.
    
Scanner scan = new Scanner(System.in);
String pwd = scan.nextLine();
int LC = 0;
int DC = 0;
int UC = 0;
for(int i = 0; i <= pwd.length()-1; i++){
 if(Character.isUpperCase(pwd.charAt(i))){
    UC++;
  }}
  for(int j = 0; j <= pwd.length()-1; j++){
 if(Character.isLowerCase(pwd.charAt(j))){ 
  LC++;
 }}
     for(int k= 0; k <= pwd.length()-1; k++){
  if(Character.isDigit(pwd.charAt(k))){ 
   DC++;
   }
}
 if(pwd.length() >= 6){
if((LC > 0)&&(DC > 0)&&(UC > 0)){
System.out.println("true");
}else{System.out.println("false");
     }
  
  }else{System.out.println("false");

  }
}
}

