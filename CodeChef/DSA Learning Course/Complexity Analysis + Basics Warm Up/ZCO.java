/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long budget(long arr[],int n)
    {
        long  max=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]*(n-i));
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
	        int t=Integer.parseInt(br.readLine());
	    long arr[]=new long[t];
	    for(int i=0;i<t;i++)
	    arr[i]=Long.parseLong(br.readLine());
	    Arrays.sort(arr);
	    System.out.println(budget(arr,t));
	        
	    } catch(Exception e) {
	    } finally {
	    }
	}
}
