class Solution {
    public void addall (int arr[][],int i,int j,int n,int m,List<Integer> l)
    {
        if(i<0 || j<0 ||i==n || j==n) return ;
        l.add(arr[i][j]);
         addall(arr,i+1,j-1,n,m,l);
    }
    public int[] findDiagonalOrder(int[][] mat) {
        int count=0,n=mat.length,m=mat[0].length,i,j,k=0;
        int arr[]=new int[n*m];
        for(i=0;i<m;i++)
        {   List<Integer> l=new ArrayList<>();
            addall(mat,0,i,n,m,l);
            if(count%2==1){
            for(j=0;j<l.size();j++)
            {
                arr[k++]=l.get(j);
            }}else{
                for(j=l.size()-1;j>=0;j--)
                {
                arr[k++]=l.get(j);
                }   
            }
            count++;
        }
        for(i=1;i<n;i++)
        {
            List<Integer> l=new ArrayList<>();
            addall(mat,i,m-1,n,m,l);
            if(count%2==1){
            for(j=0;j<l.size();j++)
            {
                arr[k++]=l.get(j);
            }}else{
                for(j=l.size()-1;j>=0;j--)
                {
                arr[k++]=l.get(j);
                }   
            }
            count++;
        }
        return arr;
    }
}