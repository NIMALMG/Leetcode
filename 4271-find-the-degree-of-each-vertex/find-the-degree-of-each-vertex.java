class Solution {
    public int[] findDegrees(int[][] matrix) {
        int cnt = 0;
        int[] ans = new int[matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 1){
                    cnt++;
                }
                ans[i] = cnt;
            }
            cnt = 0;
        }
        return ans;
    }
}