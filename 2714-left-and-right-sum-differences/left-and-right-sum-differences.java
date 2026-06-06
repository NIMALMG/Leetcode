class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int lsum = 0;
        int rsum = 0;
        for(int i = nums.length-1;i>0;i--){
            rsum += nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                ans[i] = lsum;
                ans[i] = Math.abs(ans[i]-rsum);
            }
            else{
                lsum += nums[i-1];
                ans[i] = lsum;
                rsum = rsum -  nums[i];
                ans[i] = Math.abs(ans[i] - rsum);
            }
        }
        return ans;
    }
}