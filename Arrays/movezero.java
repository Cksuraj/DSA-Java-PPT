// 💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

import java.util.*;

public class movezero {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int Count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                Count++;
            }
        }

        int nonzero = 0;

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonzero] = nums[i];
                nonzero++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonzero; i < n; i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
