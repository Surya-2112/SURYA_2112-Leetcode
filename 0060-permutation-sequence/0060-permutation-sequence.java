class Solution {
    public String getPermutation(int n, int k) {
        int num=1,i;
        List<Integer> l=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        for(i=1;i<n;i++)
        { num*=i;
            l.add(i);
        }
        l.add(n);
        n--;
        while(num>0&&l.size()>0 && n>0)
        {
            int m=(k-1)/num;
             str.append(l.get(m));
             l.remove(m);
            k-=(m*num);
            num/=n;
            n--;
        }
        str.append(l.get(0));
        return str.toString();
    }
}