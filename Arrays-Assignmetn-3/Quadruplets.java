import java.util.*;

// Given an array nums of n integers, return an array of all the unique quadruplets
// [nums[a], nums[b], nums[c], nums[d]] such that:
//             0 <= a, b, c, d < n
//             a, b, c, and d are distinct.
//             nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.
// Input: nums = [1,0,-1,0,-2,2], target = 0 // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

public class Quadruplets {
    public static List<List<Integer>> foursum(int[] nums, int target) {
        // 1st created list to and ans in list
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;
        // Sorting the array
        Arrays.sort(nums);

        // iterating over the nums wiht n-3,n-2,n-1 to reach teh target

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                // Binary Search mathod by using left and right pointer
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        System.out.println(Quadruplets.foursum(nums, target));
    }
}
