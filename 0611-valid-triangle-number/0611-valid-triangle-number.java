class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int i,j,k=0,l=0,n=nums.length,sum=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {   k=j+1;
                l=n-1;
                while(k<=l)
                {
                    int mid=k+(l-k)/2;
                    //System.out.println(nums[i]+" "+nums[j]+" "+nums[mid]);
                    if(nums[i]+nums[j]>nums[mid])
                    {
                        k=mid+1;
                    }else{
                        
                        l=mid-1; 
                    }
                     
                  //  break;
                }
                sum+=(k-j-1);
            }
            

        }
        return sum;
    }
}