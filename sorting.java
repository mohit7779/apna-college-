import java.util.Arrays;
public class sorting {
    //     public static void printArray(int arr[]){
    //         for (int i=0; i<arr.length; i++){
    //             System.out.println(arr[i]+" ");
    //         }
    //         System.out.println();   
    //     }

    // public static void main(String[] args){
    //     int arr[] = {7,8,3,1,2,};

       // bubble sort:
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length-i-1; j++){
        //         if(arr[j]>arr[j+1]){

        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }




       // selection sort:
    //    for(int i=0; i<arr.length-1; i++) {
    //    int smallest = i;
    //    for(int j=i+1; j<arr.length; j++) {
    //     if(arr[smallest] > arr[j]){
    //         smallest = j;
    //     }
    //    }
    //    int temp = arr[smallest];
    //    arr[smallest] = arr[i];
    //    arr[i] = temp;
    //    }

    //     printArray(arr);
    // }

 //    ALPHA 2

 //(1) BASIC SORTING:

   // QS: BUBBLE SORTING:
   
//  public static void bubbleSort(int arr[]){
//     for(int turn=0; turn<arr.length-1; turn++){
//         for(int j=0; j<arr.length-1-turn; j++){
//             if(arr[j] > arr[j+1]){

//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }

//     }
//  }
//  public static void printArray(int arr[]){
//     for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//  }
  
//  public static void main(String[] args){
//     int arr[] = {5,4,1,3,2};
//     bubbleSort(arr);
//     printArray(arr);
//  }



// QS: selection SORTING:


public static void selectionSort(int arr[]){
   for(int i=0; i<arr.length-1; i++){
      int minPos  = i;
      for(int j=i+1; j<arr.length; j++){
         if(arr[minPos] > arr[j]){
             minPos  = j;
         }
         
      }
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
   }
}
public static void printArray(int arr[]){
   for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
   }
   System.out.println();
}
public static void main(String[] args) {
   int arr[] = {4,6,89,4,2,5,7};
   selectionSort(arr);
   printArray(arr);

 }


   

//QS: insertion SORTING:
// public static void insertionSort(int arr[]){
// for(int i=1; i<arr.length; i++){
//    int curr = arr[i];
//    int prev = i-1;
//    // finding out the current position to insert:
//    while(prev >= 0 && arr[prev] > curr){
//       arr[prev+1] = arr[prev];
//       prev--;
//    }

//    //insertion:
//    arr[prev+1] = curr;
// }
// }
// public static void printArr(int arr[]){
//    for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//    }
//    System.out.println();
// }
// public static void main(String[] args){
//    int arr[] = {5,4,1,3,2};
//  insertionSort(arr);
//    printArr(arr);
// }

 


//QS: inbuilt arrays:(for this : you have to import package: that is : import java.util.Arrays)
// public static void main(String[] args){
//        int arr[] = {5,4,1,3,2};
//      //insertionSort(arr);                 //(for reverse order : like in decending order : u have to write after (arr,collections.reverseOrder()..)) and also import package :import java.util.Collections..
//      Arrays.sort(arr);
//      printArr(arr);
//     }




// qs: COUNTING SORT:

// public static void countingSort(int arr[]){
//    int largest = Integer.MIN_VALUE;
//    for(int i=0; i<arr.length; i++){
//       largest = Math.max(largest, arr[i]);
//    }

//    int count[] = new int[largest+1];
//    for(int i=0; i<arr.length; i++){
//       count[arr[i]]++;
//    }

//    // sorting
//    int j = 0;
//    for(int i=0; i<count.length; i++){
//       while(count[i] > 0){
//          arr[j] = i;
//          j++;
//          count[i] --;
//       }
//    }
// }
// public static void printArr(int arr[]){
// for(int i = 0; i < arr.length; i++){
//    System.out.print(arr[i]+" ");
// }
// System.out.println();
// }

//       public static void main(String[] args){
//          int arr[] = {5,4,1,3,2};
//          countingSort(arr);
//          printArr(arr);
//       }

   










    }

