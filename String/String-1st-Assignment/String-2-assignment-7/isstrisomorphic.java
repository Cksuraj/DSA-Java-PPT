import java.util.*;

public class isstrisomorphic {

     public static boolean isIsomorphic(String s, String t) {
        // This will be Base Case
        // if one str length is big tahn Second we return false;

        if(s.length() != t.length()) return false;

        // here To keep Track of string , HashMap is used

        HashMap<Character,Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
        
            // getting each str index val of char 
            char str1 = s.charAt(i);
            char str2 = t.charAt(i);
        
            // using Hashmap property ContainsKey to check the str is present in second str 
            
            if(map.containsKey(str1)){
                if(str2 == map.get(str1)){ 
                    continue;
                }
                else{
                    return false;
                }
            }else{
                if(map.containsValue(str2)) 
                    return false;
                else 
                    map.put(str1,str2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="egg";
        String n="add";

        System.out.println(isstrisomorphic.isIsomorphic(s, n));
    }
}
