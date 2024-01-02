import java.util.*;
public class stack1 {
    
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



    // public static void main(String[] args){
    //    // Stack s = new Stack();

    //    Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     while(!s.isEmpty()){
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }


// pushAtBottom


// public static void pushAtBottom(Stack<Integer> s , int data){
//     if(s.isEmpty()){
//         s.push(data);
//         return;
//     }
//     int top = s.pop();
//     pushAtBottom(s, data);
//     s.push(top);
// }

// public static void main(String[] args) {

//    Stack<Integer> s = new Stack<>();
//    s.push(1);
//    s.push(2);
//    s.push(3);

//    pushAtBottom(s, 4);
//    while(!s.isEmpty()) {
//     System.out.println(s.pop());
//    }


// }



// reverse a String


// public static String reverseString(String str){

//     Stack<Character> s = new Stack<>();
//     int idx = 0;
//     while(idx < str.length()){
//         s.push(str.charAt(idx));
//         idx++;
//     } 

//     StringBuilder result = new StringBuilder("");
//     while(!s.isEmpty()){
//         char curr = s.pop();
//         result.append(curr);
//     }
//     return result.toString();
// }

// public static void main(String[] args){

//     String str = "abc";
//     String result = reverseString(str);
//     System.out.println(result);

// }




//reverse a Stack
// public static void pushAtBottom(Stack<Integer> s , int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
// public static void reverseStack(Stack<Integer> s ){

//     if(s.isEmpty()){
//         return;
//     }
//     int top = s.pop();
//     reverseStack(s);
//     pushAtBottom(s,top);
// }
// public static void printStack(Stack<Integer>s){
//     while(!s.isEmpty()){
//         System.out.println(s.pop());
//     }
// }
// public static void main(String[] args){
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);


//     reverseStack(s);
//     printStack(s);


// }



//Stock span problem

// public static void stockSpan(int stocks[], int span[]){
// Stack<Integer> s = new Stack<>();
// span[0] = 1;
// s.push(0);

// for(int i=1; i<stocks.length; i++){
//     int currPrice = stocks[i];
//     while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//         s.pop();
//     }

//     if(s.isEmpty()){
//         span[i] = i+1;
//     }else{
//         int prevHigh = s.peek();
//         span[i] = i - prevHigh;
//     }

//     s.push(i);
// }
// }
// public static void main(String[] args) {
//     int stocks[] = {100,80,60,70,60,85,100};
//     int span[] = new int[stocks.length];
//     stockSpan(stocks, span);

//     for(int i=0; i<span.length; i++){
//         System.out.println(span[i]+" ");
//     }
    
// }



// find next greater element

// public static void main(String[] args){
//     int arr[] = {6,8,0,1,3};
//     Stack<Integer> s = new Stack<>();
//     int nextGreater[] = new int[arr.length];

//     for(int i=arr.length-1; i>=0; i--){   // agar left se nikala ho tab loop ko 0 se n tak chalana hai(int i=0; i<arr.length; i++)

//         //1 while
//         while(!s.isEmpty() && arr[s.peek()] <= arr[i]){  // find next smaller element ke liye (>=) kr denge
//             s.pop();
//         }
//         //if-else
//         if(s.isEmpty()){
//             nextGreater[i] = -1;
//         }else{
//             nextGreater[i] = arr[s.peek()];
//         }
//         //push in s
//         s.push(i);
//     }

//     for(int i=0; i<nextGreater.length; i++){
//         System.out.print(nextGreater[i]+" ");
//     }
//     System.out.println();
// }




// find pairs 

// public static boolean isValid(String str){
//     Stack<Character> s = new Stack<>();

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);

//         //openinig
//         if(ch == '{' || ch == '(' || ch == '[' ){
//             s.push(ch);
//         }else{
//             //closing
//             if(s.isEmpty()){
//                 return false;
//             }
//             if((s.peek() == '(' && ch == ')')
//             || (s.peek() == '{' && ch == '}')
//             || (s.peek() == '[' && ch == ']')){
//                 s.pop();
//             }else{
//                 return false;
//             }
//         }
       
