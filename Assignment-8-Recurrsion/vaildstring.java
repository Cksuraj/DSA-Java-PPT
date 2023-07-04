import java.util.*;

public class vaildstring {

 public static boolean checkValidString(String str) {
     Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i = 0;i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                s1.push(i);
            }
            else if(ch == ')'){
                if(!s1.isEmpty())  
                   s1.pop();
                else if(!s2.isEmpty())
                   s2.pop();
                else
                   return false;   
            }
            else{
                 s2.push(i);
            }
        }
         while(!s1.isEmpty()){
            if(s2.isEmpty()){
              return false;
            }
            if(s1.peek() > s2.peek()){
                return false;
            }
            s1.pop();
            s2.pop(); 
        }
        return true;
    }
    public static void main(String[] args) {
      String str="()";
      System.out.println(vaildstring.checkValidString(str));    
    }
}
