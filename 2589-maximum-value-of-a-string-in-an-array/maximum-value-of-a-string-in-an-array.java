class Solution {
    public int maximumValue(String[] strs) {
        int maxx = Integer.MIN_VALUE;
        for(String s:strs){
            boolean numeric = true;
            for(char c: s.toCharArray()){
                if(!Character.isDigit(c)){
                    numeric = false;
                    break;
                }
            }
            if(numeric){
                maxx = Math.max(maxx,Integer.parseInt(s));
            }
            else{
                maxx = Math.max(maxx,s.length());
            }
        }
        return maxx;
    }
}