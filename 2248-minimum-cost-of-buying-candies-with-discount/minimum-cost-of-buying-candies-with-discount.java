class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int summ = 0;
        if(cost.length <= 2){
            for(int n : cost){
                summ += n;
            }
            return summ;
        }

        Arrays.sort(cost);
        int cnt = 0;
        for(int i = cost.length-1;i>=0;i--){
            sum += cost[i];
            cnt++;
            if(cnt%2 == 0){
                i-=1;
            }
            System.out.println(sum);
        }
        return sum;
    }
}