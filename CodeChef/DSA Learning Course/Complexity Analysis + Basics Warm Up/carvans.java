/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try {
        	int t=Integer.parseInt(br.readLine());
	while(t-->0)
	{
	    int n=Integer.parseInt(br.readLine());
	    int arr[]=new int[n];
	    String str[]=br.readLine().split(" ");
	    for(int i=0;i<str.length;i++)
	    arr[i]=Integer.parseInt(str[i]);
	    int count=1;
	    for(int i=1;i<n;i++)
	    {
	        if(arr[i-1]>arr[i])
	        count++;
	    }
	    System.out.println(count);
	}
    } catch(Exception e) {
    } finally {
    }
	}
}
