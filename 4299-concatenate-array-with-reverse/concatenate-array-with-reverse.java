class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[nums.length - i - 1];
        }
        return ans;
    }
}