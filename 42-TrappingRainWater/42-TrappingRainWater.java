// Last updated: 03/06/2025, 09:55:03
class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int i, waterlevel,trapped=0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]= height[0];
        for (i=1; i<n; i++){
           leftmax[i] = Math.max (height[i], leftmax[i-1]);
        }
        rightmax[n-1]= height[n-1];
        for (i=n-2; i>=0; i--){
            rightmax[i]= Math.max (height[i], rightmax[i+1]);
        }
        
        for (i=0; i<n; i++){
            waterlevel= Math.min(leftmax[i],rightmax[i]);
            trapped += waterlevel- height[i];

        }
        return trapped;
    }
}