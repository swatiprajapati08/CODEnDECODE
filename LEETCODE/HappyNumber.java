


class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
       
        while(n!=1)
        {
            int curr=n;
            int sum=0;
            while(curr!=0)
            {
                sum+=(curr%10)*(curr%10);
                curr/=10;
            }
            if(h.contains(sum)){
                return false;}
            
            h.add(sum);
            n=sum;
        }
        return true;
    }
}
