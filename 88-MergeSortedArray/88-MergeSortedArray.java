// Last updated: 03/06/2025, 09:54:48
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
          for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}