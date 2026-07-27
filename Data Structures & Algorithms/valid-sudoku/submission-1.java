class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        for(int row = 0; row<9; row+=3){
            for(int col = 0; col<9; col+=3){
                HashSet<Character> contains = new HashSet<>();
                for(int r = row; r<row+3; r++){
                    for(int c = col; c<col+3; c++){
                        if(board[r][c]!='.'){
                            if(contains.contains(board[r][c])){
                                return false;
                            }
                            contains.add(board[r][c]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
