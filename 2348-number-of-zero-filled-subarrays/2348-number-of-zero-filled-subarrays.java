class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i,j=-1,n=nums.length;
        long count=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count+=(i-j);
            }else{
                j=i;
            }

        }
        return count;
    }
}