import java.util.*;

public class maxlengthsubarray {  
      public static int findLength(int[] nums) {
       
        // intilising count to keep treack of length;

        int count = 0;
        // iterating over the array

        for (int i = 0; i < nums.length; i++) {
             // useing variable zero and one  how many times they appre in array
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    // taking max wiht 0 and 1 subarry length
                    count = Math.max(count, j - i + 1);
                }
            }
        }
        return count;
    }

public static void main(String[] args) {
    int nums[]={0,1};
    System.out.println(maxlengthsubarray.findLength(nums));
}    
}
