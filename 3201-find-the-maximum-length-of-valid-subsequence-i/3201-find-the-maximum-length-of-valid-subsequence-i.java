class Solution {
    public int sequence(int arr[],int ind,int value,int change)
    {   if(ind==arr.length) return 0;
        if(arr[ind]==value)
        {   if(change==1)
            {
                value=(value==0)?1:0;
            }
            return 1+sequence(arr,ind+1,value,change);
        }else{
            return sequence(arr,ind+1,value,change);
        }
    }
    public int maximumLength(int[] nums) {
        int i,max=2,len=0,j,n=nums.length;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=nums[i]%2;
        }
        max=Math.max(max,sequence(arr,0,0,0));
        max=Math.max(max,sequence(arr,0,1,0));
        max=Math.max(max,sequence(arr,0,0,1));
        max=Math.max(max,sequence(arr,0,1,1));
        return max;
    }
}