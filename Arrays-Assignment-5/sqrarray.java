import java.util.Arrays;

public class sqrarray {

    public static int[] squaresnum(int[] nums) {

        int[] result = new int[nums.length];
        // useing two Pointer

        int left = 0;
        int right = nums.length - 1;
        // running reverse loop right to left

        for (int i = nums.length - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] square = squaresnum(nums);
        System.out.println(Arrays.toString(square));
    }
}

