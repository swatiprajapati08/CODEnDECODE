/* A coin was tossed numerous times. You need to find the longest streak of tosses resulting Heads and the longest streak of tosses resulting in Tails.

Formally, given the results of  tosses of a coin, find the maximum number of consecutive HEADS  and the maximum number of consecutive TAILS .*/


import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int n=sc.nextInt();
            int tc=0,hc=0,tcc=0,hcc=0;
            String str[]=new String[n];
            for(int i=0;i<n;i++)
                str[i]=sc.next();
            for(int i=0;i<n;i++)
            {
                if(str[i].equals("Tails"))
                {
                 tc++;
                 hc=0;
                }
                if(str[i].equals("Heads"))
                {
                hc++;
                tc=0;
                }
                if(tcc<tc)
                    tcc=tc;
                if(hcc<hc)
                    hcc=hc;
            }
            System.out.println(hcc+" "+tcc);
        }
        catch(Exception e){}
    }
}