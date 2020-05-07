//Print first n Fibonacci Numbers
//Given a number N, print the first N fibonacci numbers.

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	  int arr[]=new int[t];
	  int maxIndex=Integer.MIN_VALUE;
	  for(int i=0;i<t;i++)
	  {
	      arr[i]=sc.nextInt();
	      maxIndex=Math.max(maxIndex,arr[i]);
	  }
	  long dp[]=new long[100];
	    fibB(maxIndex,dp);
	    for(int ele:arr)
	    {
	    for(int i=1;i<=ele;i++)
	    System.out.print(dp[i]+" ");
	    System.out.println();
	    }
	 }
	 static void fibB(int n,long dp[])
	 {
	     dp[0]=0;
	     dp[1]=1;
	     for(int i=2;i<=n;i++)
	     dp[i]=dp[i-1]+dp[i-2];

	 }
}
