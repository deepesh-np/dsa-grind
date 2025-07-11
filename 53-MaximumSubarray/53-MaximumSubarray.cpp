// Last updated: 03/06/2025, 09:55:06
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum = INT_MIN , currSum = 0 ;
        for(int val : nums){
            currSum = currSum + val;
            maxSum = max( currSum , maxSum);
            if ( currSum < 0)
            currSum = 0;
        } 
        return maxSum ;
    }
};