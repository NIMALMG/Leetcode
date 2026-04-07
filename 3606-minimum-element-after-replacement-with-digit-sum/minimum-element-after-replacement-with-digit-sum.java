class Solution {
    public int minElement(int[] nums) {
        int[] res = new int[nums.length];
        for(int i =  0;i<nums.length;i++){
            int sum  = 0;
            while(nums[i]>0){
                sum += nums[i]%10;
                nums[i]/=10;
            }
            res[i] = sum;
        }
        int minn = Integer.MAX_VALUE;
        for(int i : res){
            minn = Math.min(minn,i);
        }
        return minn;
    }
}