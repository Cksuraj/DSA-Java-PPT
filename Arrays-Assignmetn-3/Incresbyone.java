import java.util.*;

// Increment the large integer by one and return the resulting array of digits.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

public class Incresbyone {
    public static int[] plusOne(int[] digits) {

        // 1st Created list to storet he digits
        List<Integer> inc = new ArrayList<>();
        int plus = 1; // Start with a carry of 1
        // As we have to add 1 to large integer which will be present to last index
        // that's why we are traversing the loop reverse
        for (int i = digits.length - 1; i >= 0; i--) {
            // adding plus and value of i index to sum
            int sum = digits[i] + plus;
            // adding into the list with by taking mod(%) of sum by 10;
            inc.add(sum % 10);
            // and also dividing the sum with 10
            plus = sum / 10;
        }

        if (plus > 0) {
            inc.add(plus);
        }
        // finally Reverseing the order of digits
        // declareing the result array adding inc.size() list to result array
        int[] result = new int[inc.size()];
        // iterating over the list and storing into the result
        for (int i = 0; i < inc.size(); i++) {
            result[i] = inc.get(inc.size() - 1 - i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] result = plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
