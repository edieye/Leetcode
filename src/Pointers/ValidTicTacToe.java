package Pointers;

/**
 * Created by edieye on 2019-10-30.
 */
public class ValidTicTacToe {


    public boolean validTicTacToe(String[] board) {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < board.length; i++) {
            String row = board[i];
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == 'X') {xCount++;}
                else if (row.charAt(j) == 'O') {oCount++;}
                else if (row.charAt(j) == ' ') {}
                else {return false;}
            }
        }
        if (oCount > xCount) return false;
        if ((xCount - oCount) > 1) return false;
        boolean xWon = isWon('X', board);
        boolean oWon = isWon('O', board);
        if (xWon && oWon) return false;
        if (xWon && xWon == oWon) return false;
        if (oWon && xCount != oCount) return false;

        return true;
    }

    public boolean isWon(char c, String[] b) {
        // win by cross
        return  (
                (b[0].charAt(0) == c && b[0].charAt(1) == c && b[0].charAt(2) == c) ||
                        (b[1].charAt(0) == c && b[1].charAt(1) == c && b[1].charAt(2) == c) ||
                        (b[2].charAt(0) == c && b[2].charAt(1) == c && b[2].charAt(2) == c) ||
                        (b[0].charAt(0) == c && b[1].charAt(0) == c && b[2].charAt(0) == c) ||
                        (b[0].charAt(1) == c && b[1].charAt(1) == c && b[2].charAt(1) == c) ||
                        (b[0].charAt(2) == c && b[1].charAt(2) == c && b[2].charAt(2) == c) ||
                        (b[0].charAt(0) == c && b[1].charAt(1) == c && b[2].charAt(2) == c) ||
                        (b[0].charAt(2) == c && b[1].charAt(1) == c && b[2].charAt(0) == c)
        );
    }
}

