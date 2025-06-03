// Last updated: 03/06/2025, 09:54:54
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = m * n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int midVal = matrix[mid / n][mid % n];
            
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}