//import java.util.*;
public class array {
    // public static void main(String[] args){
    //     try(Scanner sc = new Scanner(System.in)){
    //         int size = sc.nextInt();
    //         int numbers[] = new int[size]; 
    //     // int marks[] = {10,11,12};

    // int [] marks = new int[3];
    // marks[0] = 10;
    // marks[1] = 11;
    // marks[2] = 12;
   
    // System.out.println(marks[0]);
      // System.out.println(marks[1]);
    // System.out.println(marks[2]);


    // for input
//     for(int i=0; i<size; i++){
//         numbers[i] = sc.nextInt();
//     }
//     int x = sc.nextInt();
    
        
//     for(int i=0; i<numbers.length; i++){
//        if(numbers[i] == x){
//         System.out.println("x found at:"+ i);
//     }
//     }
// }
// }
// }


// homework practise
// import java.util.*;
// public class practicearrays {
//     public static void main(String[] args){
//         try (Scanner sc = new Scanner(System.in)) {
//         int size = sc.nextInt();
//         String name[] = new String[size];
//         //input
        
//         for(int i=0; i<size; i++){
//             name[i] = sc.next();
//         }

//         for(int i=0; i<name.length; i++){
//         System.out.println("name" +(i+ 1) +" is:" + name[i]);
//         }
//         }
//     }
    
// }




// new array classes begins : (ALPHA 2)


//public static void main(String[] args){
  //  int marks [] = new int[100];
    // if we want to calculate length of array:by using(.length operater)
    //System.out.println("length of array = "+marks.length);

    // try (Scanner sc = new Scanner(System.in)){
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();

    //     System.out.println("phy : " + marks[0]);
    //     System.out.println("chem : " + marks[1]);
    //     System.out.println("maths : " + marks[2]);


//         marks[2] = sc.nextInt();
// System.out.println("chem : " + marks[2]);

// if we want to calculate percentage then:
// int percentage = (marks[0] + marks[1]+(marks[2]))/3;
// System.out.println("percentage = " +percentage+"%");
//    
// }



// public static void update(int marks[]){
// for(int i=0; i<marks.length; i++){ // <-- imp loop:
// marks[i] = marks[i] + 1;
// }
// }

// public static void main(String[] args){
//     int marks[] = {97,98,99};
//     update(marks);

//     // to print our marks:
//     for(int i=0; i<marks.length; i++){
//         System.out.print(marks[i]+" ");
//     }
//     System.out.println();
// }

// }


// QS: linear search : find an array:


// public static int linearSearch(int numbers[],int key){
//     // for loop:
//     for(int i=0; i<numbers.length; i++){
//         if(numbers[i] == key){
//             return i;
//         }
      
//     }
//     return -1;
// }
// public static void main(String[] args){
//     int numbers[] = {2,4,6,8,10,12,14,16,18,20};
//     int key = 10;
//     int index = linearSearch(numbers, key);
//     if(index == -1){
//         System.out.println("number not found");
//     }else{
//         System.out.println("key is at index :"+ index);
//     }
// }




//QS: largest number in array:


// public static int getLargest(int numbers[]){
//     int largest = Integer.MIN_VALUE;  // -INFINITY
//     int smallest = Integer.MAX_VALUE;


//     for(int i=0; i<numbers.length; i++){
//         if(largest < numbers[i]){
//           largest = numbers[i];
//         }
//         if(smallest > numbers[i]){
//             smallest = numbers[i];
//         }
//     }
//     System.out.println("smallest value is : " + smallest);
//     return largest;
// }
// public static void main(String[] args){
//     int numbers[] = {1,2,6,3,5};
//     System.out.println("largest value is : "+getLargest(numbers));
// }

// QS: binary search:

// public static int binSearch(int numbers[], int key){
//     int start = 0, 
//     end = numbers.length-1;

//     while(start <= end){
//         int mid = (start + end)/2;

//         // comparisn:
//         if(numbers[mid] == key){
//             return mid;
//         }
//         if(numbers[mid] < key){
//             start = mid+1;
//         }else{
//             end = mid-1;
//         }
//     }
//     return -1;
// }

// public static void main(String[] args){
//     int numbers[] = {2,4,6,8,10,12,14};
//     int key = 10;
//     System.out.println("index for key is : " + binSearch(numbers, key));
// }



// QS: reverse array indexes:

// public static void reverse(int numbers[]){
//     int first = 0, last = numbers.length-1;

//     while(first < last){
//         // swap:
//         int temp = numbers[last];
//         numbers[last] = numbers[first];
//         numbers[first] = temp;

//         first++;
//         last--;
//     }
// }

// public static void main(String[] args){
//     int numbers[] = {2,4,6,8,10};

//     reverse(numbers);
//     for(int i=0; i<numbers.length; i++){
//         System.out.print(numbers[i]+" ");
//     }
//     System.out.println();

// }


// QS: print pairs:


// public static void printPairs(int numbers[]){
//     int tp = 0;  // tp=total pairs
//     for(int i=0; i<numbers.length; i++){
//         int curr = numbers[i];
//         for(int j=i+1; j<numbers.length; j++){
//             System.out.print("(" + curr +"," + numbers[j] +")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs = " + tp);
// }
// public static void main(String args[]){
//     int numbers[] = {2,4,6,8,10};
//     printPairs(numbers);
// }

//QS: print Subarray:

// public static void printSubarrays(int numbers[]){
// int ts = 0;
//     for(int i=0; i<numbers.length; i++){
//         int start = i;
//         for(int j=i; j<numbers.length; j++){
//             int end = j;
//             for(int k=start; k<=end; k++){
//                 System.out.print(numbers[k]+" ");
//             }
//                ts++;
//             System.out.println();
//         }   
//         System.out.println();
//     }
//     System.out.println("total subarrays ="+ts);
// }
// public static void main(String[] args){
//     int numbers[] = {2,4,6,8,10};
//     printSubarrays(numbers);
// }


//QS: print max subarrays:
// public static void printMaxSubarrays(int numbers[]){
//     int currSum = 0;
//     int maxSum = Integer.MIN_VALUE;

//     for(int i=0; i<numbers.length; i++){
//         int start = i;
//         for(int j=i; j<numbers.length; j++){
//             int end = j;
//             currSum = 0;
//             for(int k=start; k<=end; k++){
//                 //subarrays sum:
//                 currSum += numbers[k];

//             }
//             System.out.print(currSum);
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }
//         }
//         }
//         System.out.println(" max sum = " + maxSum);
// }


