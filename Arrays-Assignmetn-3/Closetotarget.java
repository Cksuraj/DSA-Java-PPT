import java.util.*;

// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.
// Input: nums = [-1,2,1,-4], target = 1 // Output: 2

public class Closetotarget {

    public static int clostoT(int nums[], int Target) {
        // 1st Arrays in asscending order
        Arrays.sort(nums);
        // num[0]+num[1]+nums[nums.length-1] as mantioned 3sum closest to
        // intialy we are lock index 0 and 1 and then traversing to other elemets
        int Ans = nums[0] + nums[1] + nums[nums.length - 1];
        // For loop to iterate over the arry
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            // inti sum with max infinity
            int sum = Integer.MIN_VALUE;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if ((Math.abs(Target - sum)) < Math.abs(Target - Ans)) {
                    Ans = sum;
                } else if (sum < Target) {
                    start += 1;
                } else {
                    end -= 1;
                }
            }
        }
        return Ans;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 2, 1, -4 };
        int Target = 1;
        System.out.println(Closetotarget.clostoT(nums, Target));
    }
}
