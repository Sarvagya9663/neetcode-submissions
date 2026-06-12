class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxp = 0;
        while(r <  prices.length){
            if(prices[l] < prices[r]){
                int p = prices[r] - prices[l];
                maxp = Math.max(maxp, p);
            }
            else {
                l = r;
            }
            r++;
        }
        return maxp;
        
    }
}
