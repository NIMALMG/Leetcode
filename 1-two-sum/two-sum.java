class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            int curr = nums[i];
            int rem = target - curr;
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(curr,i);
        }
        return new int[]{};
    }
}