import java.util.*;

public class Arraydistance{

    public static boolean finddist(int[] arr, int x, int d){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(Math.abs(arr[mid] - x) <= d){
                return false;
            } else if(arr[mid] > x){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return true;
    }

     public static int findVal(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            if(finddist(arr2, arr1[i], d)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[]={4,5,8};
        int arr2[]={10,9,1,8};
        int d=2;
        Arraydistance.finddist(arr2, d, d);
        System.out.println(Arraydistance.findVal(arr1, arr2, d));

    }
    }