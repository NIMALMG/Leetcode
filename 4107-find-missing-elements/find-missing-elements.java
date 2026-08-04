class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int minn = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        for(int i : nums){
            minn = Math.min(minn,i);
            maxx = Math.max(maxx,i);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int j = minn;j<=maxx;j++){
            if(!set.contains(j)){
                res.add(j);
            }
        }
        return res;
    }
}