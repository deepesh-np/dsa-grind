// Last updated: 03/06/2025, 09:54:35
class Solution {
public:
    void reverseString(vector<char>& s) {
        int st , end ;
        st = 0;
        
        end = (s.size()-1);
        while (st<end){
            
            swap (s.at(st),s.at(end));
            st++;
            end--;
        }
        
    }
};