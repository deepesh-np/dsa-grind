// Last updated: 03/06/2025, 09:55:24
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int,int>map;
        for(int i=0 ; i<nums.size() ; i++){
            int d= target - nums[i];

            if(map.find(d) != map.end())
                return{i,map[d]};

                map[nums[i]]=i;

            

        }return{ };
    }
};