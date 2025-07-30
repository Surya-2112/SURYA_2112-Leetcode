class Solution {
    public int longestSubarray(int[] nums) {
        int i,n=nums.length,count=1,max=0,ans=0,pre=-1;
        for(i=0;i<n;i++)
        {
            if(pre==nums[i])
            {
                count++;
            }else{
                pre=nums[i];
                count=1;
            }
           if(max<nums[i]||(max==nums[i] && count>ans))
           { max=nums[i];
            ans=count;
           }
        }
        return ans;
    }
}