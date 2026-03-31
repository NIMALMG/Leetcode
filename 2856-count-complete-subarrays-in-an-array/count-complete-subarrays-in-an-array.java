class Solution {
    public int distinct(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        return set.size();
    }
    public int countCompleteSubarrays(int[] nums) {
        int k = distinct(nums);
        int cnt = 0;
        int left = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right< nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size() == k){
                cnt+= nums.length - right;

                map.put(nums[left],map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return cnt;


    }
}