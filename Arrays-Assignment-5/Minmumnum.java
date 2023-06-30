import java.util.*;

public class Minmumnum {

public static int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int m=(l+r) >>1;
            if(nums[m]==nums[r]){
                r--;
            }
           else if(nums[m]<nums[r]){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int num[]={3,4,5,1,2};
        
        System.out.println(Minmumnum.findMin(num));
        
    }
    
}
