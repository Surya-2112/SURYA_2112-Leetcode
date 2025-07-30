class Solution {
    public static int dp[];
    public int BST(int n)
    {
        if(dp[n]!=0) return dp[n];
        for(int i=0;i<n;i++)
        {
            dp[n]+=BST(i)*BST(n-i-1);
        }
        return dp[n];
    }
    public int numTrees(int n) {
        if(dp==null)
        {
            dp=new int[20];
            dp[1]=1;
            dp[0]=1;
        }
        if(dp[n]!=0) return dp[n];
        return BST(n);
    }
}