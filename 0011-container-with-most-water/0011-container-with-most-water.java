class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;  
        while(i<j)
        {
           
            if(height[i]<height[j]){
                 max=Math.max(height[i]*(j-i),max);
                i++;
            }
            else
            { max=Math.max(height[j]*(j-i),max);
                j--;
            }
        }  
        return max;   
    }
}