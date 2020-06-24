class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null ||prices.length == 0) return 0;
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){  
                profit = profit + prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
//Line 6 checks with the next element. If next element is greater, pofit can be made
