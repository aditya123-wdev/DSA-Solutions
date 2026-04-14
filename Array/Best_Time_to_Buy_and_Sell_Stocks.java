class Solution {
    public int profit(int[] prices){
         int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProf = Math.max(maxProf, prices[i] - minPrice);
            }
        }

        return maxProf;
    
    }
    public int maxProfit(int[] prices) {
        return profit(prices);
    }
}
