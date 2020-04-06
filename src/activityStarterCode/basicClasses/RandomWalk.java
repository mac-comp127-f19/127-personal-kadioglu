package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int walkValue;
    private static final int MAX_VALUE = 255;
    private static final int MIN_VALUE = 0;

    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int initVal) {
        walkValue = initVal;
        rng = new Random();
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return walkValue ; //TODO - this is not correct.
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {
        if (rng.nextBoolean() && walkValue != 255) {
                    walkValue++;
                }
        else if (walkValue != 0) walkValue--;


        return getValue();
    }
}

