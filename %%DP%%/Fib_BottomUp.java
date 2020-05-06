//Fibonacci Numbers - Bottom Up DP

class Geeks
{
    static long dp[] = new long[100];
    
    
    public long findNthFibonacci(int number)
    {
    dp[0]=0;
    dp[1]=1;
      if(dp[number]>0)
      return dp[number];
      
         for(int i=3;i<=number;i++)
       dp[i]=dp[i-1]+dp[i-2];

      return dp[number];
    }

}
