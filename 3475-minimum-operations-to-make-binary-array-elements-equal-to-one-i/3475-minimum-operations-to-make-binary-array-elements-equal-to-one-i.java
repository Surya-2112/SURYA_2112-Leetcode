class Solution {
    public int minOperations(int[] arr) {
        int n=arr.length,count=0,i=0,j;
        while(i<n-2)
        {  if(arr[i]==1){
            i++;
            continue;
            }
            count++;
            for(j=i;j<i+3 && j<n;j++)
            { 
             if(arr[j]==0)
                 arr[j]=1;
            else
                arr[j]=0;
            }
        }
        for(i=n-3;i<n;i++)
        {
            if(arr[i]==0)
              return -1;
        }
        return count;
    }
}