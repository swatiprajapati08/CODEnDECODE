/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	try {
	    	int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    int total=0;
		    while(n-->0)
		    {
		        String ss=sc.next();
		        if(ss.equals("CONTEST_WON"))
		        {
		            total+=300;
		            int rank=sc.nextInt();
		            if(rank>=1 && rank<=20)
		            total+=(20-rank);
		        }
		        else if(ss.equals("TOP_CONTRIBUTOR"))
		        total+=300;
		        else if(ss.equals("BUG_FOUND"))
		        {
		            int sov=sc.nextInt();
		            total+=sov;
		        }
		        else if(ss.equals("CONTEST_HOSTED"))
		        total+=50;
		    }
		    if(s.equals("INDIAN"))
		    System.out.println(total/200);
		    else
		    System.out.println(total/400);
		}
	} catch(Exception e) {
	} finally {
	}
	}
}