// public static void main(String[] args){
//     int numbers[] = {1,-2,6,-1,3};
//     printMaxSubarrays(numbers);
// }


// QS: print max sub arrays :
// public static void printMaxSubarrays(int numbers[]){
//     int currSum = 0;
//     int maxSum = Integer.MIN_VALUE;
//     int prefix[] =  new int [numbers.length];

//     prefix[0] = numbers[0];
//     for(int i=1; i<prefix.length; i++){
//         prefix[i] = prefix[i-1] + numbers[i];
//     }


//     for(int i=0; i<numbers.length; i++){
//         int start = i;
//         for(int j=i; j<numbers.length; j++){
//             int end = j;

//            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];


//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }
//         }
//     }
//     System.out.println("max sum =" +maxSum);
    
// }
// public static void main(String[] args){
//     int numbers[] = {1,-2,6,-1,3};
//     printMaxSubarrays(numbers);
// }


// QS: KADANES ALGORITHM:

// public static void kadanes(int numbers[]){
//     int ms = Integer.MIN_VALUE;
//     int cs = 0;

//     for(int i=0; i<numbers.length; i++){
//         cs = cs + numbers[i];
//         if(cs < 0){
//             cs = 0;
//         }
//         ms = Math.max(cs,ms);
//     }
//     System.out.println("max subarrays sum is :"+ms);
// }
// public static void main(String [] args){
//     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//     kadanes(numbers);
// }



//QS: trapped rain water arrays question:(DSA QUESTION )

// public static int trappedRainwater(int height[]){
//     int n = height.length;
//     // calculate left max boundary - arrays
//     int leftmax[] = new int [n];
//     leftmax[0] = height[0];
//     for(int i=1; i<n; i++){
//         leftmax[i] = Math.max(height[i], leftmax[i-1]);
//     }

//     // calculate right max boundary - arrays
//     int rightmax[] = new int [n];
//     rightmax[n-1] = height[n-1];
//     for(int i=n-2; i>=0; i--){
//         rightmax[i] = Math.max(height[i], rightmax[i+1]);

//     }
   
//     int trappedWater = 0;
//      // loop:
//      for(int i=0; i<n; i++){
//       int waterLevel = Math.min(leftmax[i], rightmax[i]);
//       trappedWater += waterLevel-height[i];
//      }  
//       return trappedWater;
// }
// public static void main(String[] args){
//     int height[] = {4,2,0,3,2,5};
//     System.out.println(trappedRainwater(height));
// }


// QS: buy and sell stocks:

// public static int buyAndSellStocks(int prices[]){
//     int buyPrice = Integer.MAX_VALUE;
//     int maxProfit = 0;

//     for(int i=0; i<prices.length; i++){
//         if(buyPrice < prices[i]){ // profit
//         int profit = prices[i] - buyPrice;  // todays profit
//         maxProfit = Math.max(maxProfit, profit);
//         } else{
//             buyPrice = prices[i];
//         }
//     }
//     return maxProfit;
// }
// public static void main(String[] args){
//     int prices[] = {7,6,4,3,1};
//    System.out.println( buyAndSellStocks(prices));
// }



// QS: buy and sell stocks: approach 2:


// public static int maxProfit(int prices[]){
//   int buy = prices[0];
//   int profit = 0;

//   //loop:
//   for(int i=1; i<prices.length; i++){
//     if(buy < prices[i]){
//       profit = Math.max(prices[i] - buy,profit);
//     }else{
//       buy = prices[i];
//     }
//   }
//   return profit;
// }
// public static void main(String[] args){
//   int prices[] = {7,1,5,3,6,4};
//   System.out.println(maxProfit(prices));
// }








}

















 























