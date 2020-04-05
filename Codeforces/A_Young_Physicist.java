import java.io.*;
import java.util.*;
public class A
{
               public static void main(String args[])throws IOException 
               {
                              Scanner sc=new Scanner(System.in);
                              int n=sc.nextInt();
                              int arr[]=new int[3];
                              while(n-->0)
                              {
                                             int x=sc.nextInt();
                                             int y=sc.nextInt();
                                             int z=sc.nextInt();
                                             arr[0]+=x;
                                             arr[1]+=y;
                                             arr[2]+=z;
                                             
                              }
                              if(arr[0]==0 && arr[1]==0 && arr[2]==0)
                              System.out.println("YES");
                              else
                              System.out.println("NO");
               }
}