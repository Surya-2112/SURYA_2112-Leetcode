class Solution {
    public static int arr[]=new int[100001];
    public static int last=0;
    public int[] countBits(int n) {
        if(n<=last)
        return Arrays.copyOfRange(arr,0,1);
        int i;
        for(i=last;i<=n;i++)
        {
            if(i%2==0)
            arr[i]=arr[i/2];
            else
            arr[i]=arr[i/2]+1;
        }
        return Arrays.copyOfRange(arr,0,n+1);
    }
}