// Last updated: 03/06/2025, 09:54:50
class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                c0++;
            if (nums[i] == 1)
                c1++;
            if (nums[i] == 2)
                c2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(c0 != 0) {
                nums[i]=0;
                c0--;
            }
            else if(c1 != 0){
            nums[i]=1;
            c1--;
            }
            else
            nums[i]=2;
        }
    }
}