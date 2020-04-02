/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
       static int closestNumber(int n) 
    {  
        int q = n / 5; 
        int n1 = 5 * q;
        return n1;
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	try {
	    
	    	int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int num=closestNumber(n);
		    int sum=0;
		    while(num>=5)
		    {
		        sum=sum+num/5;
		        num/=5;
		    }
		    System.out.println(sum);
		    
		}
	    
	} catch(Exception e) {
	} finally {
	}
	}
}
