class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0,i,n=prices.length;
       for(i=0;i<n;i++)
       {
        max=Math.max(max,prices[i]-min);
        min=Math.min(min,prices[i]);
       }
        return max;
    }
}