class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,i;
        if((nums[0]+nums[1])<=nums[2]) return "none";
        if(nums[0]==nums[1] && nums[0]==nums[2]) return "equilateral";
        if(nums[0]==nums[1] || nums[0]==nums[2] || nums[2]==nums[1]) 
        return "isosceles";
        return "scalene";
    }
}