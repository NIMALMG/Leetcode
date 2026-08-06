class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(i%2 != 0 && j % 2 != 0){
                    int num1 = 0;
                    if(nums[i] < nums[j]){
                        num1 = nums[i];
                        nums[i] = nums[j];
                        nums[j] = num1;
                    }
                }
                else if(i%2 == 0 && j%2 == 0){
                    int num2 = 0;
                    if(nums[i] > nums[j]){
                        num2 = nums[i];
                        nums[i] = nums[j];
                        nums[j] = num2;
                    }
                }
            }
        }

        return nums;
    }
}