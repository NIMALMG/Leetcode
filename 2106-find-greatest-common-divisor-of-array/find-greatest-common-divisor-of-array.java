class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
    public int findGCD(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int num : nums){
            mn = Math.min(num,mn);
            mx = Math.max(num,mx);
        }
        return gcd(mn,mx);
    }
}