// Last updated: 03/06/2025, 09:55:10
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c=0;
        set<int>st;
        for(int i=0 ; i<nums.size() ; i++)
        {
            st.insert(nums[i]);
        }
        for(auto it=st.begin() ; it!=st.end() ; it++)
        {
            nums[c]=*(it);
            c++;
    }
         return(c);
    }
};