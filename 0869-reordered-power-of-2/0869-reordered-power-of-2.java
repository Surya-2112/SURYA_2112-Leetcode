class Solution {
    public boolean reorderedPowerOf2(int n) {
        int i,digit=0,min=1,max=1,pow=1;
       // if(n%10==0) return false;
        List<Integer> l=new ArrayList<>();
        int frq[]=new int[10];
        while(n>0)
        {
            frq[n%10]++;
            n/=10;
            digit++;
            min*=10;
            max*=10;
        }
        min/=10;
        min-=1;
        for(i=1;i<32;i++)
        {   if(pow>max) break;
            if(pow>min) l.add(pow);
            pow*=2;
        }
       // System.out.println(l);
        for(int num:l)
        {   int check[]=new int[10];
            while(num>0)
            {
                check[num%10]++;
                num/=10;
            }
            int f=0;
            for(i=0;i<10;i++)
            {
                if(frq[i]!=check[i]) 
                {
                    f=1;
                    break;
                }
            }
            if(f==0) return true; 
        }
        return false;
    }
}