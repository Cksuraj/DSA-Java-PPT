import java.util.*;
// 💡 **Question 6**
// Given a non-empty array of integers nums, every element appears twice except
// for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only  constant extra space.
// Input: nums = [2,2,1] // Output: 1
public class singlenum {

    public static int getsinglnumber(int nums[]) {
        // 1st here We can simple Create a Hashset Which is popular to store the unquie
        // numbet and remove the duplicates form the array
        // This is Optimized approach to solve the code
        // Time Complexcity O(n)
        // Space complexcity O(n)
        HashSet<Integer> set = new HashSet<>();
        // for adding and removeing the element hashset data structure will take O(1)
        // time
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int getunique(int nums[]) {
        // 2nd mathod using for loops
        // now we will iterate over the nums to find unique nums;
        // Time complexcity is O(n) and space constant
        // 1st we will sort the arrays using Arrays.sort mathod
        Arrays.sort(nums);
        // here we are doing liner Search to get unique nums
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[] = { 2,2,1 };
        System.out.println(singlenum.getsinglnumber(nums));
        // System.out.println(singlenum.getunique(nums));
    }
}
