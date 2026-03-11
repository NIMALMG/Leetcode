class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        int len = Integer.toBinaryString(n).length();
        int ans = 0;
        for(int i = 0;i<len;i++){
            ans = ans * 2 + ((str.charAt(i) - '0') ^ 1);
        } 
        return ans;

    }
}