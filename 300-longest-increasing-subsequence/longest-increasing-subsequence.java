class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        for(int i = 0;i<n;i++){
            dp[i] = 1;
        }

        int maxlen = 1;
        for(int i = n-2;i>=0;i--){
            for(int j = i+1;j<n;j++){
                if(nums[j] > nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen = Math.max(maxlen,dp[i]);
        }
        return maxlen;

    }
}