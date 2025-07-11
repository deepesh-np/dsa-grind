// Last updated: 03/06/2025, 09:54:23
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<string, int> prefixMap;
        
        for (int num : arr1) {
            string strNum = to_string(num);
            string prefix = "";
            for (char ch : strNum) {
                prefix += ch;
                prefixMap[prefix]++;
            }
        }
        
        int maxLength = 0;
         for (int n : arr2) {
            string strNum = to_string(n);
            string pre = "";
            for (char ch : strNum) {
                pre += ch;
                if (prefixMap.find(pre) != prefixMap.end()) {
                    maxLength = max(maxLength, static_cast<int>(pre.length()));
                }
            }
        }
        
        return maxLength;
    }
};