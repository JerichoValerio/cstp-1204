package ranges;

import java.util.ArrayList;
import java.util.Set;

public class OverlappingRanges {

    /**
     * Returns the smallest integer that is present in the maximum number of
     * input ranges
     * todo smallest is 3
     *
     * @param startPoints the list of starting points for the ranges
     * @param endPoints   the list of end points for the ranges
     * @return the smallest integer that is present in the maximum number of
     * ranges
     * @throws NoOverlapException when there is no overlap between any of the ranges
     */


    public static Integer maxOverlapInt(ArrayList<Integer> startPoints,
                                        ArrayList<Integer> endPoints) throws NoOverlapException {
        // TODO: Implement this method

        if (startPoints == null || endPoints  == null) {
            throw new IllegalArgumentException();
        }
        if (startPoints.isEmpty() || endPoints.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (int startPoints.size() != endPoints.size()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < startPoints.size(); i++){
            if (startPoints.get(i) > endPoints.get(i)) {
                throw new IllegalArgumentException();
            } int [] arr = new int [1000];
        }
    }
