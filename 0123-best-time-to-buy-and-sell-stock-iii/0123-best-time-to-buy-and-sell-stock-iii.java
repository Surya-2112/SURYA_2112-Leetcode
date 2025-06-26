class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,i,j,k;
        int dp[][]=new int[3][n+1];
        for(i=1;i<3;i++)
        {
            for(j=1;j<n+1;j++)
            {   for(k=0;k<j;k++){
                int sum=prices[j-1]-prices[k];
               // System.out.println(sum+dp[i-1][j]);
                dp[i][j]=Math.max(dp[i][j],Math.max(dp[i][j-1],sum+dp[i-1][k]));
                }
                //System.out.println(dp[i][j]);
            }
        }
       // for(i=0;i<3;i++) System.out.println(Arrays.toString(dp[i]));
        return dp[2][n];
    }
}