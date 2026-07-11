class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> N = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                N.add(nums[i]);
            }
        }
        return N;

    }
}