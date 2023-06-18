//  **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]

import java.util.*;

public class missingduplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 4 };

        int n = nums.length;
       int arr[]= new int[2];

    //    Using HashMap 

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (Integer i : nums) {

            if(map.get(i) == null)
            {
                map.put(i, true);
            }
            else{
                arr[0]=i;
                // System.out.println("Repeting element :"+i);
        }

    }

        for (int j = 1; j <=n; j++) {
            
            if (map.get(j) == null)
            arr[1]=j;
            
                // System.out.println("Missing element : "+j);
        }

        for(int k=0;k<arr.length-1;k++){
            System.out.print(" "+ Arrays.toString(arr));
        }
    }
}
