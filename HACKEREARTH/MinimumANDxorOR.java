import java.io.*;
import java.util.*;
 
class TestClass {
	 static int minXOR(int arr[], int n) 
    { 
        Arrays.parallelSort(arr); 
  
        int minXor = Integer.MAX_VALUE; 
        int val = 0;  
        for (int i = 0; i < n - 1; i++) { 
            val = arr[i] ^ arr[i + 1]; 
            minXor = Math.min(minXor, val); 
        } 
  
        return minXor; 
    } 
	public static void main (String[] args) throws Exception {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0)
	    { 
	        int n=Integer.parseInt(br.readLine());
	        int arr[]=new int[n];
                  String[] s=br.readLine().split(" ");
	        for(int i=0;i<n;i++)
	        arr[i]=Integer.parseInt(s[i]);
	        int min=minXOR(arr,n);
	       System.out.println(min);
	    }
	}
}
