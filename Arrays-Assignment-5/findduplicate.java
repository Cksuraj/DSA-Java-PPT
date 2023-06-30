import java.util.*;

public class findduplicate {

    public static List<Integer> findDup(int[] num) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : num) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};

        List<Integer> duplicateList = findDup(num);

        System.out.println(findduplicate.findDup(num));
    }
}
