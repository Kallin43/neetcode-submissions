class Solution {
    int rows;
    int cols;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        for(int c = 0; c<cols; c++){
            dfs(0, c, pacific, heights);
        }
        for(int r = 0; r<rows; r++){
            dfs(r, 0, pacific, heights);
        }
        for(int c = 0; c<cols; c++){
            dfs(rows-1, c, atlantic, heights);
        }
        for(int r = 0; r<rows; r++){
            dfs(r, cols-1, atlantic, heights);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }
    private void dfs(int row, int col, boolean[][] ocean, int[][] heights){
        ocean[row][col] = true;
        int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        for(int dir[]: directions){
            int nr = row + dir[0];
            int nc = col + dir[1];
            if(nr<0 || nr>=rows || nc<0 || nc>=cols || heights[nr][nc]<heights[row][col] ||                 ocean[nr][nc]){
                continue;
            }
            dfs(nr, nc, ocean, heights);
        }
    }
}
