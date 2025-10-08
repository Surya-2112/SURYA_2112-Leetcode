class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length,i,m=potions.length;
        int ans[]=new int[n];
        for(i=0;i<n;i++)
        {  int j=0,k=m-1;
            while(j<=k)
            {  int mid=j+(k-j)/2;
               if(((long)spells[i]*potions[mid])<success)
               {
                    j=mid+1;  
               }else{
                    k=mid-1;
               }
            }
            ans[i]=m-k-1;
        }
        return ans;
    }
}