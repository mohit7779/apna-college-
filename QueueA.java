import java.io;
import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.Flow.Subscriber;

import javax.print.attribute.PrintJobAttribute;
import javax.swing.event.InternalFrameEvent;
public class QueueA {
    




// static class Queue{
//     static int arr[];
//     static int size;
//     static int rear;

//     Queue(int n){
//         arr = new int[n];
//         size = n;
//         rear = -1;
//     }

//     public static boolean isEmpty(){
//         return rear == -1;
//     }

   

//     // add function
//     public static void add(int data){
//         if(rear == size-1){
//             System.out.println("Queue is full");
//             return;
//         }

//         rear = rear + 1;
//         arr[rear] = data;
//     }

//     //remove
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("Queue is empty");
//             return -1;
//         }

//         int front = arr[0];
//         for(int i=0; i<rear; i++){
//             arr[i] = arr[i+1];
//         }
//         rear = rear-1;
//         return front;
//     }

//     //peek

//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("queue is empty");
//             return -1;
//         }
//         return arr[0];
//     }

// }
// public static void main(String[] args){
//     Queue q = new Queue(5);
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }
// }

// circular queue


// static class Queue{
//     static int arr[];
//     static int size;
//     static int rear;
//     static int front;

//     Queue(int n){
//         arr = new int[n];
//         size = n;
//         rear = -1;
//         front = -1;
//     }

//     public static boolean isEmpty(){
//         return rear == -1  && front == -1;
//     }

//     public static boolean isFull(){
//         return (rear+1)% size == front;
//     }

//     // add function
//     public static void add(int data){
//         if(isFull()){
//             System.out.println("Queue is full");
//             return;
//         }
//         // add 1st element
//         if(front == -1){
//             front = 0;
//         }
//         rear = (rear + 1)% size;
//         arr[rear] = data;
//     }

//     //remove
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("Queue is empty");
//             return -1;
//         }

//         int result = arr[front];
//          front = (front+1)%size;
//          //last element delete
//          if(rear == front){
//             rear = front = -1;
//          }else{
//             front = (front+1)%size;
//          }
//          return result;
       
       
//     }

//     //peek

//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("queue is empty");
//             return -1;
//         }
//         return arr[front];
//     }

// }


// public static void main(String[] args){
//     Queue q = new Queue(5);
//     q.add(1);
//     q.add(2);
//     q.add(3);
//       System.out.println(q.remove());
//     q.add(4);
//     System.out.println(q.remove());
//     q.add(5);

//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }
// }




//  queue linkedList (microsoft)



// static class Node{
//     int data;
//     QueueA.Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;

//     }
// }
// static class Queue{
//     static Node head = null;
//     static Node tail = null;

//     public static boolean isEmpty(){
//         return head == null && tail == null;
//     }

//     // add 
//     public static void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }


// // remove
// public static int remove(){
//     if(isEmpty()){
//         System.out.println("Empty queue");
//         return -1;
//     }

//     int front = head.data;
//     if(tail == head){
//         tail = head = null;
//     }else{
//         head = head.next;
//     }
//     return front;
// }


// // peek

// public static int peek(){
//     if(isEmpty()){
//         System.out.println("Empty queue");
//         return -1;
//     }
//     return head.data;
// }

// }

//  public static void main(String[] args){
//     Queue q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }

//  }



//  public static void main(String[] args){
//    // Queue q = new Queue();
//    //Queue<Integer> q = new LinkedList<>();
//    Queue<Integer> q = new ArrayDeque<Integer>();   // import java package
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }

//  }





// public class Queue{
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();

//     public  static boolean isEmpty(){
//         return s1.isEmpty();
//     }


//     //add
//     public static void add(int data){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()){
//             s1.push(s1.pop());
//         }
//     }

//     //remove
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("Empty");
//             return -1;
//         }

//         return s1.pop();
//     }

//     //peek
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("Empty");
//             return -1;
//         }

//         return s1.peek();
//     }
// }

// public static void main(String[] args){
//     Queue q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }

// }








// // first non repeating letter in a stream of character  O(n)     import java package        flipkart

// public static void printNonReapting(String str){
//     int freq[] = new int[25];
//     Queue<Character> q = new LinkedList<>();
    

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         q.add(ch);
//         freq[ch-'a']++;

//         while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
//             q.remove();
//         }

//         if(q.isEmpty()){
//             System.out.println(-1+" ");
//         }else{
//             System.out.println(q.peek()+" ");
//         }
//     }
//     System.out.println();
// }

// public static void main(String[] args){
//     String str = "aabccxb";
//     printNonReapting(str);
// }




