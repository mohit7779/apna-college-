public class Recursion1 {



    // to print number from 1 to 5 --->
// public static void printNumb(int n){
// if(n == 6){
//   return;
// }
//     System.out.println(n);
//     printNumb(n+1);
// }
// public static void main(String[] args) {
//     int n = 1;
//     printNumb(n);
// }
// }





//     public static void printSum(int i, int n, int sum){
//         if(i == n){
//           sum += i;
//           System.out.println(sum);
//         return;
//     }
//     sum += i;
//     printSum( i+1, n, sum);
//     System.out.println(i);
// }
//     public static void main(String[] args) {
//          printSum(1, 5, 0);
// }





           // to print factorial:

// public static int calcfactorial(int n){
//     if(n == 1 || n == 0) {
//         return 1;
//     }
//     int fact_nm1 = calcfactorial(n-1);
//     int fact_n = n * fact_nm1;
//     return fact_n;
// }
//            public static void main(String[] args){
//            int n = 5;
//            int ans = calcfactorial(n);
//            System.out.println(ans);
//            }





// fibonacci series:---->


// public static void printFib(int a,int b, int n){
//     if(n ==0){
//         return;
//     }
//     int c = a + b ;
//     System.out.println(c);
//    printFib(b, c, n-1);

// }
// public static void main(String[] args){
//     int a = 0, b = 1;
//     System.out.println(a);
//     System.out.println(b);
//     int n = 10;
//     printFib(a, b, n-2);
// }





// power function------>
// print X^n (stack height = n)

// public static int calcPower(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     if(x == 0){
//         return 0;
//     }
//     int xpownm1 = calcPower(x, n-1);
//     int xpow = x*xpownm1;
//     return xpow;
// }
// public static void main(String[] args) {
//     int x = 2, n = 5;
//     int ans = calcPower(x, n);
//     System.out.println(ans);
    

// }



//print X^n (stack height = logn)

// public static int calcPower(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     if(x == 0){
//         return 0;
//     }
//     if(n % 2 == 0){
//         return calcPower(x,n/2) * calcPower(x, n/2);
//     }
//     else{
//         return calcPower(x,n/2) * calcPower(x,n/2) *x;
//     }
//     // int xPownm1 = calcPower(x, n-1);
//     // int xPow = x*xPownm1;
//     // return xPow;

// }
// public static void main(String[] args) {
//     int x = 2, n = 5;
//     int ans = calcPower(x, n);
//     System.out.println(ans);
// }

//}

//  ALPHA 2.0



// public static void decreasingOrder(int n){
//     if(n == 1){
//         System.out.println(1);
//         return;
//     }
//     System.out.println(n);
//     decreasingOrder(n-1);
// }
// public static void main(String[] args) {
// int n = 10;
// decreasingOrder(n);
// }



//QS: print factorial

// public static int fact(int n){
//     if( n == 0){
//         return 1;
//     }
//     int fnm1 = fact(n-1);
//     int fn = n * fact(n-1);
//     return fn;
// }
// public static void main(String[] args) {
//     int n = 5;
//     System.out.println(fact(n));

// }



//QS: print sum of n natural numbers


// public static int calcSum(int n){
//     if(n == 1){
//         return 1;
//     }
//     int snm1 =  calcSum(n-1);
//     int sn = n +  calcSum(n-1);
//     return sn;
// }
// public static void main(String[] args) {
// int n = 5;
// System.out.println(calcSum(n));

// }


//QS: calculate nth term in fibonacci 

// public static int fib(int n){
//     if(n == 0 || n == 1){
//         return n;
//     }
//     int fnm1 = fib(n-1);
//     int fnm2 = fib(n-2);
//     int fn = fnm1+fnm2;
//     return fn;
// }

// public static void main(String[] args) {
//     int n = 5;
//    System.out.println(fib(n));
// }      


// QS: check if the arrar is sorted:


// public static boolean isSorted(int arr[],int i){
//     if(i == arr.length-1) {
//         return true;
//     }

// if(arr[i] > arr[i+1]) {
//     return false;
// }   

//     return isSorted(arr,i+1);
// }

// public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5,6,7};
//     System.out.println(isSorted(arr, 0));

// }


// QS: find occurence:

// public static int firstOccurence(int arr[],int key,int i){
//     if(i == arr.length){
//         return -1;
//     }
// if(arr[i] == key){
//     return i;
// }
// return firstOccurence(arr, key, i+1);
// }
// public static void main(String[] args) {
//     int arr[] = {8,3,6,9,5,10,2,5,3};
//     System.out.println(firstOccurence(arr, 5, 0));

// }



// QS: X^n  

// public static int power(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     // int xnm1 = power(x,n-1);
//     // int xn = x * xnm1;
//     // return xn;

//     return x * power(x,n-1);
// }
// public static void main(String[] args) {
//     System.out.println(power(2, 10));

// }



// QS: x^n (optimized code) o(logn)


// public static int optimizedPower(int a, int n){
//     if(n == 0){
//         return 1;
//     }
//     int halfPower = optimizedPower(a, n/2);
//     int halfPowerSq = halfPower * halfPower;

//     // n odd
// if(n % 2 != 0){
//     halfPowerSq = a * halfPowerSq;
// }
//     return  halfPowerSq;
// }
// public static void main(String[] args) {
//     System.out.println(optimizedPower(2, 5));

// }



// QS: tilimg problem (amazon)
// public static int tilingProblem(int n){

//     if(n == 0 || n == 1){
//         return 1;
//     }
//     //kaam
//     //vertically
//     int fnm1 = tilingProblem(n-1);
//     // horizontally
//     int fnm2 = tilingProblem(n-2);
//     int totways = fnm1 + fnm2;
//     return totways;

//     // approach 2
//     //return tilingProblem(n-1) + (n-1) * tilingProblem(n-2);
// }
// public static void main(String[] args) {
//     System.out.println(tilingProblem(4));

// }




// QS: removing duplicate from a String:

// public static void removeDuplicate(String str, int idx , StringBuilder newStr , boolean map[]){
// if(idx == str.length()){
//     System.out.println(newStr);
//     return;
// }


// // kaam
// char currChar = str.charAt(idx);
// if(map[currChar-'a'] == true){
//     //duplicate
//     removeDuplicate(str, idx+1, newStr, map);
// }else{
//     map[currChar-'a'] = true;
//     removeDuplicate(str, idx+1, newStr.append(currChar), map);
// }
// }


// public static void main(String[] args) {
// String str = "appnacollege";
// removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
// }



// QS: friends pairing

// public static int friendsPairing(int n){
//     if(n ==1 || n == 2){
//         return n;
//     }

//     return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
// }
// public static void main(String[] args) {
// System.out.println(friendsPairing(3));
// }


// QS: Binary string
// public static void printBinString(int n, int lastPlace,String str){

//     // base case
//     if(n == 0){
//         System.out.println(str);
//         return;
//     }

//     //kaam
//     printBinString(n-1, 0, str+"0");

//     if(lastPlace == 0){
//         printBinString(n-1, 1, str+"1");
//     }
// }


// public static void main(String args[]){
//     printBinString(3, 0, "");
// }



//QUESTION PROBLEM

// //QS: find allOccurrences:(kon kon se point pe 2 count ho raha h)

// public static void allOccurrence(int arr[],int key,int i){

//     if(i == arr.length){
//         return;
//     }

//     if(arr[i] == key){
//         System.out.println(i+" ");
        
//     }
//     allOccurrence(arr, key, i+1);
// }
// public static void main(String[] args){
// int arr[] = {3,2,4,5,6,2,7,2,2};
// int key = 2;
// allOccurrence(arr, key, 0);
// System.out.println();
// }




//qs: convert number into string


// static String digit[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
// public static void printDigits(int numbers){

//     if(numbers == 0){
//         return;
//     }

//     int lastDigit = numbers%10;
//     printDigits(numbers/10);
//     System.out.println(digit[lastDigit]+" ");
// }
// public static void main(String[] args) {
// printDigits(1234);

// }




// //QS: find length of a String:

// public static int length(String str){

//     if(str.length() == 0){
//         return 0;
//     }
//     return length(str.substring(1))+1;
// }
// public static void main(String[] args) {
//     String str = "abcde";
//     System.out.println(str);
// }



//QS: we are given a string S, we need to find the count of all contigous substring starting and ending with the same character:

// public static int countSubstrs(String str,int i, int j, int n){
//     if(n == 1){
//         return 1;
//     }
//     if(n <= 0){
//         return 0;
//     }

//     int res = countSubstrs(str, i, j, n-1)+
//     countSubstrs(str, i, j-1, n-1)-
//     countSubstrs(str, i+1, j-1, n-2);

//     if(str.charAt(i) == str.charAt(j)){
//         res++;
//     }
//     return res;
// }
// public static void main(String[] args) {
// String str = "abcdek";
// int n = str.length();
// System.out.println(countSubstrs(str, 0, n-1, n));
// }



// QS: tower of hamoi:

// public static void towerOfHanoi(int n,String src,String helper,String dest){
//     if(n == 1){
//         System.out.println(" trabsfer disk " + n + " from "+ src + " to " + dest);
//         return;
//     }
//     towerOfHanoi(n-1, src, helper, dest);
//     System.out.println(" trabsfer disk " + n + " from "+ src + " to " + dest);
//     towerOfHanoi(n-1, helper, src,dest);
// }

// public static void main(String[] args) {
// int n = 3;
// towerOfHanoi(n, "s", "h", "d");


// }





}
















