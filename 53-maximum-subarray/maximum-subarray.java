class Solution {
    public int maxSubArray(int[] nums) {
        int maxx = nums[0];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum<0){
                sum = 0;
            }
            sum += nums[i];
            maxx = Math.max(maxx,sum);
        }
        return maxx;
    }
}