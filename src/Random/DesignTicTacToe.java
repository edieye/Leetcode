package Random;

/**
 * Created by edieye on 2019-11-02.
 */
public class DesignTicTacToe {

    //Given n = 3, assume that player 1 is "X" and player 2 is "O" in the board.
    int[][] board;
    int d0 = 0;
    int d1 = 0;
    int[] cols;
    int[] rows;
    public DesignTicTacToe(int n) {
        board = new int[n][n];
        rows = new int[n];
        cols = new int[n];
    }
    // ----------- This was super slow... beat ~5% of solutions on LeetCode, so probably not the best and going to try something else -------
    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
//    public int move(int row, int col, int player) {
//        board[row][col] = player;
//        int n = board.length;
//        if (isWin(player, board,n)) return player;
//        else return 0;
//
//    }
//
//    public boolean isWin(int player, int[][] board, int n) {
//        // first 3 is win by row, next 3 is win by column, next 2 is win by either diagonal
//        for (int i = 0; i < n; i++) {
//            if (checkRows(i, n,player)) return true;
//        }
//        for (int i = 0; i < n; i++) {
//            if (checkColumns(i, n,player)) return true;
//        }
//        if (checkDiagonalLeft(n, player)) return true;
//        if (checkDiagonalRight(n, player)) return true;
//        return false;
//    }
//
//    public boolean checkRows(int j, int n, int player) {
//        for (int i = 0; i < n; i++) {
//            if (player != board[j][i]) return false;
//        }
//        return true;
//    }
//
//    public boolean checkColumns(int j, int n, int player) {
//        for (int i = 0; i < n; i++) {
//            if (player != board[i][j]) return false;
//        }
//        return true;
//    }
//    public boolean checkDiagonalLeft(int n, int player) {
//        for (int i = 0; i < n; i++) {
//            if (player != board[i][i]) return false;
//        }
//        return true;
//    }
//    public boolean checkDiagonalRight(int n, int player) {
//        int j = n - 1;
//        for (int i = 0; i < n; i++) {
//            if (player != board[i][j]) return false;
//            j--;
//        }
//        return true;
//    }
//----------------------------------------------------------------------------------------------------------------------

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int val = (player == 1) ? 1 : -1;
        int target = (player == 1) ? board.length: -board.length;
        rows[row] += val;
        cols[col] += val;
        if (rows[row] == target || cols[col] == target) return player;
        if (row == col) {
            d0 += val;
            if (d0 == target) return player;
        }
        if (row + col + 1 == board.length) {
            d1+= val;
            if (d1 == target) return player;
        }
        return 0;
    }


    public static void main(String[] args) {
        DesignTicTacToe toe = new DesignTicTacToe(3);
        System.out.println(toe.move(0, 0, 1));
        System.out.println(toe.move(0, 2, 2));
        System.out.println(toe.move(2, 2, 1));
        System.out.println(toe.move(1, 1, 2));
        System.out.println(toe.move(2, 0, 1));
        System.out.println(toe.move(1, 0, 2));
        System.out.println(toe.move(2, 1, 1));
//          System.out.println(toe.move(0, 0, 2));
//          System.out.println(toe.move(1, 1, 1));
//          System.out.println(toe.move(0, 1, 2));//0,0,2],[1,1,1],[0,1,2]]

    }
}
