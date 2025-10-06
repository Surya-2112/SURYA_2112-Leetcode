class Pair{
    int val,f, s;
    Pair(int val,int f,int s)
    {
        this.val=val;
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        int max=grid[0][0],n=grid.length,m=grid[0].length;
        boolean vist[][]=new boolean[n][m];
        vist[0][0]=true;
        pq.add(new Pair(grid[0][0],0,0));
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            max=Math.max(p.val,max);
            if(p.f==n-1 && p.s==m-1)
            {
                return max;
            }
            int x=p.f,y=p.s;
            if(x-1>=0 && !vist[x-1][y])
            {  vist[x-1][y]=true;
                pq.add(new Pair(grid[x-1][y],x-1,y));
            }
            if(y-1>=0 && !vist[x][y-1])
            {  vist[x][y-1]=true;
                pq.add(new Pair(grid[x][y-1],x,y-1));
            }
             if(x+1<n && !vist[x+1][y])
            {  vist[x+1][y]=true;
                pq.add(new Pair(grid[x+1][y],x+1,y));
            }
            if(y+1<m && !vist[x][y+1])
            {  vist[x][y+1]=true;
                pq.add(new Pair(grid[x][y+1],x,y+1));
            }
        }
        return max;
    }
}