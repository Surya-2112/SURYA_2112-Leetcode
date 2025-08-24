class Solution {
    public int longestSubarray(int[] nums) {
       int count=0,i,max=0,n=nums.length;
       List<Integer> l=new ArrayList<>();
       for(i=0;i<n;i++)
       {
            if(nums[i]==1) 
            {
                count++;
                continue;
            }else{
                l.add(count);
                count=0;
            }
       }
    l.add(count);
    max=Math.max(max,l.get(0));
    for(i=0;i<l.size()-1;i++)
    {
        max=Math.max(max,l.get(i)+l.get(i+1));
    }
    if(max==n) return n-1;
    return max;
    }
}