class Solution {
    public int jump(int[] nums) {
        int cur=0,i=0,n=nums.length,j=0,max=0,end=0;
        for(i=0;i<n-1;i++)
        {
            max=Math.max(max,nums[i]+i);
            if(cur==i)
            {
                j++;
                cur=max;
            }
        }
        return j;
    }
}