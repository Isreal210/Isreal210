package lab3;

public class CountValues {
     private int[] counts;

    /**
     * Describe variable <code>minValue</code> here.
     *
     */
    private int minValue;

    
    /**
     * Creates a new <code>CountValues</code> instance.
     *
     * @param minValue an <code>int</code> value
     * @param numberOfValues an <code>int</code> value
     */
    public CountValues(int minValue, int numberOfValues) {
         this.minValue = minValue;
         counts = new int [numberOfValues];
       
    }

    /**
     * Describe <code>count</code> method here.
     *
     * @param value an <code>int</code> value
     * @return a <code>boolean</code> value
     */
    public boolean count(int value) {
        int index = value - minValue;
        if((index < 0) || (index >= counts.length)){
         return false;
        }else{
        counts[index] = counts[index] + 1;
        }
        return true;
    }


    /**
     * Describe <code>getMaxCount</code> method here.
     *
     * @return an <code>int</code> value
     */
    public int getMaxCount() {
    int maxSoFar = 0;
    for(int i = 0; i < counts.length; i++){
        if(maxSoFar <= counts[i]){
            maxSoFar = counts[i];
        }
    }
        return maxSoFar;
    }

    /**
     * Describe <code>getMostFrequent</code> method here.
     *
     * @return an <code>int</code> value
     */
    public int getMostFrequent() {
        int maxSoFar = 0;
        int mostFrequent = 0;
         for(int i = 0; i < counts.length; i++){
        if(maxSoFar <= counts[i]){
            maxSoFar = counts[i];
            mostFrequent = i + minValue;
        }
    }

        return mostFrequent;
    }
}

