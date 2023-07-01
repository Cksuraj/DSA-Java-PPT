

public class sprialorder {
    public static int[][] ordermatrix(int n) {
        // creating 2D arr with n
        int a[][] = new int[n][n];

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int count = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                a[top][i] = count;
                count++;
            }

            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = count;
                count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i] = count;
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left] = count;
                count++;
            }
            left++;
        }
        return a;
    }

    public static void main(String[] args) {

        int n = 3;
        int ordmat[][] = ordermatrix(n);

        for (int i = 0; i < ordmat.length; i++) {
            for (int j = 0; j < ordmat[0].length; j++) {
                System.out.print(ordmat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
