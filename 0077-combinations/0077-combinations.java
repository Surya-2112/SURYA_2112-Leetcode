class Solution {
    public void com(int n,List<List<Integer>> ans,List<Integer> l,int k,int i)
    {  if(i==n+2)
       {
         return ;
       }
       if(l.size()==k) 
       {
        ans.add(l);
        return ;
       }
       for(int j=i;j<=n;j++)
       {  List<Integer> list=new ArrayList<>(l);
          list.add(j);
          com(n,ans,list,k,j+1);
       }
    }
    public List<List<Integer>> combine(int n, int k) {
        int i,j;
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        com(n,l,list,k,1);
        return l;
    }
}