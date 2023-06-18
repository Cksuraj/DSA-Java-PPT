// 💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// **Example 1:**
// Input: nums = [1,3,5,6], target = 5

// Output: 2

import java.util.*;

public class Targetindex {

    public static int Binarysearch(int nums[], int target) {

        // Base case
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        int st = nums.length;
        int end = nums.length - 1;

        // here we are using Binary serch to get O(n log n) time complexcity
        while (st <= end) {
            int mid = (st + end) << 1;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return mid + 1;
            else
                return mid - 1;
        }
        return nums[target];

    }

    public static void main(String[] args) {

        int nums[] = { 1, 3, 5, 6 };
        int target = 5;

        System.out.println(Binarysearch(nums, target));
    }
}