// // interLeave two half of a queue
// public static void interLeave(Queue<Integer> q){
// Queue<Integer> firstHalf = new LinkedList<>();
// int size = q.size();

// for(int i=0; i<size/2; i++){
//     firstHalf.add(q.remove());
// }

//     while(!firstHalf.isEmpty()){
//         q.add(firstHalf.remove());
//         q.add(q.remove());
//     }
// }
// public static void main(String[] args){
//     Queue<Integer> q = new LinkedList<>();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     q.add(6);
//     q.add(7);
//     q.add(8);
//     q.add(9);
//     q.add(10);

//     interLeave(q);
//     // print q
//     while(!q.isEmpty()){
//         System.out.print(q.remove()+ " ");
//     }
//     System.out.println();
// }





// Queue reversal



// public static void reverse(Queue<Integer> q){
//     Stack<Integer> s = new Stack<>();

//     while(!q.isEmpty()){
//         s.push(q.remove());
//     }

//     while(!s.isEmpty()){
//         q.add(s.pop());
//     }
// }
// public static void main(String[] args){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reverse(q);

//         while(!q.isEmpty()){
//             System.out.print(q.remove()+" ");
//         }
//         System.out.println();

// }


// deque

// public static void main(String[] args){
//     Deque<Integer> deque = new LinkedList<>();
//     deque.addFirst(1);
//     deque.addFirst(2);
//     deque.addLast(3);
//     deque.addLast(4);
//     System.out.println(deque);
//     // deque.removeFirst();
//     deque.removeLast();
//     System.out.println(deque);


//     System.out.println("first element: " + deque.getFirst());
//     System.out.println("Last element: " + deque.getLast());
// }



// QS:


// static class stack{
//     Deque<Integer> deque = new LinkedList<>();

//     public void push(int data){
//         deque.addLast(data);
//     }

//     public int pop(){
//         return deque.removeLast();
//     }

//     public int peek(){
//         return deque.getLast();
//     }
// }


// public static void main(String[] args) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     System.out.println("peek ="+ s.peek());

//     System.out.println(s.pop());
//     System.out.println(s.pop());
//     System.out.println(s.pop());

// }




// QS:


// static class Queue{

//     Deque<Integer> deque = new LinkedList<>();

//     public void add(int data){
//         deque.addLast(data);
//     }

//     public int remove(){
//         return deque.removeLast();
//     }

//     public  int peek(){
//         return deque.getFirst();
//     }
// }
// public static void main(String[] args) {
//     Queue q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     System.out.println("peek ="+ q.peek());
//     System.out.println(q.remove());
//     System.out.println(q.remove());
//     System.out.println(q.remove());
// }


// QS: generate binary number: decimal to binary using queue    O(n)

// import java.util.Queue;
// static void generatePrintBinary(int n){
//     Queue<String> q = new LinkedList<>();
//     q.add("1");

//     while(n-- > 0){
//         String s1 = q.peek();
//         q.remove();
//         System.out.println(s1);
//         String s2 = s1;
//         q.add(s1+"0");
//         q.add(s2+"1");
//     }
// }

// public static void main(String[] args) {
//     int n = 10;
//     generatePrintBinary(n);

// }




//QS:  
//connect n rope with min cost:

// static int minCost(int arr[],int n){
//     PriorityQueue<Integer> pq = new PriorityQueue<>();

//     for(int i=0;i<n; i++){
//         pq.add(arr[i]);
//     }

//     int res = 0;
//     while(pq.size()>1){
//         int first = pq.poll();
//         int second = pq.poll();
//         res += first + second;
//         pq.add(first+second);
//     }
//     return res;
// }
// public static void main(String[] args) {
//     int len[] = {4,3,2,6};
//     int size = len.length;
//     System.out.println("total cost for connecting " + "rope is = " + minCost(len,size));
// }





//job sequencing problem


// static class job{
// char job_id;
// int deadLine;
// int profit;
//     job(char job_id,int deadLine,int profit){
//         this.deadLine = deadLine;
//         this.job_id = job_id;
//         this.profit = profit;
//     }

// }

// static void printjobScheduling(ArrayList<job> arr){
//     int n = arr.size();
//     Collections.sort(arr,(a,b)->{ return a.deadLine - b.deadLine; });
//     ArrayList<job> result = new ArrayList<>();
//     PriorityQueue<job>maxHeap = new PriorityQueue<>((a,b) -> {return b.profit - a.profit;});
//     for(int i=n-1; i>-1; i--) {
//         int slot_available;
//         if(i == 0){
//             slot_available = arr.get(i).deadLine;
//         }else{
//             slot_available = (arr.get(i-1)).deadLine;
//         }
//             while(slot_available > 0 && maxHeap.size() > 0){
//                 job job = maxHeap.remove();
//                 slot_available--;
//                 result.add(job);
//             }
//         }

