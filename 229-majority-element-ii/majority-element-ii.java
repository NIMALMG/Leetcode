class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int n = nums.length / 3;
        for (int key : freq.keySet()) {
            if (freq.get(key) > n) {
                ans.add(key);
            }
        }
        return ans;
    }
}