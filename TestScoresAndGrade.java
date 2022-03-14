import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Test Average and Grade programming challenge.
*/

public class TestScoresAndGrade
{
   public static void main(String[] args)
   {
      double score1,     // Test score #1
           score2,     // Test score #2
           score3,
           average; // Test score #3
    char grade;
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get three test scores from the user.
      System.out.print("Enter test score #1: \n");
      score1 = keyboard.nextDouble();
      
      System.out.print("Enter test score #2: \n");
      score2 = keyboard.nextDouble();
      
      System.out.print("Enter test score #3: \n");
      score3 = keyboard.nextDouble();
     average = calcAverage(score1,score2,score3);
     grade = determineGrade(average);
      System.out.println("Average score: " + average );
      System.out.println("Letter grade: " + grade);
      
   }
    public static double calcAverage(double score1, double score2, double score3)
    {
       double average;
       average = (score1 + score2 + score3)/3;
       return average;
        
   }
   
   public static char determineGrade(double score)
   {
      char grade; 
      if (score <= 100 && score >= 90){
         grade = 'A';
        }else if(score <= 89 && score >= 80){
            grade = 'B';
             }else if(score <= 79 && score >= 70){
                 grade = 'C';
                }else if (score <= 69 && score >= 60){
                   grade = 'D';
                }else
                    grade = 'F';
      return grade;
         
     
   }
    
}
