import java.util.*;
public class reversewords {

  public static String reversestr(String s) {
    // StringBuffer to do opration on string O(1);

    StringBuffer word = new StringBuffer("");

        String[] st = s.split(" ");
        for(int i=0;i<st.length;i++){
            StringBuffer pstr = new StringBuffer(st[i]);
            word.append(pstr.reverse());
            word.append(" ");
        }
        String p = word.toString().trim();
        return p;
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reversewords.reversestr(s));
    }
}
