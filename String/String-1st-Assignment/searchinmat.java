import java.util.*;

public class searchinmat {

 public static boolean searchmatrix(int[][] matrix, int target) {
      
    // Base Case 
      if(matrix.length==0){
          return false;
      }

      // using Binary Search 

      int m=matrix.length;
      int n=matrix[0].length;
      int l=0;
      int r=m*n;
      
      // Tow pointer Approch

      while(l<r){
          int mid=(l+r) >>1;
          int i=mid/n;
          int j=mid%n;
          if(matrix[i][j]==target)
              return true;
          
          if(matrix [i][j]<target)
              l=mid+1;
          
           else  
              r=mid;
        
      }
      
return false;
      }   
    
    public static void main(String[] args) {
     
        int mat[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; 
        int target = 3;
        
        // searchmatrix(mat, target);
        System.out.println(searchmatrix(mat, target));

    }
}
