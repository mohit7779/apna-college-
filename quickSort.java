public class quickSort {
    // public static int partition(int arr[],int low,int high){
    //     int pivot = arr[high];
    //     int i = low-1;


    //     for(int j=low; j<high; j++){
    //         if(arr[j] < pivot){
    //             i++;

    //             //swap
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;

    //         }
    //     }
    //     i++;
    //     int temp = arr[i];
    //     arr[i] = pivot;
    //     arr[high] = temp;
    //     return i;
    // }
    // public static void QuickSort(int arr[], int low,int high){
    //     if(low < high){
    //         int pidx = partition(arr,low,high);
    //         QuickSort(arr, low, high-1);
    //         QuickSort(arr, pidx+1, high);
    //     }
    // }
    // public static void main(String[] args){
    //     int [] arr = {6,3,9,5,2,8};
    //     int n = arr.length;


    //     QuickSort(arr, 0, n-1);

    //     //print
    //     for(int i=0; i<n; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }



// public static void printArr(int arr[]){
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]+" ");
// }
// System.out.println();
// }

// public static void quickSort(int arr[],int si,int ei){
//     if(si >= ei){
//         return;
//     }

//     //last element
//     int pidx = partition(arr, si, ei);
//     quickSort(arr, si, pidx-1);
//     quickSort(arr, pidx+1, ei);
// }



// public static void partition(int[] arr,int si,int ei){
//     int pivot = arr[ei];
//     int i = si-1; //to make place for element smaller than pivot

//     for(int j=0; j<ei; j++){
//         if(arr[j] <= pivot){
//             i++;

//             //swap
//             int temp = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp;
//         }
//     }i++;
//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp;
//     return i;
// }

// public static void main(String[] args){
//     int arr[]  = {6,3,9,8,2,5};
//     quickSort(arr, 0, arr.length-1);
//     printArr(arr);
// }





// divide conquer
// public static int search(int arr[],int tar,int si,int ei){
//     //base case
//     if(si > ei){
//         return -1;
//     }

//     //kaam
//     int mid = si +(ei - si)/2;

//     //case found
//     if(arr[mid] == tar){
//         return mid;
//     }

//     //mid on line 1
//     if(arr[si] <= arr[mid]){
//         //case a: left
//         if(arr[si] <= tar && tar <= arr[mid]){
//             return search(arr, tar, si, mid-1);
//         }else{
//             //case b: right
//             return search(arr, tar, mid+1, ei);
//         }
//     }

//     // mid on line 2
//     else{
//         // case c: right
//         if(arr[mid] <= tar && tar <= arr[ei]){
//             return search(arr, tar, mid+1, ei);
//         }else{
//             //case d: left
//             return search(arr, tar, si, mid-1);
//         }
//     }
// }
// public static void main(String[] args){
// int arr[] = {4,5,6,7,0,1,2};
// int tar = 0;
// int tarIdx = search(arr, tar, 0, arr.length-1);
// System.out.println(tarIdx);
// }



// home work problems
// apply merge sort to sort an rray of String .(assume that all the character in all the string are in lower case:)(EASY LEVEL)


// public static String[] mergeSort(String[] arr, int lo, int hi){
//     if(lo == hi){
//         String[] A = {arr[lo]};
//         return A;
//     }

//     int mid = lo +(hi - lo)/2;
//     String[] arr1 = mergeSort(arr, lo, mid);
//     String [] arr2 = mergeSort(arr, mid+1, hi);

//     String[] arr3 = merge(arr1, arr2);
//     return arr3;
// }

// static String[] merge(String[] arr1, String[] arr2){
//     int m = arr1.length;
//     int n = arr2.length;
//     String[] arr3 = new String[m+n];

//     int idx = 0;

//     int i = 0;
//     int j = 0;

