import java.util.*;
public class Greedy {
    


    //activity selection code


// public static void main(String[] args){        //O(n)
//     int start[] = {1,3,0,5,8,5};
//     int end[] = {2,4,6,7,9,9};



//     //sorting
//     int activities[][] = new int[start.length][3];  //n(logn)
//     for(int i=0; i<start.length; i++){
//         activities[i][0] = i;
//         activities[i][1] = start[i];
//         activities[i][2] = end[i];
//     }
//     //lambda function -> dhortform
//     Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));


// // end time basis sorted
// int maxAct = 0;
// ArrayList<Integer> ans = new ArrayList<>();

// // 1st activity
// maxAct = 1;
// ans.add(activities[0][0]);
// int lastEnd = activities[0][2];

// for(int i=1; i<end.length; i++) {
//     if(start[i] >= lastEnd){
//     //activity selected
//     maxAct++;
//     ans.add(activities[i][0]);
//     lastEnd = activities[i][2];
// }

// }
// System.out.println("max activities ="+maxAct);
// for(int i=0; i<ans.size(); i++) {
//     System.out.print("A"+ans.get(i)+" ");
// }
// System.out.println();

// }





// fractional knapsack code

// public static void main(String[] args){
//     int val[] = {60,100,120};
//     int weight[] = {10,20,30};
//     int w = 50;


//     double ratio[][] = new double[val.length][2];
//     // 0th column => idx; 1st column => ratio

//     for(int i=0; i<val.length; i++){
//         ratio[i][0] = i;
//         ratio[i][1] = val[i]/(double)weight[i];
//     }
//     // ascending order
//     Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//     int capacity = w;
//     int finalval = 0;
//     for(int i=ratio.length-1; i>=0; i--){
//         int idx = (int)ratio[i][0];
//         if(capacity >= weight[idx]){
//             finalval += val[idx];
//             capacity -= weight[idx];

//         }else{
//             //include fractional item
//             finalval += (ratio[i][1] * capacity);
//             capacity = 0;
//             break;
//         }
//     } 
//             System.out.println("final value=" + finalval);

// }







// minimum absolute difference pairs   O(nlogn)

// public static void main(String[] args){
//     int A[] = {1,2,3};
//     int B[] = {2,1,3};

//     Arrays.sort(A);
//     Arrays.sort(B);

//     int minDiff = 0;

//     for(int i=0; i<A.length; i++){
//         minDiff += Math.abs(A[i] - B[i]);
//     }

//     System.out.println("min absolute difference of pairs=: " + minDiff);
// }




// max chian length of pairs
// public static void main(String[] args){        // o(nlogn)
//     int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

//     Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//     int chainLenght = 1;
//     int chainEnd  =pairs[0][1]; //last selected paies end // chain end

//     for(int i=1; i<pairs.length; i++) {
//         if(pairs[i][0] > chainEnd){
//             chainLenght++;
//             chainEnd = pairs[i][1];
//         }
//     }

//     System.out.println("max chain length: " + chainLenght);

// }



// indian coin

// public static void main(String[] args){
//     Integer coins[] = {1,2,5,10,20,50,100,500,2000};

//     Arrays.sort(coins, Comparator.reverseOrder());

//     int countOfCoins = 0;
//     int amount = 590;
//     ArrayList<Integer> ans = new ArrayList<>();

//     for(int i=0; i<coins.length; i++){
//         if(coins[i] <= amount){
//             while(coins[i] <= amount){
//                 countOfCoins++;
//                 ans.add(coins[i]);
//                 amount -= coins[i];
//             }
//         }
//     }
//     System.out.println("total min coins used ="+ countOfCoins);

//     for(int i=0; i<ans.size(); i++){
//         System.out.print(ans.get(i)+" ");
//     }
//     System.out.println();

// }




// job sequencing problem

// static class job{
//     int deadLine;
//     int profit;
//     int id;

//     public job(int i,int d,int p){
//         id = i;             // constructer
//         deadLine = d;           // constructer
//         profit = p;             // constructer
//     }
// }
// public static void main(String[] args) {
//     int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

//     ArrayList<Job> jobs = new ArrayList<>();

    
//     for(int i=0; i<jobsInfo.length; i++) {
//         jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
//     }
//         Collections.sort(jobs, (a,b) -> a.profit-b.profit);  //decending order of profit


//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i=0; i<jobs.size(); i++){
//             Job curr = jobs.get(i);
//             if(curr.deadLine > time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         //print seq

//         System.out.println("max jobs ="+ seq.size());
//         for(int i=0; i<seq.size(); i++){
//             System.out.println(seq.get(i)+" ");
//         }
//         System.out.println();

// }



// chocolate problem


// public static void main(String[] args){
//     int n = 4, m = 6;
//     Integer costVer[] = {2,1,3,1,4}; // m-1
//     Integer costHor[] = {4,1,2};  // n-1


//     Arrays.sort(costVer, Collections.reverseOrder());
//     Arrays.sort(costHor, Collections.reverseOrder());

//     int h = 0, v = 0;
//     int hp = 1, vp = 1;
//     int cost = 0;

//     while(h < costHor.length && v < costVer.length){
//         // vertical cost < hor cost
//         if(costVer[v] <= costHor[h]){  // horizontal cut
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//         }else{// vertical CUT
//             cost += (costVer[v] * hp);
//             vp++;
//             v++;
//         }
//     } 
//     while(h < costHor.length){
//         cost += (costHor[h] * vp);
//         hp++;
//         h++;
//     }

//     while(v < costVer.length){
//         cost += (costVer[v] * hp);
//         vp++;
//         v++;
//     }
//     System.out.println("min cost of cuts="+ cost);

// }



//   QS:


// static int balancedPartition(String str, int n){
//     if(n ==0)
//     return 0;

//     int r = 0 , l = 0;
//     int ans = 0;

//     for(int i=0; i<n; i++){
//     if(str.charAt(i) == 'L'){
//         l++;
//     }else if(str.charAt(i) == 'R'){
//         r++;
//     }if(r == l){
//         ans++;
//     }
//     }
//     return ans;
// }
// public static void main(String[] args){
//     String str = "LRRRRLLRLLRL";
//     int n = str.length();
//     System.out.println(balancedPartition(str, n)+"\n");
// }



// 


// public static char[] lexoSmall(int n, int k){
//     char arr[] = new char[n];
//     Arrays.fill(arr, 'a');

//     for(int i=n-1; i>=0; i--){
//         k -= i;

//         if(k >= 0){
//         if(k >= 26){
//             arr[i] = 'z';
//             k -= 26;
//         }
//         else{
//             arr[i] = (char)(k + 97 -1);
//             k -= arr[i] -'a' + 1 ;
//         }
//         }
//         else break;
//         k += i;
//     }
//     return arr;
// }
// public static void main(String[] args) {
//     int n = 10, k= 3;
//     char arr[] = lexoSmall(n,k);
//     System.out.println(new String(arr));
// }




// buy and sell stocks

// static int maxProfit(int prices[], int n){

//     int buy = prices[0], maxProfit = 0;

//     for(int i=0; i<n; i++){
//         if(buy > prices[i])
//             buy = prices[i];

//             else if(prices[i] - buy > maxProfit){
//                 maxProfit = prices[i]-buy;
//             } 
//         }
//         return maxProfit;   
//     }
// public static void main(String[] args) {
//     int prices[] = {7,1,5,6,4};
//     int n = prices.length;

//     int maxProfit = maxProfit(prices, n);
//     System.out.println(maxProfit);
// }












}
