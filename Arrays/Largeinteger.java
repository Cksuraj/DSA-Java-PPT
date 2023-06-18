// 💡 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// **Example 1:**
// Input: digits = [1,2,3]
// Output: [1,2,4]

// **Explanation:** The array represents the integer 123.

// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

import java.util.*;


public class Largeinteger{
    public static int[] plusOne(int[] digits) {

        List<Integer> inc = new ArrayList<>();

        int plus = 1; // Start with a carry of 1

        // Iterate over the digits in reverse order 
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + plus;

            inc.add(sum % 10);
            plus = sum / 10;
        }

        // If there is a remaining carry
        if (plus > 0) {
            inc.add(plus);
        }

        // finally Reverseing the order of digits
        
        int[] result = new int[inc.size()];
        for (int i = 0; i < inc.size(); i++) {
            result[i] = inc.get(inc.size() - 1 - i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
    }
}

