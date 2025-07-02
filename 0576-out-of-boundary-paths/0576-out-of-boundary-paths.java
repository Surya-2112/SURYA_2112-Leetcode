class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long dp[][][]=new long[maxMove+1][m+2][n+2];
        int i,j,k;
        long sum=0,mod=1000000007;
        for(i=0;i<m+2;i++)
        {
            dp[0][i][0]=1;
            dp[0][i][n+1]=1;
        }
        for(i=0;i<n+2;i++)
        {
            dp[0][0][i]=1;
            dp[0][m+1][i]=1;
        }
        for(i=1;i<=maxMove;i++)
        {
            for(j=1;j<m+1;j++)
            {
                for(k=1;k<n+1;k++)
                {
                dp[i][j][k]=((dp[i-1][j+1][k]+dp[i-1][j-1][k])%mod+(dp[i-1][j][k+1]+dp[i-1][j][k-1])%mod)%mod;
                     if(j==startRow+1 && k==startColumn+1)
                     sum+=dp[i][j][k]%mod;
                }
                //System.out.println(Arrays.toString(dp[i][j]));
            }
        }
        return (int)(sum%mod);
    }
}