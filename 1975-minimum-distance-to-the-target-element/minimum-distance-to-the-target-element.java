class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minn = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                minn = Math.min(Math.abs(i-start),minn);
            }
        }
        return minn;
    }
}