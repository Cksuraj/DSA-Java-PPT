import java.util.*;

public class ismountain {

    public static boolean isvaildmountain(int[] arr) {
        //Base Case for mountain

        if (arr.length < 3) {
            return false;
        }

        // checking is left stricktly increasing arr num

        int left = 0;
        while (left < arr.length - 1 && arr[left] < arr[left + 1]) {
            left++;
        }
        if (left== 0) {
            return false;
        }
        
        // checking is right strictly decreasing arr num
        int right = arr.length - 1;
        while (right> 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        if (right == arr.length - 1) {
            return false;
        }

        return left == right;
    }

    public static void main(String[] args) {
    int arr[]={2,1};
    System.out.println(ismountain.isvaildmountain(arr));    
    }
}
