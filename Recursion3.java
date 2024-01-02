import java.util.*;

//import java.util.*;
public class Recursion3 {
    
// Qs---:  print all permutations of a String...

// public static void printPerm(String str,String permutations){
// if(str.length() == 0){
//     System.out.println(permutations);
//     return;
// }


// for(int i=0; i<str.length();i++){
//     char currChar = str.charAt(i);
//     String newstr = str.substring(0,i)+str.substring(i+1);
//     printPerm(newstr,permutations+currChar);
// }
// }
// public static void main(String[] args) {
//     String str = "abc";
//     printPerm(str,"");

// }


//Qs:---> COUNT TOTAL PATH IN A MAZE TO MOVE FROM (0,0) TO(N,M):

// public static int countPaths(int i,int j, int n,int m){
//     if(i == n || j == m) {
//         return 0;
//     }
//       if(i == n-1 && j == n-1){
//         return 1;
//       }
//     // move downwards
//     int downpaths = countPaths(i+1,j,n,m);

//     // move right
//     int rightpath = countPaths(i,j+1,n,m);

//     return downpaths + rightpath;
// }
// public static void main(String[] args) {
//     int n = 3, m = 3;
//      int totalpaths = countPaths(0,0,n,m);
//      System.out.println(totalpaths);

// }


//  Qs---: PLACE TILE OF A SIZE 1xM IN A FLOOR OF A FLOOR OF A size 1xM IN A FLOOR OF A size nxm..:


// public static int plceTiles(int n,int m){
//   if(n == m){
//     return 2;
//   }
//   if(n < m){
//     return 1;
//   }

//   // vertically
//   int vertplacements = plceTiles(n-m, m);
  
//   // horizontally
//   int horplacements = plceTiles(n-1, m);

//   return vertplacements + horplacements;
// }
// public static void main(String[] args){
// int n = 4;int m = 2;
// System.out.println(plceTiles(n , m));
// }





//  Qs---: fo\ind the number of ways in which you  can invite n people to your party,single or in pairs..

// public static int callGuest(int n){
//   if(n <= 1){
//     return 1;
//   }


//   //single
//   int ways1 = callGuest(n-1);

//   //pair
//   int ways2 = (n-1) *callGuest(n-2);

//   return ways1 + ways2;

// }
// public static void main(String[] args){
//   int n = 4;
//   System.out.println(callGuest(n));

// }

//  Qs---:  print all the subset of a set of first n natural numbers ---

public static void printSubset(ArrayList<Integer> subset){
for(int i=0; i<subset.size(); i++){
  System.out.print(subset.get(i)+" ");

}
System.out.println();
}

public static void findSubset(int n, ArrayList<Integer> subset) {
  if(n == 0){
    printSubset(subset);
    return;
  }

  // add hoga
  subset.add(n);
  findSubset(n-1, subset);

  // add nhi hoga
  subset.remove(subset.size()-1);
findSubset(n-1, subset);
}


public static void main(String[] args){
  int n = 3;
  ArrayList<  Integer> subset = new ArrayList<>();
  findSubset(n, subset);

}








}