//     }
//     if(s.isEmpty()){
//         return true;
//     }else{
//         return false;
//     }
// }
// public static void main(String[] args){
//     String str = "(){}[]";  //true
//     System.out.println(isValid(str));

// }



// find duplicate pairs


// public static boolean isDuplicate(String str){ //O(n)
//     Stack<Character> s = new Stack<>();

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);

//         //closing
//         if(ch == ')'){
//             int count = 0;
//             while(s.pop() != '('){
//                 count++;
//             }

//             if(count < 1){
//                 return true; //duplicate
//             }

//         }else{
//             //opening
//             s.push(ch);
//         }
//     }
//     return false;
// }
// public static void main(String[] args){
//     String str = "((a+b))";  // true
//     String str2 = "(a-b)"; // false
//     System.out.println(isDuplicate(str2));
// }


// histogram O(n) imp question


// public static void maxArea(int arr[]){
//     int maxArea = 0; 
//     int nsr[] = new int[arr.length];  // next smaller rihgt
//     int nsl[] = new int[arr.length]; // next smaller left


//     //next smaller right
//     Stack<Integer> s = new Stack<>();
//     for(int i=arr.length-1; i>=0; i--){
//         while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//             s.pop();
//         }
//         if(s.isEmpty()){
//             nsr[i] = arr.length;
//         }else{
//             nsr[i] = s.peek();
//         }
//         s.push(i);
//     }


//     // next smaller left
//     s = new Stack<>();
//     for(int i=0; i<arr.length; i++){
//         while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//             s.pop();
//         }
//         if(s.isEmpty()){
//             nsl[i] = -1;
//         }else{
//             nsl[i] = s.peek();
//         }
//         s.push(i);
//     }


//     // current Area : 
//     for(int i=0; i<arr.length; i++){
//         int height = arr[i];
//         int width = nsr[i] - nsl[i] -1;
//         int currArea = height * width;
//         maxArea = Math.max( currArea , maxArea);
//     }

//     System.out.println("maxArea of histogram = "+maxArea);
// }
// public static void main(String[] args) {
//     int arr[] = {2,1,5,6,2,3};  // height of histogram
//     maxArea(arr);
// } 


// Question from 



// static boolean isPalindrome(Node head){
//     Node slow = head;
//     boolean ispalin = true;
//     Stack<Integer> stack = new Stack<Integer>();


//     while(slow != null){
//         stack.push(slow.data);
//         slow = slow.ptr;
//     }

//     while(head != null){
//         int i = stack.pop();
//         if(head.data == i){
//             ispalin = true;
//         }else{
//             ispalin = false;
//             break;
//         }
//         head = head.ptr;
//     }
//     return ispalin;
// }

// class Node{
//     int data;
//     Node ptr;
//     Node(int d){
//         ptr = null;
//         data = d;
//     }
// }

// public static void main(String[] args) {
//     Node one =new Node(1);
//     Node two = new Node(2);
//     Node three = new Node(3);
//     Node four = new Node(4);
//     Node five = new Node(3);
//     Node six = new Node(2);
//     Node seven = new Node(1);

//     one.ptr = two;
//     two.ptr = three;
//     three.ptr = four;
//     four.ptr = five;
//     five.ptr = six;
//     six.ptr = seven;

//     boolean condition = isPalindrome(one);
//     System.out.println("palindrome: " + condition);
// }



// QS: trapping water:



// public static int maxWater(int height[]){
//     Stack<Integer> stack = new Stack<>();
//     int n = height.length;
//     int ans = 0;
//      for(int i=0; i<n; i++){
//         while((!stack.isEmpty()) && (height[stack.peek()] < height[i])){
//             int pop_height = height[stack.peek()];
//             stack.pop();

//             if(stack.isEmpty())
//             break;
//             int distance = i-stack.peek()-1;
//             int min_height = Math.min(height[stack.peek()], height[i])
//             -pop_height;

//             ans += distance * min_height;  
//         }
//         stack.push(i);
//      }
//      return ans;
// }
// public static void main(String[] args){
//     int arr[] = {7,0,4,2,5,0,6,4,0,5};//output 25:
//     System.out.println(maxWater(arr));
// }








}
