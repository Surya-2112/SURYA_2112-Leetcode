class Solution {
    int max=0;
    public static Set<String> l;
    public void pickNotPick(char arr[],int ind ,int  n,String str,int open)
    {   if(open<0) return ;
         StringBuilder s=new StringBuilder(str);
       if(str.length()+(n-ind)<max) return ;
        while(ind<n &&arr[ind]!='(' && arr[ind]!=')')
        {
            s.append(arr[ind++]);
        }
        if(ind==n)
        {   str=s.toString();
             if(open==0)
             {   if(max<str.length())
                {   max=str.length();
                    l=new HashSet<String>();
                }
                if(max==str.length())
                l.add(str);
             }
            return ;
        }
        if(arr[ind]=='(') open++;
        else open--;
        s.append(arr[ind]);
        pickNotPick(arr,ind+1,n,s.toString(),open);
        s.setLength(s.length()-1);
         if(arr[ind]=='(') open--;
        else open++;
        pickNotPick(arr,ind+1,n,s.toString(),open);
    }
    public List<String> removeInvalidParentheses(String s) {
        l=new HashSet<>();
        l.add("");
        int max=0;
        char arr[]=s.toCharArray();
        int n=arr.length;
        pickNotPick(arr,0,n,"",0);
        return new ArrayList<String>(l);
    }
}