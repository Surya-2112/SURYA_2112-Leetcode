class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0,r=0,n;
         count+=numBottles;
        while(numBottles>=numExchange)
        {   n=(numBottles)/numExchange;
            r=numBottles%numExchange;
            numBottles=n+r;
            System.out.println(n+" "+r+" "+count);
            count+=n;
        }
        return count;
    }
}