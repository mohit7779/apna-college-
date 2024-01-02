 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Collections;
 import java.util.LinkedHashSet;
 import java.util.List;
 import java.util.*;


import javax.sql.rowset.spi.SyncResolver;

/*public class cobrakai {
    public static void printPermutation (String str,String perm,int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
             String newstr = str.substring(0,i )+ (str.substring(i+1));
             printPermutation(newstr, perm+currchar, idx+1);
        }
    }
    public static void main(String[] args){
        String str = "ABC";
        printPermutation(str, "", 0);
       
    }
    }
    */
    
//import java.util.*;
public class cobrakai{
//  public static void main(String[] args) {
//     try (Scanner sc = new Scanner(System.in)){
// //    float rad = sc.nextFloat();
// //    float area = 3.14f *rad *rad;
//         float a = 45.12f;
//         int b = (int) a;
//     System.out.println(b);

// Questions

// int x = 2, y = 5;
// int exp1 = (x * y / x);
// int exp2 = (x / y * x);
// System.out.println(exp1 + " ");
// System.out.println(exp2 +" ");


// next Questions:

// int x = 200, y = 50, z = 100;

// if(x > y && y > z){
//     System.out.println("hello");
// }
// if(z > y && z < x){
//     System.out.println("java");

// }
// if((y+200) < x && (y+150)< z){
//     System.out.println("hello java");
// }



// next Questions
// int x,y,z;
// x = y = z = 2;
// x += y;
// y -= z;
// z /= (x + y);

// System.out.println(x + " " + y + " " + z);


// next Questions

// int x = 9, y = 12;
// int a = 2, b = 4, c = 6;

// int exp = 4/3 * (x+34) + 9 * (a+b*c) + (3 + y *(2+a)) / (a+b*y);

// System.out.println(exp);



// next Question

// int x = 10,y = 5;

// int exp1 = (y * (x/y+x/y));
// int exp2 = (y*x/y+y*x/y);
// System.out.println(exp1);
// System.out.println(exp2);


// next Question


// int x = sc.nextInt();

// if(x >= 0){
//     System.out.println("positive");
// }else if(x <= 0){
//     System.out.println("negetive");
// }


// next Question:

// double temp = 103.5;

// if(temp >= 100){
//     System.out.println("you have a fever");

// }else{
//     System.out.println("you dont have fever");
// }


// next Question:

// int button = sc.nextInt();

// switch(button){
//     case 1 :
//     System.out.println("monday");
//     break;
//     case 2 :
//     System.out.println("tuesday");
//     break;
//     case 3 :
//     System.out.println("wed");
//     break;
//     case 4 :
//     System.out.println("thursday");
//     break;
//     case 5 :
//     System.out.println("friday");
//     break;
//     case 6 :
//     System.out.println("saturday");
//     break;
//     case 7 :
//     System.out.println("sunday");
//     break;
//     default:
//     System.out.println("invalid button");


// }


// next Question:

// ternary operator

// int a = 63, b = 36;

// boolean x = (a < b) ? true : false ;

// int y = (a > b) ? a : b;


// next Question (print leap year):
// System.out.println("input the year:");
// int year  = sc.nextInt();

// boolean x = (year % 4) == 0;
// boolean y = (year % 100) != 0;
// boolean z = ((year % 100 == 0) && (year % 400 == 0));

// if(x && (y || z)){
//     System.out.println(year + "is a leap year");
// }else {
//     System.out.println(year + "is not a leap year");
// }


// public   List<List<Integer>> threeSum(int numbers[]){
//     List<List<Integer>> result = new ArrayList<List<Integer>>();

//     for(int i = 0; i < numbers.length; i++){
//         for(int j = i+1; j < numbers.length; j++){
//             for(int k =i+1; k < numbers.length; k++){
                
//                 if(numbers[i]+numbers[j]+numbers[k]== 0){
//                     List<Integer> triplet = new ArrayList<Integer>();
//                     triplet.add(numbers[i]);
//                     triplet.add(numbers[j]);
//                     triplet.add(numbers[k]);
//                     Collections.sort(triplet);
//                     result.add(triplet);

//                 }
//             }
//         }
//     }

//     result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
//     return result;
// }
// public static void main(String[] args){
//     int numbers[] = {-1,0,1,2,-1,-4};
  
//     System.out.println(threeSum);

// }



// public static void swap(ArrayList<Integer>list,int idx1,int idx2){
// int temp = list.get(idx1);
// list.set(idx1,list.get(idx2));
// list.set(idx2,temp);
// }
// public static void main(String[] args){

// ArrayList<Integer>list = new ArrayList<>();


// list.add(4);
// list.add(5);
// list.add(6);
// list.add(7);
// list.add(3);
// list.add(9);
// list.add(23);
// list.add(65);
// list.add(1);


// Collections.sort(list);
// System.out.println(list);

// }


    
// static class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// static class Stack {
//     static Node head = null;

//     public static boolean isEmpty(){
//         return head == null;
//     }

// //push
// public static void push(int data){
//     Node newNode = new Node(data);


//         if(isEmpty()){
//         head = newNode;
//         return;
//     }

//     newNode.next = head;
//     head = newNode;
// }

// //pop
// public static int pop(){
//     if(isEmpty()){
//         return -1;
//     }

//     int top = head.data;
//     head = head.next;
//     return top;
// }

// // peek
// public static int peek(){
//     if(isEmpty()){
//         return -1;
//     }
//     return head.data;
// }
//     }



    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size() == 0;
    //     }

    //     //push 
    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     //pop

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size() -1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size() -1);

    //     }
    // }




    // public static void main(String[] args){
    //     // Stack s = new Stack();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     while(!s.isEmpty()){
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }




    // static int balancedPartition(String str, int n){
    //     if(n == 0){
    //         return 0;
    
    //         int r = 0 , l = 0;
    //         int ans =0;
    //         for(int i=0; i<n; i++){
    //             if(str.charAt(i) == 'R'){
    //                 r++;
    //             }
    //             else if(str.charAt(i) == 'L'){
    //                 l++;
    //             }
    //             if(r == l){
    //                 ans++;
    //             }
    //         }
           
    //     }
    //     return ans;
    // }
    // public static void main(String[] args){
    //     String str = "LLRRRLLRRL";
    //     int n = str.length();
    //     System.out.println(balancedPartition(str, n)+"\n");
    // }



    
    
    


}
//}
//}







