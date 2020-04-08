import java.io.*;
public class newyear {
 public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
while(true)
{
    n++;
int a=n/1000;
int b=n/100 % 10;
int c= n/10 % 10;
int d=n%10;
if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
break;
}
System.out.println(n);
}
}
