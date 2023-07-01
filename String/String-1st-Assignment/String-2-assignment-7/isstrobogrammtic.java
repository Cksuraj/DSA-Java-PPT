import java.util.*;

public class isstrobogrammtic {

    // we will use HashMap and add a Pair of the isstrobogrammtic number

    public static boolean isstrobogrammticnum(String num){
        
    Map<Character,Character> map= new HashMap<Character,Character>();
    // adding the pair of strobogrmmtic number

    map.put('1','1');
    map.put('0','0');
    map.put('8','8');
    map.put('9','6');
    map.put('6','9');
   
    //  let's iterate over the num string to check is it strobogrammticnum
    //  intilized left and right to iterate over the map to check the number
    int l=0;
    int r=num.length()-1;
    while(l<=r){
        if(!map.containsKey(num.charAt(l))) return false;

        if(map.get(num.charAt(l)) != num.charAt(r))
        return false;
        l++;
        r--;
    }
    return true;
    }
    
    public static void main(String[] args) {
        String num="69";

        System.out.println(isstrobogrammtic.isstrobogrammticnum(num));
    }
}
