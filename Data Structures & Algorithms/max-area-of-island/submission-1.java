class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    int area = callBFS(grid, i, j);
                    count = Math.max(area, count);
                }
            }
        }
        return count;
    }
    public int callBFS(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1 + callBFS(grid, i+1, j) + callBFS(grid, i-1, j) + callBFS(grid, i, j+1) + callBFS(grid, i, j-1);
        return area;
    }
}
