class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,k,l,n,m;
        char temp;
        for(i=0;i<9;i++)
        {  for(j=0;j<9;j++)
           { if(board[i][j]=='.')
                continue;
               temp=board[i][j];
                k=i+1;
                for(;k<9;k++)
                {
                    if(temp==board[k][j]){
                        return false;}
                }
                l=j+1;
                for(;l<9;l++)
                {
                    if(temp==board[i][l]){
                        return false;}
                }
                n=3*(i/3);
                m=3*(j/3);
                for(k=n;k<n+3;k++)
                {   if(i==k)
                        continue;
                    for(l=m;l<m+3;l++)
                        if(temp==board[k][l])
                           return false;
                }
           }
        }
        return true;
    }
}