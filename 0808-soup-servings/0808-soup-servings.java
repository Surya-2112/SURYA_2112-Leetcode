public class Solution {
	 public static HashMap<List<Integer>,Double> h;
	    public static double make(int a,int b)
	    {  if(h.containsKey(Arrays.asList(a,b)))
	        {
	            return h.get(Arrays.asList(a,b));
	        }
	        double ans=0.0;
	        if((a-100)<=0) ans+=0.25;
	        else ans += 0.25*make(a-100,b);
	        if((a-75)<=0 && (b-25)<=0) ans+=0.125;
	        else if((a-75)<=0) ans+=0.25;
	        else if((b-25)>0) ans+=0.25*make(a-75,b-25);
	        if((a-50)<=0 && (b-50)<=0) ans+=0.125;
	        else if((a-50)<=0) ans+=0.25;
	        else if((b-50)>0) ans+=0.25*make(a-50,b-50);
	        if((a-25)<=0 && (b-75)<=0) ans+=0.125;
	        else if((a-25)<=0) ans+=0.25;
	        else if((b-75)>0) ans+=0.25*make(a-25,b-75);
	        h.put(Arrays.asList(a,b),ans);
	        return ans;
	    }
	    public static double soupServings(int n) {
            if(n>5000) return 1.0;
            if(n==0) return 0.5;
	        if(h==null){
	        h=new HashMap<List<Integer>,Double>();
	        }
	        make(n,n);
	        return h.get(Arrays.asList(n,n));
	    }
}