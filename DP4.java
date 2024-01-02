import java.util.*;
public class DP4 {
    
// LONGEST COMMON SUBSTRING: O(n*m)

// public static int longestCommonSubstring(String str1, String str2){
//     int n = str1.length();
//     int m = str2.length();
//     int dp[][] = new int[n+1][m+1];
//     int ans = 0;

//     //initilize:
//     for(int i=0; i<n+1; i++){
//         dp[i][0] = 0;
//     }
//     for(int j=0; j<m+1; j++){
//         dp[0][j] = 0;
//     }

//     //bottom up
//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<m+1; j++){
//             if(str1.charAt(i-1) == str2.charAt(j-1)){
//                 dp[i][j] = dp[i-1][j-1] + 1;
//                 ans = Math.max(ans,dp[i][j]);
//             }else {
//                 dp[i][j] = 0;
//             }
//         }
//     }
//     return ans;
// }

// public static void main(String[] args) {
//     String str1 = "ABCDE";
//     String str2 = "ABGCE";
//     System.out.println(longestCommonSubstring(str1, str2));

// }






// QS: LONGEST INCRESING SUBSEQUENCE:

// public static int lcs(int arr1[], int arr2[]){
//     int n = arr1.length;
//     int m = arr2.length;
//     int dp[][] = new int[n+1][m+1];

//     //initilize
//     for(int i=0; i<n+1; i++){
//         dp[i][0] = 0;
//     }
//     for(int j=0; j<m+1; j++){
//         dp[0][j] = 0;
//     }

//     //bottom up
//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<m+1; j++){
//             if(arr1[i-1] == arr2[j-1]){
//                 dp[i][j] = dp[i-1][j-1]+1;
//             }else {
//                 int ans1 = dp[i-1][j];
//                 int ans2 = dp[i][j-1];
//                 dp[i][j] = Math.max(ans1, ans2);    
//             }
//         }

//     }
//     return dp[n][m];
// }

// public static int lis(int arr1[]){
//     HashSet<Integer> set  = new HashSet<>();
//     for(int i=0; i<arr1.length; i++){
//         set.add(arr1[i]);
//     }

//     int arr2[] = new int[set.size()];
//     int i=0;
//     for(int num : set){
//         arr2[i] = num;
//         i++;
// }
// Arrays.sort(arr2); // ascending
//    return lcs(arr1 , arr2);
// }


// public static void main(String[] args) {
//     int arr[] = {50,3,10,7,40,80};
//     System.out.println(lis(arr));
// }




// EDIT DISTANCE  O(N*M) 
// public static int editDistance(String str1, String str2){
//     int n = str1.length();
//     int m = str2.length();
//     int dp[][] = new int[n+1][m+1];

//     //initilize
//     for(int i=0; i<n+1; i++){
//         for(int j=0; j<m+1; j++){
//             if(i == 0){
//                 dp[i][j] = j;
//             }
//             if(j == 0){
//                 dp[i][j] = i;
//             }
//         }
//     }

//     //bottom up
//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<m+1; j++){
//             if(str1.charAt(i-1) == str2.charAt(j-1)){
//                 dp[i][j] = dp[i-1][j-1];
//             }else {
//                 int add = dp[i][j-1]+1;
//                 int delete = dp[i-1][j]+1;
//                 int replace = dp[i-1][j-1]+1;
//                 dp[i][j] = Math.min(add, Math.min(delete, replace));
//             }
//         }
//     }
//     return dp[n][m];
// }

// public static void main(String[] args) {
//     String word1 = "intention";
//     String word2 = "execution";
//     System.out.println(editDistance(word1, word2));
// }




public static int lcs(String str1, String str2) {
    int n = str1.length();
    int m = str2.length();
    int dp[][] = new int[n+1][m+1];
    int ans = 0;
    for(int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }
    for(int j=0; j<m+1; j++){
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<m+1; j++){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1]+1;
                 ans = Math.max(ans, dp[i][j]);
            }else {
                dp[i][j] = 0;
            }
        }
    }
    return ans;
}


public static void main(String[] args) {
    String str1 = "pear";
    String str2 = "sea";
    System.out.println(lcs(str1, str2));
}











}
