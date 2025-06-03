// Last updated: 03/06/2025, 09:54:57
class Solution {
public:
    int maxProfit(vector<int>& prices) {
            int maxP =0 , bestBuy =prices[0];
            for (int i =1 ; i<prices.size() ; i++){
                if  (prices[i] > bestBuy){
                    maxP = max (maxP , prices[i]-bestBuy);
                }
                bestBuy = min ( bestBuy , prices[i]);
                }
            
           return maxP ;
    }
};