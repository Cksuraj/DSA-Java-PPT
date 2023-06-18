//  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// **Example:**
// Input: nums = [2,7,11,15], target = 9
// Output0 [0,1]

// **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]

import java.util.*;

class Targetsum {
    public static int[] getTargetsum(int num[], int target) {
        int n = num.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {}; // No two numbers found with the given target sum
    }

    public static void main(String[] args) {
        int num []= { 2, 7, 11, 15 };
        int target = 9;

        int ans[] = getTargetsum(num, target);
        System.out.println( "["+ ans[0] + "," + ans[1]+"]");
      
    }
}
