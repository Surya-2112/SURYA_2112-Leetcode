class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int n=arr.length,i,j;
        Set<Integer> s=new HashSet<Integer>();
        for(i=0;i<n;i++)
        {
            s.add(arr[i]);
            for(j=i-1;j>=0;j--)
            {
                if(arr[j]==(arr[i]|arr[j])) break;
                arr[j] = arr[j] | arr[i];
                s.add(arr[j]);
            }
        }
        return s.size();
    }
}