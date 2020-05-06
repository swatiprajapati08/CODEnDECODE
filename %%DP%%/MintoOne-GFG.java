
//Minimum steps to minimize n as per given condition
//Top-down Approach 
//Easy Marks:2
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     int dp[]=new int[100000];
	     System.out.println(min(n,dp));
	 }
	 
}
static int min(int n,int dp[])
	 {
	     if(n==1)
	     return 0;
	     int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE;
	     if(dp[n]!=0)
	     return dp[n];
	     
	     if(n%3==0)
	     a=min(n/3,dp)+1;
	     if(n%2==0)
	     b=min(n/2,dp)+1;
	     c=min(n-1,dp)+1;
	     int m=Math.min(a,Math.min(b,c));
	     dp[n]=m;
	     return m;
	 }
}
