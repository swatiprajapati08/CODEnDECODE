class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> g=new ArrayList<>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(String curr:strs)
        {
            char ch[]=curr.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!h.containsKey(s))
                h.put(s,new ArrayList<>());
            
             h.get(s).add(curr);
        }
       g.addAll(h.values());
        return g;
    }
}
