class Solution {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int temp = x;
        while(temp>0){
            int ld = temp%10;
            revnum = revnum*10+ld;
            temp/=10;
        }
        if(revnum == x){
            return true;
        }
        return false;
        
    }
}