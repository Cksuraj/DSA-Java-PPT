import java.util.*;

public class isshiftable {
     public static boolean canShiftToGoal(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String shifted = s;
        for (int i = 0; i < s.length(); i++) {
            if (shifted.equals(goal)) {
                return true;
            }
            
            // Perform a shift by moving the leftmost character to the rightmost position
            shifted = shifted.substring(1) + shifted.charAt(0);
        }
        
        return false;
    }    
    public static void main(String[] args) {
         String s="abcde"; 
         String goal="cdeab";

         System.out.println(isshiftable.canShiftToGoal(s, goal));
    }
}
