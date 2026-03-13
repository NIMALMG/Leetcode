class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes){
            return k;
        }
        if(k <= (numOnes + numZeros)){
            return numOnes;
        }
        int num = k - (numOnes + numZeros);
        return numOnes - num; 
    }
}