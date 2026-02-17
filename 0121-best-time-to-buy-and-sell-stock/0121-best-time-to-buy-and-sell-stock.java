class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, buy = prices[0], res = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            res = Math.max(res, prices[i]-buy);
        }

        return res== Integer.MIN_VALUE? 0 : res;
    }
}