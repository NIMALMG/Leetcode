class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char ch : word.toCharArray()){
            if(ch - 'a' >= 0){
                freq1[ch - 'a']++;
            }
            else{
                freq2[ch - 'A']++;
            }
        }

        for(int i = 0;i<freq1.length;i++){
            if(freq1[i]>0 && freq2[i]>0){
                cnt++;
            }
        }
        return cnt;
    }
}