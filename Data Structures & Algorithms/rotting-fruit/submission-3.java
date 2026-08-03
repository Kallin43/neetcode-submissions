class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i, j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int count = 0;
        int[][] directions = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
        };
        while(!queue.isEmpty() && fresh>0){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] dir: directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr<0 || nr>=rows || nc<0 || nc>=cols || grid[nr][nc]!=1){
                        continue;
                    }
                    grid[nr][nc] = 2;
                    fresh--;
                    queue.offer(new int[]{nr,nc});
                }
            }
            count++;
        }
        if(fresh==0){
            return count;
        }
        else{
            return -1;
        }
    }
}
