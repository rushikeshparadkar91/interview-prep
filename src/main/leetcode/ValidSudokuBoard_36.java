package main.leetcode;

import java.util.HashSet;

public class ValidSudokuBoard_36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.') {
                    if (!set.add(number + "in row " + i) || // If number is present in the row
                            !set.add(number + "in col " + j) || // if number is present in the column.
                            !set.add(number + "in block " + i / 3 + "-" + j / 3)) // if the number is present in the block.

                        return false;
                }
            }
        }

        return true;
    }
}
