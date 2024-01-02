//import java.util.*;
public class TwoDArrays {
    // public static void main(String[] args){
    // try (Scanner sc = new Scanner(System.in)){
    // int rows = sc.nextInt();
    // int cols = sc.nextInt();

    // int [][] numbers = new int[rows][cols];

    // for(int i=0; i<rows; i++){
    //     for(int j=0; j<cols; j++){
    //         numbers [i][j] = sc.nextInt();
    //     }
    //   }
    //   for(int i=0; i<rows; i++){
    //     for(int j=0; j<cols; j++){
    //         System.out.print(numbers[i][j]+" ");
    //     }
    //     System.out.println();
     
    // }





// to find x:
// int x = sc.nextInt();

// for(int i=0; i<rows; i++){
//     for(int j=0; j<cols; j++){
//         if(numbers[i][j] == x){
//             System.out.print("x found at location("+ i +","+ j +")");
//         }
//     }
// }


//another question starts from homework problem..
// int n = sc.nextInt();
// int m = sc.nextInt();

// int matrix[][] = new int[n][m];

// for(int i=0; i<n; i++){
//     for(int j=0; j<m; j++){
//          matrix[i][j] = sc.nextInt(); 
//     }
// }
// System.out.println("the transpose is:");

// //to print transpose:

// for(int j=0; j<m; j++){
//     for(int i=0; i<n; i++){
//      System.out.print(matrix[i][j]+" ");
//     }
//     System.out.println();
// }



// ALPHA 2 STARTS HERE: 2D array
 
//PRINT MATRICES AND FIND ELEMENT:

// public static void main(String[] args) {
// int matrix[][] = new int[3][3];
// int n = matrix.length, m = matrix[0].length;

// try(Scanner sc = new Scanner(System.in)){
//     for(int i=0; i<n; i++){
//         for(int j=0; j<m; j++){
//             matrix[i][j] = sc.nextInt();
//         }
//     }

//     //output:
//     for(int i=0; i<n; i++){
//         for(int j=0; j<m; j++){
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
// }



// to find element in matrix

// public static boolean search(int matrix[][], int key){
//     for(int i=0; i<matrix.length; i++){
//         for(int j=0; j<matrix[0].length; j++){
//            if(matrix[i][j]==key){
//             System.out.println("found at index ("+ i +","+j+")");
//             return true;
//            }
//         }
       
//     }
//     System.out.println("key not found");
//     return false;
// }

// public static void main(String[] args) {
//     int matrix[][] = new int[3][3];
//     int n = matrix.length, m = matrix.length;
    
//     try(Scanner sc = new Scanner(System.in)){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
    
//         //output:
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 9);
//     }
//     }
    



// QS: spiral matrix:


// public static void printSpiral(int matrix[][]){
//     int startRow = 0;
//     int startCol = 0;
//     int endRow = matrix.length-1;
//     int endCol = matrix[0].length-1;
    
//     while(startRow <= endRow && startCol <= endCol){
//         // top:
//         for(int j=startCol; j<=endCol; j++){
//             System.out.print(matrix[startRow][j]+" ");
//         }
//         // right:
//         for(int i=startRow+1; i<=endRow; i++){
//             System.out.print(matrix[i][endCol]+" ");
//         }
//         // bottom:
//         for(int j=endCol-1; j>=startCol; j--){
//             System.out.print(matrix[endRow][j]+" ");
//         }

//         // left:
//         for(int i=endRow-1; i>=startRow+1; i--){
//             System.out.print(matrix[i][startCol]+" ");
//         }

//         startCol++;
//         startRow++;
//         endCol--;
//         endRow--;

//     }
//     System.out.println();
// }
// public static void main(String[] args){
    // int matrix[][] = {{1,2,3,4},
    //                 {5,6,7,8},
    //                 {9,10,11,12},
    //                 {13,14,15,16}};
//                     printSpiral(matrix);
// }






// QS: diagonal sum of spiral matrix: //O(n^2)

// public static int diagonalSum(int matrix[][]){
//     int sum = 0;

    // for(int i = 0; i < matrix.length; i++){
    //     for(int j = 0; j < matrix[0].length; j++){
    //         if(i == j){
    //             sum += matrix[i][j];
    //         }
    //         else if(i+j == matrix.length-1){
    //             sum += matrix[i][j];
    //         }
    //     }
    // }
    // return sum;

//         // second method:
//     for(int i=0; i<matrix.length; i++) {  // 0(n)
//         // primary diagolnal:
//         sum += matrix[i][i];
//         // secondary diagoln
//         if(i != matrix.length-i-1)
//         sum += matrix[i][matrix.length-i-1];
//     }
//     return sum;
// }
//  public static void main(String[] args){
//     int matrix[][] = {{1,2,3,4},
//                      {5,6,7,8},
//                      {9,10,11,12},
//                      {13,14,15,16}};
//                     System.out.println( diagonalSum(matrix));
//  }



// QS: sorted matrix: (stair case search):
// public static boolean stairCaseSearch(int matrix[][],int key){
//     int row = 0, col = matrix[0].length-1;

//     while(row < matrix.length && col >= 0){
//         if(matrix[row][col] == key){
//             System.out.println("found key  at("+ row +","+ col +")");
//             return true;
//         }
//         else if(key < matrix[row][col]){
//             col--;
//         }else{
//             row++;
//         }

//     }
//     System.out.println("key not found");
//     return false;

// }
// public static void main(String[] args){
//     int matrix[][] = {{10,20,30,40},
//                      {15,25,35,45},
//                      {27,29,37,48},
//                      {32,33,39,50}};
//                      int key = 33;
//                      stairCaseSearch(matrix, key);
// }

// QS: print the numbers of 7's that are in the 2D array:

// public static void main(String[] args){
//     int arr[][] = {{4,7,8}, {8,8,7}};

//     int countOf7 = 0;
//     for(int i=0; i<arr.length; i++){
//         for(int j=0; j<arr[0].length; j++){
//             if(arr[i][j] == 7){
//                 countOf7++;
//             }
//         }
//     }
//     System.out.println("countOf7 = " + countOf7);
// }

// QS: print out the sum of the numbers in the second row of the 'nums' array:

// public static void main(String[] args){
//     int numbers[][] = {{1,4,9},{11,4,3},{2,2,3}};
//     int sum = 0;

//     // sum of second row element:
//     for(int j=0; j<numbers[0].length; j++){
//         sum += numbers[1][j]; // if we write 2 or 0 in the place of 1. we will get the sum of the first or third row element
//     }
//     System.out.println("sum is " + sum);
// }


// QS: write the program to find transpose of matrx:
public static void main(String[] args){
    int row = 2, col = 3;
    int matrix[][] = {{2,3,7},{5,6,7}};

    // display original matrix:
    printMatrix(matrix);

    // transpose the matrix:
    int transpose[][] = new int [col][row];
    for(int i=0; i<row; i++) {
        for(int j=0; j<col; j++){
            transpose[j][i] = matrix[i][j];
        }
    }
    //print the transpose matrix:
    printMatrix(transpose);
}

public static void printMatrix(int matrix[][]){
System.out.println("the matrix is:");
for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}
}



    }
    //}
//}
