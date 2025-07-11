// Last updated: 03/06/2025, 09:54:39
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n= nums.size();
        vector<int>answer(n,1);
        for (int i =1 ; i<n ; i++){
            answer[i]= answer[i-1] * nums[i-1];
        }
        int s=1;
        for(int i = n-2; i>=0 ; i--){
              s= s* nums[i+1];
              answer[i] *= s;
        }
        return answer ;
    }
};