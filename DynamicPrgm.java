import java.util.Arrays;

import javax.xml.validation.Validator;

public class DynamicPrgm {
    

//         // fibonacci
//     public static int fib(int n, int f[]){
//         if(n == 0 || n == 1) {
//             return n;
//         }
//             if(f[n] != 0){
//                 return f[n];
//             }
//         f[n] =  fib(n-1,f) + fib(n-2,f);
//         return f[n];
//     }

// public static void main(String[] args){
//     int n = 5;
//     int f[] = new int[n+1];
//     System.out.println(fib(n,f));
// }




// CLIMBING STAIRS:(MEMOIZATION)  O(n)


// public static int countWays(int n,int ways[]){
// if(n == 0){
//     return 1;
// }if(n < 0){
//     return 0;
// }

// if(ways[n] != -1){
//     return ways[n];
// }

//     ways[n] =  countWays(n-1, ways) + countWays(n-2,ways);
//     return ways[n];
// }

// //TABULATION O(n)


// public static int countWaysTab(int n){
//     int dp[] = new int[n+1];
//     dp[0] = 1;

//     //tabulation loop:
//     for(int i=1; i<=n; i++){
//         if(i == 1){
//             dp[i] = dp[i-1] + 0 ;
//         }else {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//     }
//     return dp[n];
// }


// public static void main(String[] args){
//     int n = 5;
//     int ways[] = new int[n+1];
//     Arrays.fill(ways, -1);
//     System.out.println(countWays(n,ways));
//     System.out.println(countWaysTab(n));
// }







//KNAPSACK: O(n*W) memoization

// public static int knapsack(int val[],int wt[],int W, int n,int dp[][]){
//     if(W == 0 || n ==0){
//         return 0;
//     }

//     if(dp[n][W] != -1){
//         return dp[n][W];
//     }

// if(wt[n-1] <= W){
//     //include
// int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1,dp);
// //exclude
// int ans2 = knapsack(val, wt, W, n-1, dp);
// dp[n][W] = Math.max(ans1, ans2);
// return dp[n][W];
// }else{
//     dp[n][W] = knapsack(val, wt, W, n-1, dp);
//     return dp[n][W];
// }
// }

// public static void main(String[] args){
//     int val[] = {15,14,10,45,30};
//     int wt[] = {2,5,1,3,4};
//     int W = 7;
//     int dp[][] = new int[val.length+1][W+1];
//     for(int i=0; i<dp.length; i++){
//         for(int j=0; j<dp[0].length; j++){
//             dp[i][j] = -1;
//         }
//         System.out.println(knapsack(val, wt, W, val.length,dp));

//     }
// }



//KNAPSACK TABULATION


// public static void print(int dp[][]){
//     for(int i=0; i<dp.length; i++){
//         for(int j=0; j<dp[0].length; j++){
//             System.out.print(dp[i][j]+" ");
//         }
//         System.out.println();
//     }
//     System.out.println();
// }


// public static int knapsackTab(int val[], int wt[], int W){
//     int n = val.length;
//     int dp[][] = new int[n+1][W+1];
//     for(int i=0; i<dp.length; i++){
//             dp[i][0] = 0;
//     }
//     for(int j=0; j<dp[0].length; j++){
//         dp[0][j] = 0;
//     }

//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<W+1; j++){
//             int v = val[i-1];
//             int w = wt[i-1];
//             if(w <= j){
//                 int incProfit = v + dp[i-1][j-w];
//                 int excProfit = dp[i-1][j];
//                 dp[i][j] = Math.max(incProfit, excProfit);
//             }else{
//                 int excProfit = dp[i-1][j];
//                 dp[i][j] = excProfit;
//             }
//         }
//     }
//     print(dp);
//     return dp[n][W];
// }



// public static void main(String[] args){
//     int val[] = {15,14,10,45,30};
//     int wt[] = {2,5,1,3,4};
//     int W = 7;
//     int dp[][] = new int[val.length+1][W+1];
//     for(int i=0; i<dp.length; i++){
//         for(int j=0; j<dp[0].length; j++){
//             dp[i][j] = -1;
//         }
//         // System.out.println(knapsack(val, wt, W, val.length,dp));
//         System.out.println(knapsackTab(val, wt, W));

//     }
// }





//TARGET SUM SUBSET:
// public static boolean targetSumSubset(int arr[],int sum){
//     int n = arr.length;
//     boolean dp[][] = new boolean[n+1][sum+1];
//     //i = items & j = target sum
//     for(int i=0; i<n+1; i++){
//         dp[i][0] = true;
//     }

//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<sum+1; j++){
//             int v = arr[i-1];
//             //include
//             if(v <= j && dp[i-1][j-v] == true){
//                 dp[i][j] = true;
//             }
//             //exclude
//             else if(dp[i-1][j] == true){
//                 dp[i][j] = true;
//             }
//         }
//         print(dp);
//     }return dp[n][sum];
// }

// public static void print(boolean dp[][]){
//     for(int i=0; i<dp.length; i++){
//         for(int j=0; j<dp[0].length; j++){
//             System.out.print(dp[i][j]+" ");
//         }
//         System.out.println();
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[] = {4,2,7,1,3};
//     int sum = 10;
//     System.out.println(targetSumSubset(arr, sum));
// }





//UNBOUNDED KNAPSACK

// public static int unboundedKnapsack(int val[], int wt[], int W){
//     int n = val.length;
//     int dp[][] = new int[n+1][W+1];

//     for(int i=0; i<n+1; i++){
//         dp[i][0] = 0;
//     }
//     for(int j=0; j<n+1; j++){
//         dp[0][j] = 0;
//     }

//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<W+1; j++){
//             if(wt[i-1] <= j){
//                 dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
//             }else {
//                 dp[i][j] = dp[i-1][j];
//             }
//         }
//     }
//     print(dp);
//     return dp[n][W];
// }

// public static void print(int dp[][]) {
//     for(int i=0; i<dp.length; i++) {
//         for(int j=0; j<dp[0].length; j++) {
//             System.out.print(dp[i][j]+" ");
//         }
//         System.out.println();
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int val[] = {15,14,10,45,30};
//     int wt[] = {2,5,1,3,4};
//     int w = 7;
//     System.out.println(unboundedKnapsack(val, wt, w));
// }



//COIN CHANGE:  // tabulation

public static int coinChange(int coins[], int sum){
    int n = coins.length;
    int dp[][] = new int[n+1][sum+1];

    //initilize
    //i = coins
    // j = sum
    for(int i=0; i<n+1; i++){
        dp[i][0] = 1;
    }
    for(int j=1; j<sum+1; j++){
        dp[0][j] = 0;
    }

    //O(n*sum)
    for(int i=1; i<n+1; i++){
        for(int j=1; j<sum+1; j++){
            if(coins[i-1] <= j){
                dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
            }else { //invalid
                dp[i][j] = dp[i-1][j];
            }
    }

    }
    return dp[n][sum];
}
public static void main(String[] args) {
    int coins[] = {1,2,3};
    int sum = 4;
    System.out.println(coinChange(coins, sum));
}
























}
