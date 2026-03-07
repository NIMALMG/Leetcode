class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
       // int i = 0;
        for(int i = 0;i<s.length();i+=k){
            int sum = 0;
            for(int j = i;j<i+k && j<s.length();j++){
                sum += (s.charAt(j) - 'a');
            }
            char ch = (char)((sum%26)+'a');
            sb.append(ch);

        }
        return sb.toString();
    }
}