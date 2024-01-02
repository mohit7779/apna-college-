public class backTracking {



    //ALPHA 2.0

// public static void printPermutation(String str,String perm){

//     if(str.length() == 0){
//         System.out.println(perm);
//         return;
//     }
//     //recursion  o(n*n)
//     for(int i=0;i<str.length();i++){   
//         char currchar  = str.charAt(i);
//         String newstr = str.substring(0,i)+(str.substring(i+1));
//         printPermutation(newstr, perm+currchar);

//     }
// }
//     public static void main(String[] args){
//         String str = "ABC";
//         printPermutation(str, "");
//     } 




// QS: ARRAYS:

// public static void changeArr(int arr[], int i,int val){
// //base case:
// if(i == arr.length){
//     printArr(arr);
//     return;
// }
// //recursion
// arr[i] = val;
// changeArr(arr, i+1, val+1); //function call step
// arr[i] = arr[i]-2;   //backtracking step
// }
// public static void printArr(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
// }

// public static void main(String[] args){
//     int arr[] = new int[5];
//     changeArr(arr, 0, 1);
//     printArr(arr);
// }




//QS: find subset of string


// public static void printSubset(String str,String ans,int i){
// //base case:
// if(i == str.length()){
//     if(ans.length() == 0){

//     }else{
//         System.out.println(ans);
//     }
//     return;
// }


//     //yes choice
//     printSubset(str, ans+str.charAt(i), i+1);

//     //no choice:
//     printSubset(str, ans, i+1);
// }
//     public static void main(String[] args){
//         String str = "ABC";
//         printSubset(str, "", 0);
//     }



// QS: chess (n queens)

// public static boolean isSafe(char board[][],int row, int col){
// // vertical up
// for(int i=row-1; i>=0; i--){
//     if(board[i][col]== 'Q'){
//         return false;
//     }
// }
// // diagonal up
// for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//     if(board[i][j] == 'Q'){
//         return false;
//     }
// }

// // diagonal right up:
// for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
//     if(board[i][j] == 'Q'){
//         return false;
//     }
// }
// return true;

// }
// public static boolean nQueens(char board[][],int row){
//     // base case:
//     if(row == board.length){
//         printBoard(board);
//         count++;
//         return true;
//     }
//     // column loop:
//     for(int j=0; j<board.length; j++){
//         if(isSafe(board,row,j)){
//             board[row][j] = 'Q';
//             if(nQueens(board, row+1)){
//                 return true;
//             }
//             board[row][j] = 'x'; //backtracking step
//         }
//     }
//     return false;
// }

// public static void printBoard(char board[][]){
//     System.out.println("----- chess board-----");
//     for(int i=0; i<board.length; i++){
//         for(int j=0; j<board.length; j++){
//             System.out.print(board[i][j] + " ");
//         }
//     }
//     System.out.println();
// }
// static int count = 0;

// public static void main(String[] args){
//     int n = 4;
//     char board[][] = new char[n][n];
//     //initilize:
//     for(int i=0; i<n; i++){
//         for(int j=0; j<n; j++){
//             board[i][j] = 'x';
//         }
//     }
//     if(nQueens(board,0)){
//         System.out.println("solution is possible");
//         printBoard(board);
//     }else{
//         System.out.println("solution is not possible");
//     }
//     //System.out.println("total ways to solve n Queens = " );
// }




// QS: grid ways:


// public static int gridWays(int i,int j,int n,int m){
//     // base case
//     if(i == n-1 && j == m-1){
//         return 1;
//     }else if(i == n || j == n){
//         return 0;
//     }

//     int w1 = gridWays(i+1,j,n,m);
//     int w2 = gridWays(i,j+1,n,m);
//     return w1 + w2;
// }

// public static void main(String[] args){
//     int n = 4, m = 4 ;
//     System.out.println(gridWays(0, 0, n, m));
// }




///QS: rat maze 

// public static void printSolution(int sol[][]){
//     for(int i=0; i<sol.length; i++){
//         for(int j=0; j<sol.length; j++){
//             System.out.print(" "+sol[i][j]+" ");
//         }
//         System.out.println();
//     }
// }

// public static boolean isSafe(int maze[][],int x,int y){

//     // if (x,y outside maze) return false
//     return (x >= 0 && x < maze.length
//     && y >= 0 && y < maze.length && maze[x][y] == 1);
// }

// public static boolean solveMaze(int maze[][]){
//     int N = maze.length;
//     int sol[][] = new int[N][N];
//     if(solveMazeUtil(maze,0,0,sol) == false){
//         System.out.print("solution does not exist");
//         return false;
//     }
//     printSolution(sol);
//     return true;
// }


// public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
//     //base case
//     if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1){
//         return true;
//     }

// // check if maze [x] [y] is valid:
// if(isSafe(maze,x,y) == true){
//     if(sol[x][y] == 1)
//         return false;
//         sol[x][y] = 1;
//         if(solveMazeUtil(maze, x+1, y, sol))
//         return true;
//         if(solveMazeUtil(maze, x, y+1, sol))
//         return true;
//         sol[x][y] = 0;
//         return false;
//     }
    

// return false;

// }

// public static void main(String[] args){
//     int maze[][] = {{1,0,0,0},
//                     {1,1,0,1},
//                     {0,1,0,0},
//                     {1,1,1,1}};
//                     solveMaze(maze);
// }













// QS: suduku solver:



// public static boolean isSafe(int suduku[][],int row,int col,int digit){
//     //colnm
//     for(int i=0; i<=8; i++){
//         if(suduku[i][col] == digit){
//             return false;
//         }
//     }

//     //row:
//     for(int j=0; j<=8; j++){
//         if(suduku[row][col] == digit){
//             return false;
//         }
//     }
//     // grid:
//     int sr = (row/3)*3;
//     int sc = (col/3)*3;

//     for(int i=sr; i<sr+3; i++){
//         for(int j=sc; j<sc+3; j++){
//             if(suduku[i][j] == digit){
//                 return false;
//             }
//         }
//     }
//     return true;
// }

// public static boolean sudukuSolver(int suduku[][],int row,int col){
//     // base case:
//     if(row == 9){
//         return true;
    
//     }


//     // recursion:
//     int nextRow = row, nextCol = col+1;
//     if(col+1 == 9){
//         nextRow = row+1;
//         nextCol = 0;
//     }


//     //1st step:
//     if(suduku[row][col] != 0){
//         return sudukuSolver(suduku, nextRow, nextCol);
//     }
//     for(int digit=1; digit<=9; digit++){
//         if(isSafe(suduku,row,col,digit)){
//             suduku[row][col] = digit;
//            if(sudukuSolver(suduku, nextRow, nextCol)){ // solution exists
//             return true;
//            }
//            suduku[row][col] = 0;
//         }
//     }

// return false;
// }

// public static void printSuduku(int suduku[][]){
//     for(int i=0; i<8; i++){
//         for(int j=0; j<8; j++){
//             System.out.print(suduku[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args){
//     int suduku[][] = {{0,0,8,0,0,0,0,0,0},
//                      {4,9,0,1,5,7,0,0,2},
//                      {0,0,3,0,0,4,1,9,0},
//                      {1,8,5,0,6,0,0,2,0},
//                      {0,0,0,0,2,0,0,6,0},
//                      {9,6,0,4,0,5,3,0,0},
//                      {0,3,0,0,7,2,0,0,4},
//                      {0,4,9,0,3,0,0,5,7},
//                      {8,2,7,0,0,9,0,1,3}};   
                        
                    
//                      if(sudukuSolver(suduku, 0, 0)){
//                         System.out.println("solution exists");
//                        printSuduku(suduku);
//                      }else{
//                         System.out.println("solution does not exist");
//                      }
// }




// QS: keypad combination

// final static char[][]  L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}
//                                 ,{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};


//                                 public static void letterCombination(String D){
//                                     int len = D.length();
//                                     if(len == 0){
//                                         System.out.println("");
//                                         return;
//                                     }
                                    
//                                     bfs(0,len,new StringBuilder(),D);
//                                     }
                                    
//                                     public static void bfs(int pos,int len,StringBuilder sb,String D){
                                    
//                                     if(pos == len){
//                                         System.out.println(sb.toString());
//                                     }
//                                     else{
//                                     char[] letters = L[Character.getNumericValue(D.charAt(pos))];
//                                     for(int i=0; i<letters.length; i++){
//                                         bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
//                                     }
//                                     }
//                                     }
                                    
// public static void main(String[] args) {
//     letterCombination("3");
// }                                    




















}
