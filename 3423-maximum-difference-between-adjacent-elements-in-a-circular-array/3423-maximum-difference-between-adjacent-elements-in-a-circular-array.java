class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0,n=nums.length,pre=nums[n-1],i;
            for(i=0;i<n;i++)
                {
                  max=Math.max( max,Math.abs(nums[i]-pre));
                    pre=nums[i];

                }
        return max;
            }
}