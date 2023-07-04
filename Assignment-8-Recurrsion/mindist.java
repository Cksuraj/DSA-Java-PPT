import java.util.*;

public class mindist {
   public static int minDistance(String word1, String word2) {

        int[][] dp=new int[word1.length()+1][word2.length()+1];
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();

        int n=word1.length();
        int m=word2.length();


        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                int take=0;
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        int result=dp[n][m];

        return n+m-2*result;
        
    }

    public static int lcs(char[] arr1,char[] arr2,int i,int j,int[][] dp){

        if(i<0 || j<0){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int take=0;
        if(arr1[i]==arr2[j]){
            return 1+lcs(arr1,arr2,i-1,j-1,dp);
        }

        dp[i][j]=Math.max(lcs(arr1,arr2,i,j-1,dp),lcs(arr1,arr2,i-1,j,dp));

        return dp[i][j];
    }
    public static void main(String[] args) {
    String word1 = "sea";
     String word2 = "eat"; 
     
     System.out.println(mindist.minDistance(word1, word2));
    }
}
