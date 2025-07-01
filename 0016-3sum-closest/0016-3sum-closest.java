class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length,sum=0,diff=Integer.MAX_VALUE,max=-1,i,j,k;
        for(i=0;i<n;i++)
        {   sum+=nums[i];
            for(j=i+1;j<n;j++)
            {   sum+=nums[j];
                for(k=j+1;k<n;k++)
                {
                    sum+=nums[k];
                    if(Math.abs(sum-target)<diff)
                    {
                        diff=Math.abs(sum-target);
                        max=sum;
                    }
                    sum-=nums[k];
                } sum-=nums[j];
            }sum-=nums[i];
        }
        return max;
    }
}