package lab3;

import examples.Die;

/**
 * Describe class <code>DiceGames</code> here.
 *
 * @author <a href="mailto:dcooper@CheyneyCompSci.local">David Cooper</a>
 * @version 1.0
 */
public class DiceGames {
    Die Computer = new Die(6);
    Die User = new Die(6);
    Die SinglePlayer = new Die(6);
    private int SPpoints = 10;

    // Add necessary fields here:

    
    /**
     * Creates a new <code>DiceGames</code> instance.
     *
     * fill in for problems 2 and 3
     */
    public DiceGames() {

    }

    // 
    /**
     * Describe <code>playVsGame</code> method here.
     *
     * for problem 2
     *
     * @param n an <code>int</code> value
     * @return a <code>String</code> value
     */
    public String playVsGame(int n)  {
        int rolls = n;
        int ComputerScore = 0;
        int UserScore = 0;
        for(int i = 0; i<=n; i++){
            User.roll();
            Computer.roll();
            if(Computer.getValue() > User.getValue()){
                ComputerScore++;
            }
             if(Computer.getValue() < User.getValue()){
                UserScore++;
            }
              if(Computer.getValue() == User.getValue()){
                ComputerScore++;
                UserScore++;
            }
        }
       String a = "The grand winner after rolling the dice " + n + " times is Computer!";
       String b = "The grand winner after rolling the dice " + n + " times is User!";
         String c = "No grand winner after rolling the dice " + n + " times!";
         String d = "No games played!";
         if( n < 1){
               return d;
         }
           if(ComputerScore > UserScore){
              return a;
            }else if(ComputerScore < UserScore){
                return b;
            }else if(ComputerScore == UserScore){
              return c;
           }
       
       return null;
    }

    // 
    /**
     * Describe <code>playWagerGame</code> method here.
     *
     * for pr]oblem 3
     *
     * @param wager an <code>int</code> value
     * @param guess an <code>int</code> value
     * @return an <code>int</code> value
     */
    public int playWagerGame(int wager, int guess) {
         SinglePlayer.roll();  
         if(SPpoints < 1){
         return -4;
         }  
         if(wager > 3 || wager < 1){
            return -3;
       
        }   
        if(guess > 6 || guess < 1){
             return -5;
           
        }
       
         if((wager <= 3 && wager >= 1) && (wager > SPpoints)){
                return SPpoints - wager;  
        }
         if(!(guess == SinglePlayer.getValue())){
             SPpoints =  SPpoints - wager;
                return SPpoints;             
         }else if(guess == SinglePlayer.getValue()){
             if(wager == 1){
                SPpoints += 2;
                 return SPpoints;
             }
              if(wager == 2){
                 SPpoints += 6;
                 return SPpoints;
             }else if(wager == 3){
                   SPpoints += 12;
                  return SPpoints;
              }
          }
         
        return 0;        
    }
}
