import java.util.*;

public class deletesum{

    public static int minDeleteSum(String s1, String s2) {
        return lowestDeleteSum(s1.toCharArray(), s2.toCharArray(), s1.length()-1, s2.length()-1);
    }

    private static int lowestDeleteSum(char [] a, char [] b, int i, int j){
        if(i < 0 && j < 0) return 0;

        if(i < 0){
            int del = 0;
            for(int k = 0 ; k <= j; k++)
                del+=b[k];
            return del;
        }

        if(j < 0){
            int del = 0;
             for(int k = 0 ; k <= i; k++)
                del+=a[k];
            return del;
        }


        if(a[i] == b[j])
            return  lowestDeleteSum(a, b, i-1, j-1);
        
        return Math.min (
            lowestDeleteSum(a, b, i-1, j)+a[i], 
            lowestDeleteSum(a, b, i, j-1)+b[j]) ;
    }
    public static void main(String[] args) {
      String s1="sea";
      String s2="eat";
      System.err.println(deletesum.minDeleteSum(s1, s2));
             
    }
}