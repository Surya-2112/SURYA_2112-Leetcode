class Solution {
    public int countSquares(int[][] matrix) {
       int i,j,n=matrix.length,m=matrix[0].length,count=0;
       int dp[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {   if(matrix[i][j]==0) continue;
                if(i==0 || j==0)
                {
                    dp[i][j]=matrix[i][j];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                }
                count+=dp[i][j];
            }
        }
        return  count;
    }
}