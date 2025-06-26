class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length,i,j;
        int dp[][]=new int[k+1][n];
        for(i=1;i<k+1;i++)
        {   int maxdiff=-prices[0];
            for(j=1;j<n;j++)
            {
                dp[i][j]=Math.max(dp[i][j-1],maxdiff+prices[j]);
                maxdiff=Math.max(maxdiff,dp[i-1][j]-prices[j]);
            }
        }
        // for(i=0;i<=k;i++)
        // {
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        return dp[k][n-1];
    }
}