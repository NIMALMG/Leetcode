class Solution {
    public int halveArray(int[] nums) {
        int cnt = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int n : nums){
            sum += n;
            pq.add((double)n);
        }

        sum = sum / 2;
        while(sum > 0){
            double t = pq.poll();
            t = t/2;
            pq.add(t);
            sum -= t;
            cnt++;
        }
        return cnt;
    }
}