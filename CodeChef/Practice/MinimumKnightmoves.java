import java.io.*;

import java.util.*;
class Main {
    static class cell{
        int x,y,step;
        cell(int x, int y, int dis)
        {
            this.x=x;
            this.y=y;
            step=dis;
        }
    }
    static  boolean validmove(int x,int y)
    {
        if(x>=1 && x<=8 && y>=1 &&y<=8)
        return true;
        return false;
    }
    static int letcount(int knight_x, int knight_y,int des_x, int des_y)
    {
            boolean visited[][]=new boolean[8+1][8+1];
            for(int i=1;i<=8;i++)
            {
                for(int j=1;j<=8;j++)
                visited[i][j]=false;
            }
           // Arrays.fill(visited,false);
           int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};  
           int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};  
            Vector<cell> q=new Vector<>();
            cell t;
            int x,y;
            visited[knight_x][knight_y]=true;
            q.add(new cell(knight_x,knight_y,0));
            while(!q.isEmpty())
            {
                t=q.firstElement();
                q.remove(0);
                if(t.x==des_x && t.y==des_y)
                return t.step;
                for(int i=0;i<8;i++)
                {
                    x=t.x+dx[i];
                    y=t.y+dy[i];
                    if(validmove(x, y) && !visited[x][y])
                    q.add(new cell(x,y,(t.step+1)));
                }
            }
            return 1000;
    }
public static void main(String args[])throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        String line=br.readLine();
        StringTokenizer st=new StringTokenizer(line," ");
        String start=st.nextToken();
        String end=st.nextToken();
        int a=start.charAt(0)-96;
        //System.out.println(a);
        int b=end.charAt(0)-96;
       // System.out.println(b);
        int x=Character.getNumericValue(start.charAt(1)) , y=Character.getNumericValue(end.charAt(1));
        System.out.println(letcount(a,x,b,y));
    }
}
}
