class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int[] freq = new int[10];
        for(int i = 0;i<nums.length;i++){
            while(nums[i]>0){
                freq[nums[i]%10]++;
                nums[i]/=10;
            }
        }
        return freq[digit];
    }
}