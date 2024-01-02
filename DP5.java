import java.util.Arrays;

public class DP5 {
    


         //  WILD CARD MATCHING     O(N*M)
//     public static boolean isMatch(String s, String p){
//         int n = s.length();
//         int m = p.length();

//         boolean dp[][] = new boolean[n+1][m+1];

//         //initilize
//         dp[0][0] = true;


//         //pattern
//         for(int i=1; i<n+1; i++){
//             dp[i][0] = false;
//         }
    

//         for(int j=1; j<m+1; j++){
//             if(p.charAt(j-1) == '*'){
//             dp[0][j] = dp[0][j-1];
//         }
//     }

//     //bottom up
//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<m+1; j++){
//             // case1
//             if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
//                 dp[i][j] = dp[i-1][j-1];
//             }else if(p.charAt(j-1) == '*'){
//                 dp[i][j] = dp[i-1][j] || dp[i][j-1];
//             }else{
//                 dp[i][j] = false;
//             }
            
//         }
//     }

//     return dp[n][m];
// }

// public static void main(String[] args){
//     String s = "baaabab";
//     String p = "*****ba*****ab";
//     System.out.println(isMatch(s,p));
// }







// CATALAN'S NUMBER;


// public static int catalanRecursion(int n){
//     if(n == 0 || n == 1){
//         return 1;
//     }

//     int ans = 0;
//     for(int i=0; i<=n-1; i++){
//         ans += catalanRecursion(i) * catalanRecursion(n-i-1);
//     }

//     return ans;
// }

// // memoization
// public static int catalanMemoization(int n, int dp[]){
//     if(n == 0 || n == 1) {
//         return 1;
//     }

//     if(dp[n] != -1){
//         return dp[n];
//     }
//     int ans = 0;
//     for(int i=0; i<n; i++){
//         ans += catalanMemoization(i, dp) * catalanMemoization(n-i-1, dp);
//     }

//     return dp[n] = ans;
// }

// //tabulation
// public static int catalantab(int n){
//     int dp[] = new int[n+1];
//     dp[0] = 1;
//     dp[1] = 1;

//     for(int i=2; i<=n; i++){
//         for(int j=0; j<i; j++){
//             dp[i] += dp[j]* dp[i-j-1];
//         }
//     }
//     return dp[n];
// }
// public static void main(String[] args) {
//     // int n = 4;
//     // System.out.println(catalanRecursion(n));

//     // int dp[] = new int[n+1];
//     // Arrays.fill(dp, -1);
//     // System.out.println(catalanMemoization(4, dp));

//     System.out.println(catalantab(4));
// }


// COUNTING TREES BST


// public static int countBST(int n){
//     int dp[] = new int[n+1];
//     dp[0] = 1;
//     dp[1] = 1;

//     for(int i=2; i<n+1; i++){
//         //Ci -> BST (i nodes) -> dp[i]
//         for(int j=0; j<i; j++){
//             // ci = cj * ci-j-1
//             int left = dp[j];
//             int right = dp[i-j-1];
//             dp[i] += left * right;
//         }
//     }
//     return dp[n];
// }
// public static void main(String[] args) {
//     int n = 4;
//     System.out.println(countBST(n));
// }



// MOUNTAINS RANGES:

//O(n^2)
public static int mountainRanges(int n){
    int dp[] = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;

    for(int i=2; i<n+1; i++){
        // n pairs -> mountain ranges
        for(int j=0; j<i; j++){
            int inside = dp[j];
            int outside = dp[i-j-1];
            dp[i] += inside * outside;
        }
    }
    return dp[n];
}
public static void main(String[] args) {
    int n = 4;
    System.out.println(mountainRanges(n));
}















}
