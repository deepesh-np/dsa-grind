// Last updated: 03/06/2025, 09:55:08
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int c=0;
        multiset<int>ms;
        int s=nums.size();
        for(int i=0 ; i<s ; i++)
        {
           ms.insert(nums[i]);
        }
        
        ms.erase(val); //erase all val occurance at once
        auto it=ms.begin();
        for(int j=0 ; j<ms.size() ; j++){
        nums[j]=*(it);
            c++; it++;
        }

        return c ;
    }
};