import java.util.*;

public class reversektime {

 public static String reverseStr(String s, int k) {
        
    char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i += 2 * k) {
            int start = i;
            int end = Math.min(str.length - 1, i + k - 1);

            while (start < end) {
                // swap
                char temp = str[start];
                str[start] = str[end];
                 str[end] = temp;

                start ++;
                end --;
            }
        }

        // list -> String
        return new String(str);
    }
    public static void main(String[] args) {
     String s="abcdefg";
     int k=2;
     
     System.out.println(reversektime.reverseStr(s, k));
    }
}
