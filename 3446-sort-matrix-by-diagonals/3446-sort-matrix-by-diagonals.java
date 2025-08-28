class Solution {
    public void Diagonal(int grid[][],int x,int y,int n,int m,PriorityQueue<Integer> pq)
    { // System.out.println(x+" "+y);
        if(x>=n ||y>=m) return ;
        pq.add(grid[x][y]);
        Diagonal(grid,x+1,y+1,n,m,pq);
        grid[x][y]=pq.remove();
    }
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length,m=grid[0].length,i,j;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(i=n-1;i>=0;i--)
        {
            Diagonal(grid,i,0,n,m,pq);
        }
        pq=new PriorityQueue<>((a,b)->b-a);
        for(j=1;j<m;j++)
        {
            Diagonal(grid,0,j,n,m,pq);
        }
        return grid;
    }
}