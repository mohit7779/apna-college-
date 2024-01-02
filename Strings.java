 import java.util.*;

public class Strings {
    // public static void main(String[] args){
    //      try (Scanner sc = new Scanner(System.in)){
        //  String name = sc.nextLine();
        //  System.out.println("your name is: " + name);
       // }

    //    String firstName = "mohit";
    //    String lastName = "kumar";
    //    String fullname = firstName + " " + lastName;
    //   System.out.println(fullname.length());

    //   //charAt
    //   for(int i=0; i<fullname.length(); i++){
    //     System.out.println(fullname.charAt(i));
    //   }



    //NEXT: compare the strings....

    // String name1 = sc.nextLine();
    // String name2 = sc.nextLine();
  
    // if(name1.compareTo(name2) == 0) {
    //     System.out.println("name is equal");
    // }else{
    //     System.out.println("name is not equal");
    // }
       
    // }

// String sentence = "my name is mohit";
// String name = sentence.substring( 11,sentence.length());
// System.err.println(name);


// public static void main(String[] args){
//     char arr[] = {'a', 'b', 'c', 'd', 'e'};
//     String str = "abcd";

//     //String are Immutable:
//     try (Scanner sc = new Scanner(System.in)){
//         String name;
//         name = sc.nextLine();
//         System.out.println(name);
//}
//}


//String fullName = "mohit";
//System.out.println(fullName.length());
// String firstName = "mohit";
// String lastName = "kumar";
// String fullName  = firstName + " " + lastName;
// System.out.println(fullName.charAt(2));
// }



// QS: find palindrome

// public static boolean isPalindrome(String str){
//     for(int i=0; i<str.length()/2; i++){
//         int n = str.length();
//         if(str.charAt(i) != str.charAt(n-1-i)){
//             return false;
//         }

// }
// return true;
// }
// public static void main(String[] args) {
//     String str = "racecar";
//     System.out.println(isPalindrome(str));
// }



// QS: shortestpath

// public static float getShortestPath(String path){
//     int x = 0, y = 0;

//     for(int i = 0; i < path.length(); i++){
//         char dir = path.charAt(i);

//         // south
//         if(dir == 'S'){
//             y--;
//         }
//         // north
//         else if(dir =='N'){
//             y++;
//         }
//         // west
//         else if(dir == 'W'){
//             x--;
//         }
//         // east
//         else if(dir == 'E'){
//             x++;
//         }
//     }
//     // formula
//     int X2 = x*x;
//     int Y2 = y*y;
//     return (float)Math.sqrt(X2 + Y2);
// }

// public static void main(String[] args) {
//     String path = "WNEENESENNN";
//     System.out.println(getShortestPath(path));
// }


// QS: SUBstring
// public static String subString(String str, int si, int ei){
//     String substr = "";
//     for(int i=si; i<ei; i++){
//         substr += str.charAt(i);
//     }
//     return substr;
// }
// public static void main(String[] args) {
//     String str = "helloworld";
//     System.out.println(str.substring(0,5)); //use this line instead of whole code:
//    // System.out.println(subString(str, 0, 5));
// }



//QS:  comparisons
// public static void main(String[] args) {
//     String fruits[] = {"apple", "orange", "mango", "banana"};

//     String largest = fruits[0];
//     for(int i=1; i<fruits.length; i++) {
//         if(largest.compareTo(fruits[i]) <0){    
//             largest = fruits[i];
//         }
//     }
//     System.out.println(largest);
// }


// // QS: String builders:
// public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("");
//     for(char ch='a'; ch<='z'; ch++){
//         sb.append(ch);
//     }
//     System.out.println(sb.length());
// }


// QS: for a given string convert each the first letter of eaaachh word to uppercase :


// public static String toUppercase(String str){
//     StringBuilder sb = new StringBuilder("");

//     char ch = Character.toUpperCase(str.charAt(0));
//     sb.append(ch);

//     for(int i = 1; i < str.length(); i++){
//         if(str.charAt(i) == ' ' && i < str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();


// }
// public static void main(String[] args){
//     String str = "hi my name is mohit";
//     System.out.println(toUppercase(str));
// }



// QS: string compression:


// public static String compress(String str){
//     String newStr = "";

//     for(int i=0; i<str.length(); i++){
//         Integer count = 1;

//         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//             count++;
//         }

//         newStr += str.charAt(i);
//         if(count > 1){
//             newStr += count.toString();

//         }
//     }
    
//     return newStr;
// }
// public static void main(String[] args){
//     String str = "aaaabbbccccddd";
//     System.out.println(compress(str));
// }



// qs: count how many times lower case vowels occured in a string entered by the user:


// public static void main(String[] args){
     
//         String str = new Scanner(System.in).next();
//         System.out.println(str);
//         int count = 0;
    
//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//             count++;

//         }
//     }
//     System.out.println("count of vowels is:" + count);
// }



 // QS: output of the following code:


// public static void main(String[] args){
//     String str = "mohit kumar";
//     String str1  = "apna college";
//     String str2 = "mohitkumar";
//     System.out.println(str.equals(str1) + " " + str.equals(str2));
// }


//QS: output of the following code:

// public static void main(String[] args) {
//     String str = "apna college ".replace("1","");
//     System.out.println(str);
// }



// QS: anagram question:

public static void main(String[] args) {
    String str1 = "earth";
    String str2 = "heart";
    
    // convert string to lowercase.why? so that we don't have to chek seperately for lower & upper case:

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    //first check - if the length are the same:
    if(str1.length() == str2.length()){
        // convert string into char array
        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();

        // sort the char array:
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
        // if the sorted char array are same or identical then the string are anagram:

        boolean result = Arrays.equals(str1charArray,str2charArray);
        if(result){
            System.out.println(str1 +" and " + str2 + " are anagram of each other.");
        }else{
            System.out.println(str1 +" and " + str2 + " are not anagram of each other.");
        }

    }
}









  }
// }
