package main.leetcode;

/**
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 */
public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (exists(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean exists(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || word.charAt(index) != board[row][col])
            return false;
        board[row][col] = '*';

        boolean result = exists(board, word, row + 1, col, index + 1) ||
                exists(board, word, row - 1, col, index + 1) ||
                exists(board, word, row, col + 1, index + 1) ||
                exists(board, word, row, col - 1, index + 1);
        board[row][col] = word.charAt(index);
        return result;
    }
}
