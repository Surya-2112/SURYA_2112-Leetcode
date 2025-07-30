class Solution {
    public int[] smallestSubarrays(int[] nums) {
      int n=nums.length,i,j;
      int bits[]=new int[32];
      int ans[]=new int[n];
      Arrays.fill(ans,1);
      for(i=n-1;i>=0;i--)
      {
         for(j=0;j<31;j++)
         {
            if((nums[i]>>j&1)>0)
            {
                bits[j]=i;
            }
            ans[i]=Math.max(ans[i],bits[j]-i+1);
         }
      }
      return ans;
    }
}