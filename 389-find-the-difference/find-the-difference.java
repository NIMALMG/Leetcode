class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0;i<t.length();i++){
            freq[t.charAt(i) - 'a']++;
        }
        for(int j = 0;j<s.length();j++){
            freq[s.charAt(j) - 'a']--;
        }

        for(int k = 0;k<freq.length;k++){
            if(freq[k] == 1){
                return (char)(k + 'a');
            }
        }
        return ' ';
    }
}