import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by the starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Initialize current interval (ci) as the first interval
        int[] ci = intervals[0];

        // Step 3: Create a list to store merged intervals
        ArrayList<int[]> res = new ArrayList<>();

        // Step 4: Traverse the rest of the intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] ni = intervals[i]; // next interval

            // If current interval overlaps with next (i.e., end >= start of next)
            if (ci[1] >= ni[0]) {
                // Merge them by extending the end of current interval
                ci[1] = Math.max(ci[1], ni[1]);
            } else {
                // If no overlap, add current interval to result and move to next
                res.add(ci);
                ci = ni;
            }
        }

        // Add the last interval after loop
        res.add(ci);

        // Convert ArrayList to 2D array and return
        return res.toArray(new int[res.size()][]);
    }
}
