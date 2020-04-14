class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:stones)
            p.add(-i);
        while(p.size()>1)
        {
            int a=p.remove();
            int b=p.remove();
            if(a!=b)
                p.add((a-b));
        }
        return p.isEmpty()?  0: -p.remove();
    }
}
