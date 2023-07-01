import java.util.*;

public class orignalarray {

    public static int[] findArray(int[] arr) {
        int n = arr.length, j = 0;
        // if the length of the input is odd, then return []
        // because doubled array must have even length
        if (n % 2 == 1)
            return new int[] {};
        int[] ans = new int[n / 2];

        // alternatively, you can find the max number in `changed`
        // then use new int[2 * mx + 1]
        int[] cnt = new int[200005];

        // count the frequency of each number
        for (int x : arr)
            cnt[x] += 1;

        for (int i = 0; i < 200005; i++) {
            if (cnt[i] > 0) {
                // number i exists, decrease by 1
                cnt[i] -= 1;
                // look for the doubled value
                if (cnt[i * 2] > 0) {
                    // doubled value exists, decrease by 1
                    cnt[i * 2] -= 1;
                    // add this number to ans
                    ans[j++] = i--;
                } else {
                    // cannot pair up, return []
                    return new int[] {};
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 8 };

        int[] orgarr = orignalarray.findArray(arr);

        System.out.print(Arrays.toString(orgarr));

    }
}