class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int curr = 1;
        for(int i : target){
            while(curr<i){
                ans.add("Push");
                ans.add("Pop");
                curr++;
            }
            ans.add("Push");
            curr++;
        }
        return ans;
    }
}