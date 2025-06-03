// Last updated: 03/06/2025, 09:55:17
class Solution {
public:
    bool isPalindrome(int x) {
       string n = to_string(x);
       string d=n;
       reverse(d.begin(), d.end());
       if (d==n)
       return 1;
       else
       return 0; 
    }
};