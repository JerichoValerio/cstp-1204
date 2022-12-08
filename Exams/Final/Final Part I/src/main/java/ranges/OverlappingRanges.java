package ranges;

import java.util.ArrayList;

public class OverlappingRanges {

	/**
	 * Returns the smallest integer that is present in the maximum number of
	 * input ranges
	 * todo smallest is 3
	 *
	 * @param startPoints
	 *            the list of starting points for the ranges
	 * @param endPoints
	 *            the list of end points for the ranges
	 * @return the smallest integer that is present in the maximum number of
	 *         ranges
	 * @throws NoOverlapException
	 *             when there is no overlap between any of the ranges
	 */


	public static Integer maxOverlapInt(ArrayList<Integer> startPoints,
			ArrayList<Integer> endPoints) throws ranges.NoOverlapException {
		// TODO: Implement this method
		endPoints.add(n[3]);

		int validRange = n[3];
		for (int i = 1; i < x.length; i++) {
			if (valid(x[i], k, visitedSet) && !visitedSet.contains(x[i])) {
				validRange = x[i];
				endPoints.add(x[i]);
			}
			return endPoints.size() -1;
		}



		return 0;
	}

}
