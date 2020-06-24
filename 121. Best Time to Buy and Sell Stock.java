class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 0 || prices == null)  return maxProfit;
        int index1 = 0, index2 = 1;
        while(index2 != prices.length){
            if(prices[index2]>prices[index1]){
                int currProfit = prices[index2] - prices[index1];
                maxProfit = Math.max(maxProfit,currProfit);
                index2++;
            }
            else{
                index1 = index2;
                index2++;
            }
        }
        return maxProfit;
    }
}
//used two pointer method
