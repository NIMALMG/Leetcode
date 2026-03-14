class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add((long)n);
        }
        while(pq.peek() < k){
            long f = pq.poll();
            long s = pq.poll();
            long newval = f * 2 + s;
            pq.add(newval);
            cnt++;
        }
        return cnt;
    }
}