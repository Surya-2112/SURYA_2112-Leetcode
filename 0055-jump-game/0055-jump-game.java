class Solution {
    public boolean canJump(int[] nums) {
      int rec=0,i=0,n=nums.length;
      for(i=0;i<n;i++)
      {
        if(i>rec) return false;
        rec=Math.max(rec,nums[i]+i);
        if(rec>=n-1) return true;
      }
      return false;
    }
}