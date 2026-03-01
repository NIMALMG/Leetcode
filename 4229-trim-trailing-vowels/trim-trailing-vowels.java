class Solution {
    public String trimTrailingVowels(String s) {
        String v = "aeiou";
        int i;
        for(i = s.length()-1;i>=0;i--){
            if(v.indexOf(s.charAt(i)) == -1){
                break;
            }
        }
        return s.substring(0,i+1);
    }
}