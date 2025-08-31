class Solution {
    public boolean makesudo(char b[][],int c)
    {
        if(c==81)return true;
        int x=c/9,y=c%9,i;
        if(b[x][y]=='.')
        {
            for(i=1;i<10;i++)
            {
                if(pos(b,x,y,(char)(i+'0')))
                {
                    b[x][y]=(char)(i+'0');
                    if(makesudo(b,c+1))return true;
                    b[x][y]='.';
                }
            }
        }else{
           if(makesudo(b,c+1)) return true;
        }
        return false;
    } 
    public boolean pos(char b[][],int x,int y,char c)
    {   int i,j;
        for(i=0;i<9;i++)
        {
            if(b[x][i]==c) return false;
        }
        for(i=0;i<9;i++)
        {
            if(b[i][y]==c) return false;
        }
        int n=(x/3)*3,m=(y/3)*3;
        for(i=0;i<3;i++)
        {  for(j=0;j<3;j++)
            {
                if(b[n+i][m+j]==c) return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        makesudo(board,0);
    }
}