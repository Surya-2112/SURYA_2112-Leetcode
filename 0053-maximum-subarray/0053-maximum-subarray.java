class Solution {
    public int maxSubArray(int[] nums) {
        int i,j,n=nums.length,sum=0,max=0,ne=0;
        for(i=0;i<n;i++)
        {   sum=nums[i];
            if(sum<=0)
                continue;
           ne=0;
            for(j=i+1;j<n;j++)
            {   if(sum>max)
                max=sum;
                sum+=nums[j];
                if(nums[i]<0)
                    ne++;
                if(sum<=0)
                    break;
            }
            if(sum>max)
                max=sum;
            if(ne==0 && sum>0)
                break;
        }
        if(max==0)
        {
            Arrays.sort(nums);
            return nums[n-1];
        }
        return max;
    }
}