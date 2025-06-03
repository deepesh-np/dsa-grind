// Last updated: 03/06/2025, 09:54:55
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // STEP 1: Sort by starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                // Merge intervals
                current[1] = Math.max(current[1], next[1]);
            } else {
                list.add(current);
                current = next;
            }
        }

        list.add(current);

        return list.toArray(new int[list.size()][]);
    }
}

