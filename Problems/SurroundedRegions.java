public class SurroundedRegions {
    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'T'; // Temporarily mark as 'T'
        
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
    public void solve(char[][] board) {
        int row = board.length;
        if (row == 0) return;
        int col = board[0].length;

        // Step 1: Mark border-connected 'O's with 'T'
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][col - 1] == 'O') dfs(board, i, col - 1);
        }
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[row - 1][j] == 'O') dfs(board, row - 1, j);
        }

        // Step 2: Convert remaining 'O' to 'X', revert 'T' to 'O'
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