//        Collections.sort(result,(a,b)->{
//         return a.deadLine-b.deadLine;
//        });

//        for(job job : result){
//         System.out.println(job.job_id+" ");
//        }
//        System.out.println();
       
//     }
// public static void main(String[] args) {
// ArrayList<job> arr = new ArrayList<>();

// arr.add(new job('a'2,100));
// arr.add(new job('b'1,19));
// arr.add(new job('c'2,27));
// arr.add(new job('d'1,25));
// arr.add(new job('e'3,15));

// System.out.println("following is maximum " +"profit sequence of job");
// printjobScheduling(arr);
// }







// reversing the first k elements of a queue:


// static class cell{
//     int x,y;
//     int dis;
//     public cell(int x,int y,int dis){
//         this.x = x;
//         this.y = y;
//         this.dis = dis;

//     }
// }
// static boolean isInside(int x,int y,int N){
//     if(x >= 1 && x <= N && y >= 1 && y <= N)
//     return true;
//     return false;
// }

// static int minStepToReachTarget(int knightPos[], int targetPos[],int N){
//     int dx[] = {-2,-1,1,2,-2,-1,1,2};
//     int dy[] = {-1,-2,-2,-1,1,2,2,1};

//     Vector<cell> q = new Vector<>();
//     q.add(new cell(knightPos[0], knightPos[1],0 ));
//     cell t;
//     int x,y;
//     boolean visit[][] = new boolean[N =1][N+1];
//     visit[knightPos[0]][knightPos[1]] = true;
//     while(!q.isEmpty()){
//         t = q.firstElement();
//         q.remove(0);
//         if(t.x == targetPos[0] && t.y == targetPos[1])
//         return t.dis;

//         for(int i=0; i<8; i++){
//             x = t.x + dx[i];
//             y = t.y + dy[i];
//             if(isInside(x, y, N) && !visit[x][y]){
//                 visit[x][y] = true;
//                 q.add(new cell(x,y,t.dis +1));
//             }
//         }
//     }
//     return Integer.MAX_VALUE;
// }

// public static void main(String[] args) {
//     int N = 30;

//     int knightPos[] = {1,1};
//     int targetPos[] = {30,30};
//     System.out.println(minStepToReachTarget(knightPos, targetPos, N));
// }



// maximum of all sub arrays of size k


// static void printMax(int arr[],int n, int k){
//      Deque<Integer> Qi = new LinkedList<Integer>();
//      int i;
//      for( i=0; i<k; ++i){
//         while(!Qi.isEmpty() && arr[i] >= arr[Qi.peek()])
//         Qi.removeLast();
//         Qi.addLast(i);
//      }

//      for(; i<n; ++i){
//         System.out.println(arr[Qi.peek()]+" ");
//         while((Qi.isEmpty()) && Qi.peek() <= i-k)
//         Qi.removeFirst();
//         while(!Qi.isEmpty() && arr[i] >= i-k)
//         Qi.removeFirst();

//         while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) 
//         Qi.removeLast();
//         Qi.addLast(i);
//      }

//      System.out.println(arr[Qi.peek()]);

// }

// public static void main(String[] args){
// int arr[] = {1,2,3,1,4,5,2,3,6};
// int k = 3;
// printMax(arr, arr.length, k);
// }

// //  7385433922


//job sequencing problem     
static class job{
   int deadLine;
   int profit;
   int id;

   public job(int i,int d,int p){
       id = i;             // constructer
       deadLine = d;           // constructer
       profit = p;             // constructer
   }
}
public static void main(String[] args) {
   int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

   ArrayList<Job> jobs = new ArrayList<>();

   
   for(int i=0; i<jobsInfo.length; i++) {
       jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
   }
       Collections.sort(jobs, (a,b) -> a.profit-b.profit);  //decending order of profit


       ArrayList<Integer> seq = new ArrayList<>();
       int time = 0;
       for(int i=0; i<jobs.size(); i++){
           Job curr = jobs.get(i);
           if(curr.deadLine > time){
               seq.add(curr.id);
               time++;
           }
       }

       //print seq

       System.out.println("max jobs ="+ seq.size());
       for(int i=0; i<seq.size(); i++){
           System.out.println(seq.get(i)+" ");
       }
       System.out.println();

}








}




}
