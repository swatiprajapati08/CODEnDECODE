//Differences of the permutations

import java.io.*;
import java.util.*;
class Test
{
    public static int fact(int n)
    {
        if(n==1)
        return 1;
    return n*fact(n-1);
    }
 public static void main(String args[])
 {
     Scanner  sc= new Scanner(System.in);
     int t=sc.nextInt();
     if (t>=1 && t<=5)
     {
         for(int i=1;i<=t;i++)
         {
             int n= sc.nextInt();
             int sum=0;
             if(n>=1 && n<=10)
             {
                 int p=fact(n);
                 for(int j=1;j<=n;j++)
                 sum=sum+(n-j);
                 
                 System.out.println(sum*p);
             }
         }
     }
 }
 
}
