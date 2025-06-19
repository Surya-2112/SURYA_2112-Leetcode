class Solution {
    public void compo(String num,int n,int ind,   List<List<String>>com,List<String> str)
    {  int i,j;
        if(n<=ind){
            //System.out.println()
            com.add(str);
            return ;
        }
       String arr[]=new String[]{"*","+","-"};
       if(ind==0)
       { for(i=ind+1;i<=n;i++){
           List<String> st=new ArrayList<>();
           String s=num.substring(ind,i);
           if(s.charAt(0)=='0'&& (Long.parseLong(s)!=0 || s.length()>1 )) continue;
              st.add(s);
            compo(num,num.length(),i,com,st);
          }
       }else
       { for(i=ind+1;i<=n;i++){
           for(String c:arr)
           { List<String> st=new ArrayList<>(str);
             String s=num.substring(ind,i);
            if(s.charAt(0)=='0'&&(Long.parseLong(s)!=0 || s.length()>1) ) continue;
              st.add(c);
              st.add(s);
              compo(num,num.length(),i,com,st);
           }
       }    
       }
        return ;
    }
    public List<String> addOperators(String num, int target) {
        List<List<String>> com=new  ArrayList<>();
        List<String> ans=new ArrayList<>();
        compo(num,num.length(),0,com,ans);
        //System.out.println(com);
        Stack<String> op=new Stack<>();
        Stack<Long>   val=new Stack<>();
        for(List<String> l:com)
        {  StringBuilder str=new StringBuilder();
            for(String c:l)
            {    str.append(c);
                if(c.equals("+") || c.equals("-") || c.equals("*"))
                {
        
                        while(!(op.isEmpty() || (c.equals("*") && 
                        (op.peek().equals("+") || op.peek().equals("-")))))
                        {
                        String ch=op.pop();
                        long b=val.pop(),a=val.pop();
                        if(ch.equals("*")) val.add(a*b);
                        else if(ch.equals("+")) val.add(a+b);
                        else val.add(a-b);
                        }
                        op.add(c);
                }
                else{
                    val.add(Long.parseLong(c));
                }
            }  
            while(!op.isEmpty()){
                String ch=op.pop();
                long b=val.pop(),a=val.pop();
                if(ch.equals("*")) val.add(a*b);
                else if(ch.equals("+")) val.add(a+b);
                else val.add(a-b);
            }
            long x=val.pop();
            //System.out.println(str+" "+x);
            if(x==target)
            {
                ans.add(str.toString());
            }
        }
        return ans;
    }
}