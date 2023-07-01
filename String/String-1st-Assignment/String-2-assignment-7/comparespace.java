
import java.util.*;

public class comparespace {

    public static boolean Compare(String s, String t) {
        // using stack to check the s and compate with t

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {

        // taking each character value and checking is it present in stack or not 

            char c = s.charAt(i);
            if (!stack1.isEmpty() && c == '#')
                stack1.pop();
            else {
                if (c != '#')
                    stack1.push(c);

            }
        }

        // checking for the t string is it compareable wiht s or not 

        for (int i = 0; i < t.length(); i++) {
            char d = t.charAt(i);
            if (!stack2.isEmpty() && d == '#')
                stack2.pop();
            else {
                if (d != '#')
                    stack2.push(d);

            }
        }

        // String s="";

        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
     String s="ab#c";
     String t="ad#c";
     System.out.println(comparespace.Compare(s, t));
    }
}
