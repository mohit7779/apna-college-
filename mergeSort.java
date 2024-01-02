public class mergeSort {
//     public static void conquer(int arr[], int si,int mid,int ei){
//         int merged[] = new int [ei - si+1];

//         int idx1 = si;
//         int idx2 = mid+1;
//         int x = 0;

//         while(idx1 <= mid && idx2 <= ei){
//             if(arr[idx1] <= arr[idx2]){
//                 merged[x++] = arr[idx1++];
//             }else{
//                 merged[x++] = arr[idx2++];
//             }
//         }
        
//         while(idx1 <= mid){
//             merged[x++] = arr[idx1++];

//         }
//         while(idx2 <= ei){
//             merged[x++] = arr[idx2++];
//         }
//         for(int i=0, j=si; i<merged.length; i++,j++){
//             arr[j] = merged[i];
//         }

//     }
//     //step 2:
// public static void divide(int arr[], int si,int ei){
//     if(si >= ei){
//         return;
//     }
//     int mid = si + (ei - si)/2;
//     divide(arr,si,mid);
//     divide(arr,mid+1,ei);

//     conquer(arr,si,mid,ei);

// }

// // step 1:
//     public static void main(String [] args){
//         int arr[] = {6,3,9,5,2,8};
//         int n = arr.length;

//         divide(arr,0,n-1);
//         //print
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }





// ALPHA 2.0


public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void Sort(int arr[], int si,int ei){

    if(si>= ei){
        return;
    }
    //kaam
    int mid  = si + (ei - si)/2; //(si + ei)/2
    Sort(arr, si, mid);// left part
    Sort(arr, mid+1, ei);//right part
    merge(arr, si,mid, ei);
}

public static void merge(int arr[], int si, int mid, int ei){
int temp[] = new int[ei-si+1];
int i = si;
int j = mid+1;
int k = 0;


while(i <= mid && j <= ei){
    if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++; k++;
    }else{
        temp[k] = arr[j];
        j++; 
    }
    k++;
}
//left part
while(i <= mid){
    temp[k++] = arr[i++];
}
// right part
while(j <= ei){
    temp[k++] = arr[j++];
}

//copy temp to origimal arr
for(k=0,i=si; k<temp.length; k++, i++){
arr[i] = temp[k];
}
}

public static void main(String[] args){
int arr[] = {6,3,9,5,2,8};
Sort(arr, 0, arr.length-1 );
printArr(arr);

}





























 }






























