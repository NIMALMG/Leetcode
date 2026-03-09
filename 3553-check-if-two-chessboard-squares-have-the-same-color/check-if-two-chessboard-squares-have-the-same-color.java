class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int n1 = c1.charAt(0) - 'a' + 1;
        int n2 = c2.charAt(0) - 'a' + 1;
        int m1 = c1.charAt(1) - '0';
        int m2 = c2.charAt(1) - '0';
        int sum1 = n1+n2;
        int sum2 = m1+m2;
        if(sum1 % 2 == 0 && sum2 %2 == 0){
            return true;
        }
        else if(sum1%2 != 0 && sum2 %2 != 0) {
            return true;
        }
        return false;
    }
}