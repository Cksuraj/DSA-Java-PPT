import java.util.*;

public class Sortedarray {

    public static int[] Sortedintegerarry(int arr1[], int arr2[], int arr3[]) {
        // Brustforce approach

        // Created List to store the Present integer of arr
        List<Integer> present = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        // while loop to find all the common elemetn from arr
        // Time Complexcity will be O(n) here we are just using 1 for loop and get our
        // ans
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                present.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int presentNum[] = new int[present.size()];
        for (int l = 0; l < presentNum.length; l++) {
            presentNum[l] = present.get(l);
        }
        return presentNum;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 5, 7, 9 };
        int arr3[] = { 1, 3, 4, 5, 8 };
        int[] presentNum = Sortedintegerarry(arr1, arr2, arr3);
        for (int x : presentNum) {
            System.out.print(" " + x);
        }
    }
}
