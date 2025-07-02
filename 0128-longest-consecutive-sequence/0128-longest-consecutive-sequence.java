class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(n==0) return 0;
        int count=1,pre=nums[0],max=0,i,n=nums.length;
        for(i=1;i<n;i++)
        {  // System.out.println(count);
            if(nums[i]==pre) continue;
            if(nums[i]==pre+1)
            { 
                count++;
            }
            else {
                max=Math.max(max,count);
                count=1;
            }
            pre=nums[i];
        }
         max=Math.max(max,count);
        return max;
    }
}