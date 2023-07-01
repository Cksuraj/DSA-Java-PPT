
public class sparsemat {

    public static double[][] multiplyMat(double[][] num1, double[][] num2) {

        int m = num1.length;
        int k = num2[0].length;
        int n = num2[0].length;

        double[][] result = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                double sum = 0.0;
                for (int p = 0; p < k; p++) {
                    sum += num1[i][p] * num2[p][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
    public static void main(String[] args) {
    double num1[][]={{1,0,0},{-1,0,3}};        
    double num2[][]={{7,0,0},{0,0,0},{0,0,1}};
      
    double sparsematrix[][] = multiplyMat(num1, num2);

    for (int i = 0; i < sparsematrix.length; i++) {
            for (int j = 0; j < sparsematrix[0].length; j++) {

                System.out.print(Math.round(sparsematrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
    }

