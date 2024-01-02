//import java.util.HashSet;   
public class Recursion2 {

    //Qs:--towerOfHanoi

    // public static void towerOfHanoi(int n, String src, String helper, String dest){
    //     if(n == 1){
    //         System.out.println("transfer disk" + n + "from" +src+ " to" + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1,src,dest,helper);
    //     System.out.println("transfer disk"+ n + "from" +src+ " to" + dest);
    //     towerOfHanoi(n-1,helper,src,dest); 
    // }
    // public static void main(String[] args){
    //     int n = 3;
    //     towerOfHanoi(n, "S","H", "D");
    // }



//Qs:---print a string in reverse:

// public static void printRev(String str,int idx){
//     if(idx == 0){
//         System.out.println(str.charAt(idx));
//         return;
//     }
//     System.out.print(str.charAt(idx));
//     printRev(str, idx-1);
// }

// public static void main(String[] args){

//     String str = "abcd";
//     printRev(str, str.length()-1);

// }



//Qs:-- findOccurance at positions 1st and last:

// public static int first = -1;
// public static int last = -1;
// public static void findOccurance(String str,int idx,char element){
//     if(idx == str.length()){
//         System.out.println(first);
//         System.out.println(last);
//         return;
//     }
//     char currchar = str.charAt(idx);
//     if(currchar == element){
//         if(first == -1){
//             first = idx;
//         }else{
//             last = idx ;
//         }
//     }
//     findOccurance(str, idx+1, element);
// }
// public static void main(String[] args){
//     String str = "abaacdaefaah";
//     findOccurance(str, 0, 'a');

// }



// public static boolean isSorted(int arr[], int idx){
//     if(idx == arr.length-1) {
//         return true;
//     }
//     if(arr[idx] < arr[idx+1]){
//         return isSorted(arr, idx+1);
//     }else{
//         return false;
//     } 
// }

// public static void main(String[] args){
//     int arr[] = {1,2,3,4,5,6,};
//     System.out.println(isSorted(arr, 0));

// }



//Qs----move all "x":

// public static void moveAllx(String str, int idx,int count,String newString){
//     if(idx == str.length()){
//         for(int i=0; i<count; i++){
//             newString += 'x'; 
//         }
//         System.out.println(newString);
//         return;
//     }
//    char currChar = str.charAt(idx);
//    if(currChar == 'x'){
//     count++;
//     moveAllx(str, idx+1, count, newString);
//    }else{
//     newString += currChar;
//     moveAllx(str, idx+1, count, newString);
//    }
// }
// public static void main(String[] args){
//     String str = "axbcxxd";
//     moveAllx(str,0 ,0 , "");

// }



//Qs:-- remove duplicates in a string:
// public static  boolean[] map = new boolean[26];
// public static void removeDuplicates(String str,int idx,String newString){
//     if(idx == str.length()){
//         System.out.println(newString);
//         return;
//     }
//     char currChar = str.charAt(idx);
//     if(map[currChar - 'a']){
//         removeDuplicates(str, idx+1, newString);
//     }else{
//         newString += currChar;
//         map[currChar - 'a'] = true;
//         removeDuplicates(str, idx+1, newString);

//     }
// }

// public static void main(String[] args){
//     String str = "abbccda";
//     removeDuplicates(str, 0, "");

// } 



// Qs:--PRINT ALL THE SUBSEQUENCES OOF A STRING:(IMPORTANT Qs)


public static void subsequences(String str,int idx,String newString){
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);

    //to be:
    subsequences(str, idx+1, newString+currChar);


    // or not to be:
    subsequences(str, idx+1, newString);

}
public static void main(String[] args){
    String str = "abc ";
    subsequences(str, 0, "");

}



//Qs:-- print all the unique subsequences of a string:

// public static void subsequences(String str,int idx,String newString,HashSet<String>){
//     if(idx == str.length()){
//        if(set.contains(newString)){ 
//         return;
//        }else{
//         System.out.println(newString);
//         set.add(newString);
//         return;
//        }
//     }
//     char currChar = str.charAt(idx);

//     //to be:
//     subsequences(str, idx+1, newString+currChar,set);


//     // or not to be:
//     subsequences(str, idx+1, newString,set);

// }
// public static void main(String[] args){
//     String str = "abc";
//     HashSet<String> set = new HashSet<>();
//     subsequences(str, 0, "");

// }



//Qs:-- print keypad combinations:


//private static final char[] Combination = null;
// public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};


// public  static void printComb(String str, int idx, String combination){
//     if(idx == str.length()){
//      System.out.println(combination);
//      return;
//     }

//     char currchar = str.charAt(idx);

//     String mappping = keypad[currchar - '0'];

//     for(int i=0; i<mappping.length(); i++){
       
     
//         printComb(str, idx+1, combination+mappping.charAt(i));
//     }
// }

// public static void main(String[] args){
//     String str = "99";
//     printComb(str,0,"");

// }



}
