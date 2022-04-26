package main.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rowBeg = 0;
        int colBeg = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowBeg <= rowEnd && colBeg <= colEnd) {
            for (int i = colBeg; i <= colEnd; i++) {
                result.add(matrix[rowBeg][i]);
            }
            rowBeg++;

            for (int i = rowBeg; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBeg <= rowEnd) {
                for (int i = colEnd; i >= colBeg; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colBeg <= colEnd) {
                for (int i = rowEnd; i >= rowBeg; i--) {
                    result.add(matrix[i][colBeg]);
                }
            }
            colBeg++;
        }
        return result;
    }
}
