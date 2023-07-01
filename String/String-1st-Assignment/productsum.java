import java.util.*;

public class productsum {
    public static int multisum(int[] nums1, int[] nums2) {
        // Easy Question
        // sorting the array

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Intilizing the sum variable
        int sum = 0;
        // storing the length of nums1
        int length = nums1.length;
        // Iterating over the first num1 length;
        for (int i = 0; i < length; i++)
            // multiplying the num1 * num2 adding into sum
            sum += nums1[i] * nums2[length - 1 - i];
        return sum;
    }

    public static void main(String[] args) {
        int num1[] = {5,3,4,2};
        int num2[] = {4,2,2,5};
        System.out.println(productsum.multisum(num1, num2));
    }
}
