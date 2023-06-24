import java.util.*;
//  **Question 4**
// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Input: nums = [1,3,5,6], target = 5  // Output: 2

public class Indexsearch {

    public static int findindex(int nums[], int target) {
        // to gain the O(n log n) time complexcity we have to use Binary search to solve
        // this problem
        // Two pointer approach
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;
        // Base case if our target is at first index then we simple return the 0 the
        // index
        if (nums[0] == target) {
            return 0;
        }
        // This is Binary Search algorithem
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {

                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // if target is not present in array then we will return -1;
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(Indexsearch.findindex(nums, target));
    }
}