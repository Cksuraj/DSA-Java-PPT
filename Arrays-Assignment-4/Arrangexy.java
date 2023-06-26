import java.util.Arrays;

public class Arrangexy {

    public static int[] arrysxn(int[] nums, int n) {
        
        // after analysing the problem 
        // here using  the odd and even 
        // used that hint
        int even = 0;
        int odd = n;
        int index = 0;
    
        // result arry to store the ans in array 

        int[] result = new int[nums.length];
        
        // while to iterate over the element of array

        while (index < nums.length) {

            // even condtion  
            if (index % 2 == 0) {
                result[index] = nums[even++];
            } 
            else // odd condtion
            {
                result[index] = nums[odd++];
            }

            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        int n = nums.length / 2;

        int arrangedArray[] = Arrangexy.arrysxn(nums, n);

        System.out.println(Arrays.toString(arrangedArray));
    }
}
