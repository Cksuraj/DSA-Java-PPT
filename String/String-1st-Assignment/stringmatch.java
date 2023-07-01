import java.util.*;

public class stringmatch {

    public static int[] strmatch(String s) {

        int[] arr = new int[s.length() + 1];
        int start = 0;
        int e = arr.length - 1;
        int i = 0;

        // Two Pointer Approach

        while (i < s.length()) {
            if (s.charAt(i) == 'I') {
                arr[i] = start;
                start++;
            } else {
                arr[i] = e;
                e--;
            }

            i++;
        }
         
        arr[arr.length - 1] = start;

        return arr;

    }

    public static void main(String[] args) {

        String s = "IDID";
        // stringmatch.strmatch(s);
        int result[] = strmatch(s);
        System.out.println(Arrays.toString(result));
    }
}
