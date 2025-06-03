// Last updated: 03/06/2025, 09:55:15
class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length -1 ;
        int w = 0;
        int mv = 0;
        while ( l < r ){
            w = r - l;
            int h =  Math.min (arr [l] , arr[r]);
            int v = w * h;
            mv = Math.max(v, mv);
             // Move l forward while arr[l] <= h
            while (l < r && arr[l] <= h) l++;
            // Move r backward while arr[r] <= h
            while (l < r && arr[r] <= h) r--;
        }
        return mv;
    }
}