class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        int vbcnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '|'){
                vbcnt++;
            }
            if(vbcnt % 2 == 0){
                if(s.charAt(i) == '*'){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}