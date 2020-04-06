/* for a graph to be tree 2 condition required:
1: it must be connected
2: no cycle i.e it no.of vertices-1= no.of edges :) */

import java.io.*;
import java.util.*;
class Graph{
	private final int V;
	private ArrayList<ArrayList<Integer>> adj;
	Graph(final int v)
	{
		V=v;
		adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<Integer>());
	}
	void dfs(int s,boolean visited[])
	{
		visited[s]=true;
		for( int u:adj.get(s))
		{
			if(!visited[u])
			dfs(u,visited);
		}
	}
	void addEdge(int u,int v)
	{
		adj.get(u).add(v);
		//adj.get(v).add(u);
	}
	int ddfs( int s)
	{ 
		 int count=0;
		 boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(!visited[i])
			{
				count++;
				dfs(i,visited);
			}
		}
		return count;
	}
}

class tree {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer st= new StringTokenizer(s," ");
		int v=Integer.parseInt(st.nextToken()) , e=Integer.parseInt(st.nextToken());
		Graph g=new Graph(v);
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
		int count = g.ddfs(y - 1);
		if(count==1 && v-1==e)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
