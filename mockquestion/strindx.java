import java.util.HashMap;

public class strindx {

    public static int strnonrep(String s) {
        HashMap<Character, Integer> strchar = new HashMap<>();

        for (char c : s.toCharArray()) {
            strchar.put(c, strchar.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (strchar.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int idx = strnonrep(s);
        System.out.println(idx);
    }
}
