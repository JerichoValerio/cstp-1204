package numberlinetravel;

import java.util.HashSet;
import java.util.Set;

import javax.swing.event.SwingPropertyChangeSupport;

public class NumberLineTravel {

    /**
     * Determine how many unique cities you can visit via monorail if you are
     * limited to k kilometers per trip. You are permitted an infinite number of
     * trips. You are given an array that represents city locations and you
     * start your journey at the first city in the array.
     *
     * @param x is an array that represents the cities on a number line. The
     *          distance between city x[i] and city x[j] is | x[i]-x[j] |
     *          kilometers.
     * @param k represents the maximum distance, in kilometers, that one can
     *          travel in one monorail trip. k should be greater than 0.
     * @return the number of new cities that one can visit starting from x[0].
     * x[0] is not included in the count.
     */
    public static int howManyCitiesCanIVisit(int[] x, int k) {
        // todo: Implement this method
        Set<Integer> visitedSet = new HashSet<Integer>();
        visitedSet.add(x[0]);
        int currentCity = x[0];
        for (int i = 1; i < x.length; i++) {
            if (valid(x[i], k, visitedSet) && !visitedSet.contains(x[i])) {
                currentCity = x[i];
                visitedSet.add(x[i]);
                i = 0;
            }
        }
        return visitedSet.size() - 1;
    }

    private static boolean valid(int i, int k, Set<Integer> visitedSet) {
        boolean result = false;
        for (int yCity : visitedSet) {
            if (Math.abs(i - yCity) <= k) {
                result = true;
            }
        }

        return result;
    }


}
