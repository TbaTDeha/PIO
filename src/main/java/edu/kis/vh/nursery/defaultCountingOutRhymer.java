package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NAME = -1;

    private int[] numbers = new int[12];

    public int total = NAME;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NAME;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NAME;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NAME;
        return numbers[total--];
    }

}
