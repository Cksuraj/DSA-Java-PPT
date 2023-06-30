import java.util.Arrays;

public class convert2D {
    public static int[][] TwoDarray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[0][0];

        int[][] Array2d = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array2d[i][j] = original[j + (i * n)];
            }
        }

        return Array2d;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = TwoDarray(arr, m, n);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
