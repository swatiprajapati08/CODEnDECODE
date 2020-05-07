//Even Fibonacci Numbers Sum

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
	  long dp[]=new long[10000000];
	    fibB(maxIndex,dp);
	    for(int ele:arr)
	    {
	        int sum=0;
	    for(int i=1;i<=ele;i++)
	    {
	        if(dp[i]<=ele)
	        {
	            if(dp[i]%2==0)
	                sum+=dp[i];
	        }
	        else
	        break;
	    }
	    System.out.println(sum);
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
