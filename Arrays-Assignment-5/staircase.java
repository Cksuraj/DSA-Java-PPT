import java.util.*;
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.
// Given the integer n, return *the number of **complete rows** of the staircase you will build*.

public class staircase {

    public static int completeRow(int n) {
        // intial k rows
        int k = 0;

        // start buildeing rows with n coins

        while ((k * (k + 1)) / 2 <= n) {
            k++;
        }
        return k - 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(completeRow(n));
    }
}
