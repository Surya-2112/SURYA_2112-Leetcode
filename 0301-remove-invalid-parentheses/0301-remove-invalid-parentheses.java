class Solution {
    int max=0;
    public static Set<String> l;
    public boolean isVaild(String str)
    {
        int count=0;
        for(char c:str.toCharArray())
        {
           if(c=='(') count++;
           if(c==')') count--;
           if(count<0) return false;
        }
        return count==0;
    } 
    public void pickNotPick(char arr[],int ind ,int  n,String str)
    {  StringBuilder s=new StringBuilder(str);
        while(ind<n &&arr[ind]!='(' && arr[ind]!=')')
        {
            s.append(arr[ind++]);
        }
        if(ind==n)
        {   str=s.toString();
             if(isVaild(str))
             {   if(max<str.length())
                {   max=str.length();
                    l=new HashSet<String>();
                }
                if(max==str.length())
                l.add(str);
             }
            return ;
        }
        s.append(arr[ind]);
        pickNotPick(arr,ind+1,n,s.toString());
        s.deleteCharAt(s.length()-1);
        pickNotPick(arr,ind+1,n,s.toString());
    }
    public List<String> removeInvalidParentheses(String s) {
        l=new HashSet<>();
        int max=0;
        char arr[]=s.toCharArray();
        int n=arr.length;
        pickNotPick(arr,0,n,"");
        return new ArrayList<String>(l);
    }
}