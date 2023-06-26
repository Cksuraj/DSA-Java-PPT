import java.util.*;

// You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
// **Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

public class countopration {

    public static int maxCount(int m, int n, int[][] ops) {

        // storing m into Row
        // storing n into col

        int row = m, col = n;
        // iterating over the opration and interting the
        for (int k = 0; k < ops.length; k++) {
            // putting row ops
            row = Math.min(row, ops[k][0]);
            // putting col ops
            col = Math.min(col, ops[k][1]);
        }
        // we returning the opration required for the m*n matrix
        return row * col;
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int ops[][] = { { 2, 2 }, { 3, 3 } };

        System.out.println(maxCount(m, n, ops));
    }
}
