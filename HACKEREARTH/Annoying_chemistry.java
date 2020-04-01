import java.util.*;
import java.io.*;
class TestClass {
     static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
     
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
    public static long gcd(long a, long b, long c) {

		return gcd(gcd(a, b), c);

	}

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
      try
      {
        long l=lcm(x,y);
        long a=((p*l)/x);
        long b=((q*l)/y);
        long c=l;
        if(gcd(a,b,c)!=1)
        {
            long gg=gcd(a,b,c);
            a=a/gg;
            b=b/gg;
            c=c/gg;
        }
        System.out.println(a+" "+b+" "+c);
      }
      catch(Exception e){}
    }
}
