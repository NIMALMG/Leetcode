class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R'){
                r++;
            }
            else if(ch == 'L'){
                l++;
            }
            else if(ch == 'U'){
                u++;
            }
            else{
                d++;
            }
        }
        return (l==r) && (u==d);
    }
}