class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int idx = -1;
        int num = Integer.MAX_VALUE;
        for(int i = 0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<num){
                    idx = i;
                    num = capacity[i];
                }
            }
        }
        return idx;
    }
}