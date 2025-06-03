// Last updated: 03/06/2025, 09:54:59
class Solution {
    public int maxSubArray(int[] arr) {
        int mehere = arr[0];  
        int msfar = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            mehere = Math.max(arr[i], mehere + arr[i]);
            msfar = Math.max(msfar, mehere);
        }

        return msfar;
    }
}
