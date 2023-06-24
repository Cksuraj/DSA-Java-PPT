import java.util.*;

// A permutation of an array of integers is an arrangement of its members into a
// sequence or linear order.
// Given an array of integers nums, find the next permutation of nums.
// The replacement must be in place and use only constant extra memory.
// Input: nums = [1,2,3] // Output: [1,3,2]

public class ArrayPermutation {
    public static void nextPer(int[] nums) {
        // 1st Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Find the element just larger than nums[i]
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        // 2nd Swap nums[i] and nums[j]
        swap(nums, i, j);
        // 3rd Reverse the suffix starting from i+1
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPer(nums);
        System.out.println(Arrays.toString(nums));
    }
}
