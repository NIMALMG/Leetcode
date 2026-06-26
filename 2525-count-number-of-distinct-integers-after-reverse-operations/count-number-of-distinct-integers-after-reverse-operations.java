class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        System.out.print(set.size());

        for(int n : nums){
            int num = 0;
            int temp = n;
            while(temp>0){
                num = num*10 + temp%10;
                temp/= 10;
            }
            set.add(num);
        }
        return set.size();
    }
}