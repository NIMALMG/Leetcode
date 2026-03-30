class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }

        for(int i = 0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }

        for(int i =0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
            freq1[i]=0;
            freq2[i]=0;
        }
        for(int i=1;i<s1.length();i+=2){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=1;i<s2.length();i+=2){
            freq2[s2.charAt(i)-'a']++;
        }
    //    System.out.println(Arrays.toString(freq1));
    //    System.out.print(Arrays.toString(freq2));
        for(int i =0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}