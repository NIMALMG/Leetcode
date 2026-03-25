class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (String s : s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> res = new ArrayList<>();
        for(String st:map.keySet()){
            if(map.get(st) == 1){
                res.add(st);
            }
        }
        String[] ans = res.toArray(new String[0]);
        return ans;
    }
}