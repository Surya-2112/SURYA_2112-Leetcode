class Solution {
    public int[] sumZero(int n) {
        int i;
        int arr[]=new int[n];
        for(i=0;i<(n/2);i++)
        {
            arr[i]=-(i+1);
        }
        for(i=0;i<(n/2);i++)
        {
            arr[(n/2)+i]=(i+1);
        }
        return arr;
    }
}