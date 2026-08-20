class Solution {
    int[][] dp;
    int n,m;
    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        dp = new int[n][m];
        int ans = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }
        return ans;
    }
    private int dfs(int[][] matrix, int i, int j){
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int max = 1;
        if(i>0 && matrix[i-1][j] > matrix[i][j]){
            max = Math.max(max, dfs(matrix, i-1, j)+1);
        }
        if(i<n-1 && matrix[i+1][j] > matrix[i][j]){
            max = Math.max(max, dfs(matrix, i+1,j)+1);
        }
        if(j>0 && matrix[i][j-1] > matrix[i][j]){
            max = Math.max(max, dfs(matrix, i, j-1)+1);
        }
        if(j<m-1 && matrix[i][j+1] > matrix[i][j]){
            max = Math.max(max, dfs(matrix, i, j+1)+1);
        }
        dp[i][j] = max;
        return max;
    }
}