//     while(i < m && j < n){
//         if(isAlphabeticallySmaller(arr1[i],arr2[j])){
//             arr3[idx] = arr1[i];
//             i++;
//             idx++;
//         }else{
//             arr3[idx] = arr2[j];
//             j++;
//             idx++;
//         }
//     }
//     while(i < m){
//         arr3[idx] = arr1[i];
//         i++;
//         idx++;
//     }
//     while(j < n){
//         arr3[idx] = arr2[j];
//         j++;
//         idx++;
//     }
//     return arr3;
// }

// // return true if str1 apperars before str2 in alphabetical order
// static boolean isAlphabeticallySmaller(String str1, String str2){
//     if(str1.compareTo(str2) < 0){
//         return true;
//     }
//     return false;
// }
// public static void main(String[] args) {
// String[] arr = {"sun","earth","mars","mercury"};
// String[] a = mergeSort(arr, 0, arr.length-1);
// for(int i=0; i<a.length; i++) {
//     System.out.println(a[i]);
// }
// }




// given an array of nums of size n , return the majority element:(MEDIUM LEVEL)


// public static int majorityElement(int [] nums){
//     int majorityCount = nums.length/2;

//     for(int i=0; i<nums.length; i++){
//         int count = 0;
//         for(int j=0; j<nums.length; j++){
//             if(nums[i] == nums[j]){
//                 count += 1;
//             }
//         }
//         if(count > majorityCount){
//             return 1;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args){
// int nums[] = {2,2,1,1,1,2,2,};
// System.out.println(majorityElement(nums));
// }


// approach 2 by divide&conquer methods

// public static int countInRange(int[] nums, int num,int lo,int hi){
//     int count = 0;
//     for(int i=lo; i<=hi; i++){
//         if(nums[i] == num){
//             count++;
//         }
//     }
//     return count;
// }

// private static int majorityElementRec(int[] nums, int lo, int hi){
//     //base case: the only element in an arrray of size 1 is the majority element

//     if(lo == hi){
//         return nums[lo];
//     }
//     // recurse on left and right halves of this alice:
//     int mid = (hi - lo)/2 + lo;
//     int left = majorityElementRec(nums,lo,mid);
//     int right = majorityElementRec(nums,mid+1,hi);

//     // if two halves agree on the majority element, return it:
//     if(left == right){
//         return left;
//     }
//     // otherwise, count each element and return the "winner"
//     int leftCount = countInRange(nums,left, lo, hi);
//     int rightCount = countInRange(nums,right,lo,hi);

//     return leftCount > rightCount ? left : right;

// }

// public static int majorityElement(int [] nums){
//     return majorityElementRec(nums,0,nums.length-1);
// }

// public static void main(String[] args){
//     int nums[] = {2,2,1,1,1,2,2};
//     System.out.println(majorityElement(nums));

// }



//  QS: 

public static int merge(int arr[] ,int left, int mid, int right){
    int i = left, j = mid, k = 0;
    int invCount = 0; // inv = inversion count
    int temp[] = new int[(right - left + 1)];


    while((i < mid) && j <= right){
        if(arr[i] <= arr[j]){
            temp[k] = arr[i];
            k++;
            i++;
        }
        else{
            temp[k] = arr[j];
            invCount += (mid - i);
            k++;
            j++;
        }
    }

    while (i < mid){
        temp[k] = arr[i];
        k++;
        i++;
    }
    while(j <= right){
        temp[k] = arr[j];
        k++;
        j++;
    }

    for(i = left, k = 0; i <= right; i++, k++){
        arr[i] = temp[k];
    }
    return invCount;
}

private static int mergeSort(int arr[], int left, int right){
    int invCount = 0;


    if(right > left){
        int mid = (right + left) / 2;

        invCount = mergeSort(arr, left, mid);
        invCount += mergeSort(arr, mid+1, right);
        invCount += merge(arr,left,mid+1,right);

    }
    return invCount;
}

public static int getInversions(int arr[]){
    int n = arr.length;
    return mergeSort(arr, 0, n-1);
}


public static void main(String[] args){
int arr[] = {2,4,1,3,5};
System.out.println("inversion count = " + getInversions(arr));
}

























}
