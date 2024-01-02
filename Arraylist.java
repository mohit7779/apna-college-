//import java.util.ArrayList;
import java.util.*;

public class Arraylist<T> {

// public static void main(String[] args) {
//     // className objectName = new className();
//     ArrayList<Integer>list = new ArrayList<>();
//     ArrayList<String>list2 = new ArrayList<>();
//     ArrayList<Boolean>list3 = new ArrayList<>();

//     // to add element:
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);

    // list.add(1,9);
    // System.out.println(list);

// to get size od an array
// System.out.println(list.size());


// // to print the array list
// for(int i=0; i<list.size(); i++){
//     System.out.print(list.get(i) + " ");
// }
// System.out.println();


// print in reverse order
// for(int i=list.size()-1; i>=0; i--){
//     System.out.print(list.get(i)+ " ");
// }
// System.out.println();



// get operation: or to get element:

// int element = list.get(3);
// System.out.println(element);


// delete operation: or to delete element
// list.remove(3);
// System.out.println(list);


// set operation: or to set element
// list.set(2,10); // 2 ki jagha 10 ayga output me
// System.out.println(list);


// contain operation: or to check it exists or not 

// 
//}


// print maximum:
// public static void main(String[] args){  //O(n)
//     ArrayList<Integer>list = new ArrayList<>();
    
//     list.add(6);
//     list.add(5);
//     list.add(4);
//     list.add(9);
//     list.add(2);

           // to print maximum
//     int max = Integer.MIN_VALUE;
//     for(int i=0; i<list.size(); i++){
//     //     if(max < list.get(i)){
//     //         max = list.get(i);

//            //2nd approach--->
//         max = Math.max(max, list.get(i));
//     //     }
//     }

//     System.out.println("max value = " + max);
// }







// public static void swap(ArrayList<Integer> list,int idx1,int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1,list.get(idx2));
//     list.set(idx2,temp);
// }
// public static void main(String[] args){  //O(n)
//     ArrayList<Integer>list = new ArrayList<>();
    
//     list.add(2);
//     list.add(5);
//     list.add(9);
//     list.add(3);
//     list.add(6);

//     int idx1 = 1, idx2 = 3;
//     System.out.println(list);
//     swap(list, idx1, idx2);
//     System.out.println(list);

// }




// print elements in ascending order:

// public static void swap(ArrayList<Integer> list,int idx1,int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1,list.get(idx2));
//     list.set(idx2,temp);
// }
// public static void main(String[] args){  //O(n)
//     ArrayList<Integer>list = new ArrayList<>();
    
//     list.add(2);
//     list.add(5);
//     list.add(9);
//     list.add(3);
//     list.add(6);

//     System.out.println(list); //optmised fnx
//     Collections.sort(list);  //ascending order
//     System.out.println(list);

//     //descending order
//     Collections.sort(list,Collections.reverseOrder());;
//     System.out.println(list);
// }



// public static void main(String[] args) {
//     ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1); list.add(2);
//     mainList.add(list);

//     ArrayList<Integer>list2 = new ArrayList<>();
//     list2.add(3); list2.add(4);
//     mainList.add(list2);


//     for(int i=0; i<mainList.size(); i++){
//         ArrayList<Integer> currentList = mainList.get(i);
//         for(int j=0; j<currentList.size(); j++){
//             System.out.print(currentList.get(j)+ " ");
//         }
//         System.out.println();
//     }
//     System.out.println(mainList);
// }






// public static void main(String[] args){
//     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//     ArrayList<Integer> list1 = new ArrayList<>();
//     ArrayList<Integer> list2 = new ArrayList<>();
//     ArrayList<Integer> list3 = new ArrayList<>();

//     for(int i=1; i<=5; i++){
//         list1.add(i*1); // 1 2 3 4  5
//         list2.add(i*2); // 2 4 6 8 10
//         list3.add(i*3); // 3 6 9 12 15

//     }

//     mainList.add(list1);
//     mainList.add(list2);
//     mainList.add(list3);

//     System.out.println(mainList);


//     // nested loop
//     for(int i=0; i<mainList.size(); i++){
//         ArrayList<Integer> currList = mainList.get(i);
//         for(int j=0; j<currList.size(); j++){
//             System.out.print(currList.get(j)+" ");
//         }
//         System.out.println();
//     }

// }




// Store water;

// public static int storeWater(ArrayList<Integer> height){
//     int maxWater = 0;
//     //bruteForce   O(n^2)
//     for(int i=0; i<height.size(); i++){
//         for(int j=i+1; j<height.size(); j++){
//             int ht = Math.min(height.get(i), height.get(j));//hight nikaal liya
//             int width = j-i;
//             int currWater = ht * width;
//             maxWater = Math.max(maxWater, currWater);
//         }
//     }
//     return maxWater;
// }


//  2nd approach (2  pointer approach)O(n)
// public static int storeWater(ArrayList<Integer>height){
//     int maxWater = 0;
//     int lp = 0;
//     int rp = height.size()-1;


//     while(lp < rp){
//         // calculate water area
//         int ht = Math.min(height.get(lp),height.get(rp));
//         int width = rp-lp;
//         int currWater = ht * width;
//         maxWater = Math.max(maxWater,currWater);

