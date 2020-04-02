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
	int t=Integer.parseInt(br.readLine());
	while(t-->0)
	{
	    String str=br.readLine();
	    String l="",r="";
	    int len=str.length();
	    if(len%2==0)
	    {
	      l=str.substring(0,len/2);
	      r=str.substring(len/2,len);
	    }
	    else
	    {
	     l=str.substring(0,len/2);
	      r=str.substring(len/2+1,len);
	    }
	    char chleft[]=l.toCharArray();
	    char chright[]=r.toCharArray();
	    Arrays.sort(chleft);
	    Arrays.sort(chright);
	   //System.out.println(l+"    "+r);
	   int f=1;
	   for(int i=0;i<chleft.length;i++)
	   {
	       if(chleft[i]!=chright[i])
	       {
	           f=0;
	           break;
	       }
	   }
	   String ans=(f==1)? "YES":"NO";
	   System.out.println(ans);
	}
	}
}
