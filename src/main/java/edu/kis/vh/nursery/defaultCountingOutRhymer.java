package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTALRETURN = -1;

    private int[] numbers = new int[12];

    public int total = TOTALRETURN;

    
    /** 
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    
    /** 
     * @return boolean
     */
    public boolean callCheck() {
        return total == TOTALRETURN;
    }

    
    /** 
     * @return boolean
     */
    public boolean isFull() {
        return total == 11;
    }

    
    /** 
     * @return int
     */
    protected int peekaboo() {
        if (callCheck())
            return TOTALRETURN;
        return numbers[total];
    }

    
    /** 
     * @return int
     */
    public int countOut() {
        if (callCheck())
            return TOTALRETURN;
        return numbers[total--];
    }

}
