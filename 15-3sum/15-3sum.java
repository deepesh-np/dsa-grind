// Last updated: 03/06/2025, 09:55:14
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; // skip same element

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicates
                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;

                } else if (sum < 0) {
                    left++; // need bigger sum
                } else {
                    right--; // need smaller sum
                }
            }
        }
        return res;
    }
}
