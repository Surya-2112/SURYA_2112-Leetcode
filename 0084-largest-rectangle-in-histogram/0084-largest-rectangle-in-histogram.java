class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
       int i,n=heights.length,max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i])
            {
                int pre=-1,val=heights[stack.pop()];
                if(!stack.isEmpty()) pre=stack.peek();
                max=Math.max(max,val*(i-pre-1));
            }
            stack.push(i);
        }
         while(!stack.isEmpty() )
            {
                int pre=-1,val=heights[stack.pop()];
                if(!stack.isEmpty()) pre=stack.peek();
                max=Math.max(max,val*(i-pre-1));
            }
        return max;
    }
}