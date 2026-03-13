class Solution {
    public boolean hasSameDigits(String s) {
        int[] digit = new int[s.length()];
        int i = 0;
        for(char c:s.toCharArray()){
            digit[i] = c - '0';
            i++;
        }
        int n = digit.length;
        while(n>2){
            for(int j = 0;j<n-1;j++){
                digit[j] = (digit[j] + digit[j+1]) %10;
            }
            n--;
        }
        return digit[0] == digit[1];
    }
}