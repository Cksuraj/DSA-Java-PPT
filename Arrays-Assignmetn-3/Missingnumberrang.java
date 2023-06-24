import java.util.*;

public class Missingnumberrang {

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        // 1st created list to store the ans in list
        List<String> ans = new ArrayList<>();
        // base case if we have nums.length 0 then simply we add into list then return
        // ans;
        if (n == 0) {
            ans.add(f(lower, upper));
            return ans;
        }
        if (nums[0] > lower) {
            ans.add(f(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            int a = nums[i - 1], b = nums[i];
            if (b - a > 1) {
                ans.add(f(a + 1, b - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(f(nums[n - 1] + 1, upper));
        }
        return ans;
    }

    // String to store the range
    public static String f(int a, int b) {
        return a == b ? a + "" : "[" + a + "," + b + "]";
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 50, 75 };
        int lower = 0;
        int upper = 99;
        // creating list to store the result into string
        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        // printing the output range
        System.out.println("Missing Ranges:");
        for (String range : missingRanges) {
            System.out.println(range);
        }
    }
}
