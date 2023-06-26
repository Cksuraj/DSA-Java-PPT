import java.util.*;

public class Arraypartionsum {
    
    public static int maxsum(int arr[]){
        int n=arr.length;
        int ans=0;
        // Sorting the array
        Arrays.sort(arr);

        // 2nd step to iterate over the element and forming a pair (ai,bi+1) 
        for(int i=0;i<n;i+=2){
            ans+= Math.min(arr[i],arr[i+1]);
        }
        return ans;
    }
    public static void main(String[] args) {
       int arr[]={1,2,4,3};
       
       System.out.println(Arraypartionsum.maxsum(arr));
    }
}
