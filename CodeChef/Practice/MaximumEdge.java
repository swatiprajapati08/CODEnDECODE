
import java.io.*;
import java.util.*;

public class MaximumEdge {
private int V;
private ArrayList<ArrayList<Integer>> adj;
MaximumEdge(int v)
{
    V=v;
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<V;i++)
    adj.add(new ArrayList<Integer>());
}
void addEdge(int u,int v)
{
    adj.get(u).add(v);
    adj.get(v).add(u);
}
int dfs(int s,boolean visited[])
{
    int size = adj.get(s).size();  
    visited[s] = true;  
    for (int i = 0; i < adj.get(s).size(); i++) 
    {  
        if (visited[adj.get(s).get(i)] == false)  
        {  
            size += dfs(adj.get(s).get(i),visited);  
        }  
    }  
    return size; 
}
 int maxEdges(int v)  
{  
    int res = Integer.MIN_VALUE;  
    boolean visited[]=new boolean[V];  
    for (int i = 0; i<V; i++) 
    {  
        if(!visited[i])
        {  
            int size = dfs(i,visited);  
            res = Math.max(res, size/2);  
        }  
    }  
    return res;  
}  
public static void main(String args[])throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int k=1;k<=t;k++)
    {
        String line=br.readLine();
        StringTokenizer st=new StringTokenizer(line," ");
        int v=Integer.parseInt(st.nextToken()) , e=Integer.parseInt(st.nextToken());
        MaximumEdge g=new MaximumEdge(v);
        int x=0,y=0;
        int no=e;
        while(no-->0)
        {
        String ss=br.readLine();
        StringTokenizer srt= new StringTokenizer(ss," ");
        x=Integer.parseInt(srt.nextToken()) ;
        y=Integer.parseInt(srt.nextToken());
        g.addEdge(x-1, y-1);
        }
        System.out.println(g.maxEdges(v)); 

    }
}
}
