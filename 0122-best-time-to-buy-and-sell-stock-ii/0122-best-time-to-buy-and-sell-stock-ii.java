class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,i,max=0;
        for(i=0;i<n-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                max+=(prices[i+1]-prices[i]);
            }
        }
        return max;
    }
}