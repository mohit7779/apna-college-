import java.util.*;

public class practicearrays {
    // public static void main(String[] args){
    //     try (Scanner sc = new Scanner(System.in)) {
    //     int size = sc.nextInt();
    //    int numbers[] = new int[size];
       
    //    //input:
    //   for(int i=0; i<size; i++){
    //     numbers[i] = sc.nextInt();
    //   }

    //   boolean isAscending = true;

    //   for (int i=0; i<numbers.length-1; i++){
    //   if(numbers[i] > numbers[i+1]){
       

    //     isAscending = false;
    //   }
    //   }

    //   if(isAscending){
    //     System.out.println("the array is sorted in ascending order");
    //   } else {
    //     System.out.println("the array is sorted in descending order");
    //   }
    // }
    // }
    



//     public static int trappedRainwater(int height[]){
//       int n = height.length;
//       // left max:
//       int leftmax[] = new int [height.length];
//       leftmax[0] = height[0];
//       for(int i=1; i<n; i++){
//         leftmax[i] = Math.max(height[i], leftmax[i-1]);
//       }
//       // rightmax:
//       int rightmax[] = new int [height.length];
//       rightmax[0] = height[0];
//       for(int i=n-2; i>=0; i--){
//         rightmax[i] = Math.max(height[i], rightmax[i+1]);

//       }
//       int trappedWater = 0;
//       for(int i=0; i<n; i++){
//       int waterLevel = Math.min(leftmax[i], rightmax[i]);
//       trappedWater += waterLevel-height[i];
     
//     }
//     return trappedWater;
//   }
  
// public static void main(String[] args){
// int height[] = {4,2,0,5,3,2,5};
// System.out.println(trappedRainwater(height));
// }






// public static int factorial(int n){
//   int f = 1;
//   for(int i=1; i<=n; i++){
//     f = f * i;
//   }
//   return f;
// }

// public static int binCoff(int n, int r){
//   int fact_n = factorial(n);
//   int fact_r = factorial(r);
//   int fact_nmr = factorial(n-r);

//   int binCoff = fact_n/(fact_r * fact_nmr);
//   return binCoff;
// }
// public static void main(String[] args) {
//   // System.out.println(factorial(5));
//   System.out.println(binCoff(2, 3));
// }



// public static boolean isPrime(int n){
//   if(n == 2){
//     return true;
//   }
//  for(int i=2; i<=Math.sqrt(n); i++){
//   if(n%i == 0){
// return false;
//   }
//  }
//  return true;
// }

// public static void main(String[] args) {
//   System.out.println(isPrime(12));
  
// }



// public static void primeInRange(int n){
//   for(int i=2; i<=n; i++){
//     if(isPrime(i)){
//       System.out.print(i+" ");
//     }
//     System.out.println();
//   }
// }
// public static void main(String[] args) {
//   primeInRange(20);
  
// }



// public static void binToDec(int binNum){
//   int myNum = binNum;
//   int pow = 0;
//   int decNum = 0;
//   while(binNum > 0){
//     int lastDigit = binNum % 10;
//     decNum = decNum+(lastDigit+(int)Math.pow(2, pow));
//     pow++;
//     binNum = binNum / 10;
//   }
//   System.out.println("DECIMAL OF MYnUM:" + myNum +" = "+decNum);

// }

// public static void decToBin(int n){
//   int myNum = 0;
//   int pow = 0;
//   int binNum = 0;

//   while(n > 0){
//     int rem = n % 2;
//     binNum = binNum + (rem* (int)Math.pow(10, pow));
//     pow++;
//     n = n/2;
//   }
//   System.out.println("binary form of"+ myNum+ " = "+ binNum);
// }
// public static void main(String[] args) {
//   // binToDec(101);
//   decToBin(7);
  
// }


// public static int printLargest(int number[]){
//   int largest = Integer.MIN_VALUE;
//   int smallest = Integer.MAX_VALUE;
//   for(int i=0; i<number.length; i++){
//     if(largest < number[i]){
//       largest = number[i];
//     }
//     if(smallest > number[i]){
//       smallest = number[i];
//     }
//   }
//   System.out.println(smallest);
// return largest;
// }
// public static void main(String[] args) {
//   int number[]  = {2,4,5,3,6,8,9,7};
//   System.out.println(printLargest(number));

// }



// public static void bubbleSort(int arr[]){
//   for(int turn=0; turn<arr.length-1; turn++){
//     for(int j=0; j<arr.length-1-turn; j++){
//       if(arr[j] < arr[j+1]){
        
//         int temp = arr[j];
//         arr[j] = arr[j+1];
//         arr[j+1] = temp;
//       }
//     }
//   }
  
// }
// public static void print(int arr[]){
//   for(int i=0; i<arr.length; i++){
//     System.out.println(arr[i]+" ");
//   }
//   System.out.println();
// }

// public static void main(String[] args) {
//   int arr[] = {5,4,1,3,2};
//   bubbleSort(arr);
//   print(arr);
// }




public static int binarySearch(int number[], int key){
  int start = 0;
  int end = number.length-1;

  while(start <= end){
    int mid = (start + end)/2;
  }
  if(number[mid] == key){
    return mid;
  }
  if(number[mid] < key){
    start = mid +1;
  }else{
    end = mid -1;
  }
}

public static void main(String[] args) {
  int number[] = {2,4,6,8,10,12};
  int key = 10;
}





























}

