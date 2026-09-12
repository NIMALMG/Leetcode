class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int diasum = 0;
        int j = n-1;
        for(int i = 0;i<n;i++){
            diasum += mat[i][i];
            diasum += mat[i][j-i];
        }
        if(n%2 == 1){
            diasum -= mat[n/2][n/2];
        }
        
        return diasum;
    }
}