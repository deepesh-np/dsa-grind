// Last updated: 03/06/2025, 09:55:20
class Solution {
public:
    int maxArea(vector<int>& height) 
    {
        int l = 0, r = height.size() - 1, ans = -1;
        while(l<r){
            int temp = min(height[l], height[r]);
            int water = abs((l-r)*temp);
            ans = max(ans,water);
            if (height[l] < height[r]) l++;
            else r--;
        }
        return ans;

    }
};