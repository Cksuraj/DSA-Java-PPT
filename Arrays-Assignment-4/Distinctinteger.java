import java.util.*;

public class Distinctinteger {
//   Time Complexity Overall O(m+n) 
    public static List<Set<Integer>> distnumb(int[] nums1, int[] nums2) {
        //1st creted list to grab the list
        List<Set<Integer>>  answer = new ArrayList<>();
        // created two list to check and compaire 

        Set<Integer> dnum1 = new HashSet<>();
        Set<Integer> dnum2 = new HashSet<>();

        // Created set to add distnum 

        Set<Integer> set = new HashSet<>();
        
        // foreach loop 
        for (int i : nums2) {
            set.add(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
                dnum1.add(nums1[i]);
            }
        }

        set.clear();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!set.contains(nums2[i])) {
                set.add(nums2[i]);
                dnum2.add(nums2[i]);
            }
        }

        answer.add(dnum1);
         answer.add(dnum2);

        return  answer;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 4, 6};
        System.out.println(distnumb(num1, num2));
    }
}