//         // update ptr
//         if(height.get(lp) < height.get(rp)){
//             lp++;
//         }else{
//             rp--;
//         }
//     }
//     return maxWater;

// }

// public static void main(String[] args){
//     ArrayList<Integer> height = new ArrayList<>();
//     // 1,8,6,2,5,4,8,3,7
//     height.add(1);
//     height.add(8);
//     height.add(6);
//     height.add(2);
//     height.add(5);
//     height.add(4);
//     height.add(8);
//     height.add(3);
//     height.add(7);
//     System.out.println(storeWater(height));
// }



// QS: pairSum1

// public static boolean pairSum1(ArrayList<Integer>list,int target){
//     //brute force

//     for(int i=0; i<list.size(); i++){
//         for(int j=i+1; j<list.size(); j++){
//             if(list.get(i) + list.get(j) == target){
//                 return true;
//             }
//         }
//     }
//     return false;
// }

// 2 pointer approach
// public static boolean pairSum1(ArrayList<Integer>list,int target){
//     int lp = 0;
//     int rp = list.size()-1;

//     while(lp != rp){
//         //case1
//         if(list.get(lp)+list.get(rp) == target){
//             return true;
//         }

//         //case2
//         if(list.get(lp)+list.get(rp) == target){
//             lp++;
//         }else{
//             //case3
//             rp--;
//         }
//     }
//     return false;
// }
// public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);

//     int target = 5;
//     System.out.println(pairSum1(list, target));
// }


// QS: pairSum2 O(n):

// public static boolean pairSum2(ArrayList<Integer>list,int target) {
//     int bp = -1; //bp=breaking point
//     int n = list.size();
//     for(int i=0; i<list.size(); i++){
//         if(list.get(i) > list.get(i+1)){ //breaking point
//             bp = i; // i ki value store krliya
//             break;
//         }
//     }
//     int lp = bp+1;  // smallest element                    //lp=left pointer
//     int rp = bp; // largest element


//     while(lp != rp){
//         // case1
//         if(list.get(lp) + list.get(rp) == target){
//             return true;
//         }

//         //case2
//        if (list.get(lp) + list.get(rp) < target){
//         lp = (lp+1) % n;
//        }else{
//         //case3
//         rp = (n + rp-1) % n;
//        }
//     }
//     return false;
// }
// public static void main(String[] args) {
//     ArrayList<Integer>list = new ArrayList<>();
//     list.add(11);
//     list.add(15);
//     list.add(6);
//     list.add(7);
//     list.add(8);
//     list.add(9);
//     list.add(10);
//     list.add(11);

//     int target = 160;
//     System.out.println(pairSum2(list, target));


// }




//QS: practise Question


// public static boolean monotonicallyIncreasing(ArrayList<Integer>nums){
//     boolean inc = true;
//     boolean dec = false;

//     for(int i=0; i<nums.size()-1; i++){
//         if(nums.get(i) > nums.get(i+1)){
//             inc = false;
//             if(nums.get(i) < nums.get(i+1)){
//                 dec = false;
    
//             }
//         }
//             }
//     return inc||dec;
// }
// public static void main(String[] args) {
//     ArrayList<Integer> nums = new ArrayList<>();

//     nums.add(1);
//     nums.add(3);
//     nums.add(2);
//     nums.add(4);

//     System.out.println(monotonicallyIncreasing(nums));
// }


//QS:2

// public static void main(String[] args) {
//     ArrayList<Integer> nums = new ArrayList<>();
//     nums.add(10);
//     nums.add(6);
//     nums.add(5);
//     nums.add(3);
// }

// public ArrayList<Integer> findLonely(ArrayList<Integer> nums){
//     Collections.sort(nums);
//     ArrayList<Integer> list = new ArrayList<>();

//     for(int i=1; i<nums.size()-1; i++){
//         if(nums.get(i-1) + 1 > nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
//         list.add(nums.get(i));
//     }
// }

// if(nums.size() == 1){
//     ArrayList<Integer> list;
//     ArrayList<Integer> nums;
//     list.add(nums.get(0));
// }
// if(nums.size() > 1){
//     if(nums.get(0) + 1 < nums.get(i)){
//         list.add(nums.get(0));
//     }
    
//     if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
//         list.add(nums.get(nums.size()-1));
//     }
// }
// return list;



//QS: findOccurences


public static int mostFrequent(ArrayList<Integer>nums,int key){
    int[] result =  new int[1000];

    for(int i=0; i<nums.size()-1; i++){
        if(nums.get(i) == key){
            result[nums.get(i+1)]++;
        }
    }

    int max = Integer.MIN_VALUE;
    int ans = 0;

    for(int i=0; i<1000; i++){
        if(result[i] > max){
            max = result[i];
            ans = i;
        }
    }
    return ans;
}
public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(2);
    nums.add(2);
    nums.add(2);
    nums.add(3);
    int key = 2;

    System.out.println(mostFrequent(nums, key));
}
public int size() {
    return 0;
}
public Graphs1.Edge get(int i) {
    return null;
}









}
