class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxx = Integer.MIN_VALUE;
        for(int val: map.values()){
            maxx = Math.max(maxx,val);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxx){
                return entry.getKey();
            }
        }
        return 0;
    }
}