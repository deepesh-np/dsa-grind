// Last updated: 03/06/2025, 09:54:29
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int repeated = -1;
        int missing = -1;

        // Check 1 to n^2 for missing and repeated
        for (int i = 1; i <= size; i++) {
            int freq = map.getOrDefault(i, 0);
            if (freq == 2) repeated = i;
            else if (freq == 0) missing = i;
        }

        return new int[]{repeated, missing};
    }
}
