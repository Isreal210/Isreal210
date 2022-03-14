package lab3;

import examples.Die;

/**
 * write a class that has an array of five dice for a player and classifies the highest combination of 
 * dice values given the following ordering:
 *
 * five of a kind
 * four of a kind
 * three of a kind
 * a pair
 *
 * @author 
 * @version 1.0
 */
public class FiveDice {

    /**
     *  rolls the dice and returns a String representing the highest combination of 
     *  dice values. If using the CountValues object, then each time rollDice() 
     *  is called, it should create a new CountValues object to keep track of the rolls.
     *
     * @return a <code>String</code> value
     */
      private Die[] dice;
        Die highest = new Die(6);
    public FiveDice(){
         
        dice = new Die[5];
        for(int i =0; i < dice.length; i++){
            dice[i] = new Die(6);
        }
    }
     public String rollDice() {  
          CountValues HC = new CountValues(1,6); 
         for(int i = 0; i < dice.length; i++){
            highest.roll();
        int val =  highest.getValue();
          HC.count(val);
      }
            
     String a = "Player has five of a kind of " + HC.getMostFrequent() +  "s";
     String b = "Player has four of a kind of "  +  HC.getMostFrequent() + "s";
     String c = "Player has three of a kind of "  +  HC.getMostFrequent() + "s";
     String d = "Player has a pair of "  +  HC.getMostFrequent() + "s";
               if(HC.getMaxCount() == 5 ){
                 return a;
               }else if(HC.getMaxCount() == 4 ){
                return b;
               }else if(HC.getMaxCount()== 3){
                return c;
                 }else if(HC.getMaxCount()== 2){
                return d;
               }
         return a;
     }
     
        

    /**
     * returns the values of the Die[] array as an int[] array
     *
     * @return an <code>int[]</code> value containing the values of each Die.
     */
    public int[] getLastRoll() {
         int [] LastRoll = new int[5];
        for(int i = 0; i < dice.length; i++){
           highest.roll();
       LastRoll[i] = highest.getValue();
  }
        return LastRoll;
    }
        

}
