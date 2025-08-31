class Solution {
    public boolean isNumber(String s) {
        int si=0,d=0,e=0,n=0,i=0,m=s.length()-1,f=1;
        for(char c:s.toCharArray())
        {  // System.out.println(si+" "+d+" "+e+" "+n+" "+f);
            if(f==1 && (c=='+' || c=='-') && (si<=0)) si++;
            else if(c=='.'&& d==0 && e==0) d++;
            else if((i>0 && i<m)&&(c=='e' ||c=='E')&& e==0 && n>0 ){e++;
            f=1;
            si--;
            i++;
            n=0;
            continue;
            }
            else if(c>='0' && c<='9') n++;
            else return false;
            i++;
            f=0;
        }
        if(n==0) return false;
        return true;
    }
}