class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] freq = new int[52];
        for(int i = 0;i<s1.length();i++){
            int of = (i&1) * 26;
            freq[s1.charAt(i)-'a' + of]++;
            freq[s2.charAt(i)-'a' + of]--;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}