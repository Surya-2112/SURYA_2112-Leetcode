class Solution {
    public static List<List<Integer>> x=new ArrayList<>();
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex<x.size())
         return x.get(rowIndex);
         int i,j;
        for(i=x.size();i<=rowIndex;i++)
        {  List<Integer> l=new ArrayList<>();
           for(j=0;j<i;j++)
           {
             if(j==0)
              l.add(1);
              else 
               l.add((x.get(i-1).get(j-1)+x.get(i-1).get(j)));
           }
           l.add(1);
           x.add(l);
        }
        return x.get(rowIndex);
    }
}