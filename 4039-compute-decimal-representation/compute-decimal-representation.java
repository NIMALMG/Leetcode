class Solution {
    public int[] decimalRepresentation(int n) {
        String str = Integer.toString(n);
        int[]res = new int[str.length()];
        int itr = res.length-1, f = 0, count = 0;

        while(n > 0){
            res[itr] = n%10;
            res[itr] = res[itr] * (int)Math.pow(10, f);
            if(res[itr] == 0)count++;
            f++;
            itr--;
            n = n/10;
        }

        int[]arr = new int[res.length-count];
        itr = 0;
        int k = 0;
        while(itr < res.length){
            if(res[itr]!=0){
                arr[k] = res[itr];
                k++;
            }
            itr++;
        }

        return arr;

    }
}