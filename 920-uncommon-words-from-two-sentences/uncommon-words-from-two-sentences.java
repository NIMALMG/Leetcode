class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s :(s1 + " " + s2).split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        String[] ans = res.toArray(new String[0]);
        return ans;
    }
}