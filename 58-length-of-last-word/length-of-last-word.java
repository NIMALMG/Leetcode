class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.length();
        int lastspaceindex = s.lastIndexOf(" ");
        int lastwordlength = length -(lastspaceindex+1);
        return lastwordlength;
        
    }
}