class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concat = s + s;
        String sub = concat.substring(1,concat.length()-1);
        return sub.contains(s);
    }
}