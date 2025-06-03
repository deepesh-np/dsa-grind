// Last updated: 03/06/2025, 09:55:22
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
      set<char> chars;
        int maxi = 0;
        int l = 0, r = 0;
        while(r < s.length()){
            if(chars.count(s[r])>0){
                while(s[l]!=s[r]){
                    chars.erase(s[l]);
                    l++;
                }
                l++;
            }
            chars.insert(s[r]);
            maxi = max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
};