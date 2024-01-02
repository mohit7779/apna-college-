import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;

import javax.lang.model.type.IntersectionType;
import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;

public class hasshMap {
    


    // public static void main(String[] args){
    // HashMap<String,Integer> hm = new HashMap<String,Integer>();
    // hm.put("india",100);
    // hm.put("china",150);
    // hm.put("russia",300);

    // System.out.println(hm);

    // get - 0(1)
    // int population = hm.get("india");
    // System.out.println(population);

    // //..containKey - o(1)
    // System.out.println(hm.containsKey("india"));// true
    // System.out.println(hm.containsKey("usa"));//false

    // remove operation 0(1)
    // System.out.println(hm.remove("india"));
    // System.out.println(hm);

    //isEmpty
    // System.out.println(hm.isEmpty());//false q ki khali nahi ha
// }


// public static void main(String[] args) {
//     HashMap<String,Integer> hm = new HashMap<>();
//     hm.put("india", 100);
//     hm.put("china",150);
//     hm.put("russia",300);
//     // hm.put("Indonesia"5);
//     // hm.put("nepal"90);

//     ///Iterate

//     Set<String> keys =  hm.keySet();
//     System.out.println(keys);

//     for(String k : keys){
//         System.out.println("key=" +k+ ",value="+hm.get(k));
//     }

// }





//QS:



// public class HashMapCode{
//     static class HashMap<K,V>{   // type generic
//         public class Node{
//             K key;
//             V value;

//             public Node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n;  //n
//         private int N;
//         private LinkedList<Node> buckets[]; // N


//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//             private int  hashFunction(K key){
//                 int hc = key.hashCode();
//                 return Math.abs(hc) % N; //N
//             }

//             private int SearchInLL(K key, int bi){
//                 LinkedList<Node> ll = buckets[bi];
//                 int di = 0;

//                 for(int i=0; i<ll.size(); i++){
//                     Node node = ll.get(i);
//                     if(node.key == key){
//                         return di;
//                     }
//                     di++;
//                 }
//                 return -1;
//             }

//             @SuppressWarnings("unchecked")
//             private void rehash(){
//                 LinkedList<Node> oldBuck[] = buckets;
//                 buckets = new LinkedList[N*2];
//                 N = 2*N;

//                 for(int i=0; i< buckets.length; i++){
//                     buckets[i] = new LinkedList<>();
//                 }

//                 // nodes -> AD in bucket
//                 for(int i=0; i< oldBuck.length; i++){
//                     LinkedList<Node> ll = oldBuck[i];
//                     for(int j=0; j< ll.size(); j++){
//                         Node node = ll.remove();
//                         put(node.key, node.value);
//                     }
//                 }
//             }

//             public void put(K key, V value){
//                 int bi = hashFunction(key);
//                 int di = SearchInLL(key,bi);

//                 if(di != -1){
//                     Node node = buckets[bi].get(di);
//                     node.value = value;
//                 }else{
//                     buckets[bi].add(new Node(key, value));
//                     n++;
//                 }

//                 double lambda = n/N;
//                 if(lambda > 2.0){
//                     rehash();

//                 }
//             }

//             public boolean contains(K key){
//                 int bi = hashFunction(key);
//                 int di = SearchInLL(key,bi);

//                 if(di != -1){
//                     return true;
//                 }else{
//                     return false;
//                 }

//             }

//             public V remove(K key){
//                 int bi = hashFunction(key);
//                 int di = SearchInLL(key,bi);

//                 if(di != -1){
//                     Node node = buckets[bi].remove(di);
//                     n--;
//                     return node.value;
//                 }else{
//                     return null;
//                 }
//             }

//             public V get(K key){
//                 int bi = hashFunction(key);
//                 int di = SearchInLL(key,bi);

//                 if(di != -1){
//                     Node node = buckets[bi].get(di);
//                     return node.value;
//                 }else{
//                     return null;
//                 }

//             }
//             public ArrayList<K> keySet(){
//                 ArrayList<K> keys = new ArrayList<>();

//                 for(int i=0; i<buckets.length; i++){
//                     LinkedList<Node> ll = buckets[i];
//                     for(Node node : ll){
//                         keys.add(node.key);
//                     }
//                 }
//                 return keys;
//             }

//             public boolean isEmpty(){
//                 return n == 0;
//             }
            
//         }
    
//     }
//     public static void main(String[] args) {
//     HashMap<String, Integer> hm = new HashMap<>();
//     hm.put("india", 100);
//     hm.put("china", 150);
//     hm.put("US", 50);
//     hm.put("nepal", 5);
//     Set<String> keys = hm.keySet();
//     for(String key : keys) {
//         System.out.println(key);
//     }

//     System.out.println(hm.get("india"));
//     System.out.println(hm.remove("india"));
//     System.out.println(hm.get("india"));

// }




//QS: LinkedHASHmaP

// public static void  main(String[] args) {
//     LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//     lhm.put("india", 100);
//     lhm.put("china", 150);
//     lhm.put("us", 50);

//     HashMap<String,Integer> hm = new HashMap<>();
//     lhm.put("india", 100);
//     lhm.put("china", 150);
//     lhm.put("us", 50);

//     System.out.println(hm);
//     System.out.println(lhm);

// }


//QS: treeemap

// public static void  main(String[] args) {
//     TreeMap<String,Integer> tm = new TreeMap<>();
//     tm.put("india", 100);
//     tm.put("china", 150);
//     tm.put("us", 50);
//     tm.put("shrilanka", 90);

//     HashMap<String,Integer> hm = new HashMap<>();
//     hm.put("india", 100);
//     hm.put("china", 150);
//     hm.put("us", 50);

//     System.out.println(hm);
//     System.out.println(tm);

// }




// //QS: majority elements   O(n)

// public static void main(String[] args){
//     int arr[] = {1,3,2,5,1,3,1,5,1};
//     HashMap<Integer,Integer> map  = new HashMap<>();

//     for(int i=0; i<arr.length; i++){

//         map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//     }
//     for(Integer key : map.keySet()){
//         if(map.get(key) > arr.length/3){
//             System.out.println(key);
//         }
//     }
// }




// //QS: ANAGARAM
// public static boolean isAnagaram(String s, String t){
//     HashMap<Character,Integer> map = new HashMap<Character,Integer>();

//     if(s.length() != t.length()){
//         return false;
//     }

//     for(int i=0; i<s.length(); i++){
//         char ch = s.charAt(i);
//         map.put(ch, map.getOrDefault(s.charAt(i), 0)+1);
//     }

//     for(int i=0; i<t.length(); i++){
//         char ch = t.charAt(i);
//         if(map.get(ch) != null){
//             if(map.get(ch) == 1){
//                 map.remove(ch);
//             }else{
//                 map.put(ch, map.get(ch)-1);
//             }
//         }else{
//             return false;
//         }
//     }

//     return map.isEmpty();
// }
// public static void main(String[] args){
//     String s = "race"; //O(n)
//     String t = "care";

//     System.out.println(isAnagaram(s, t));
// }





//QS:     hashset

// public static void main(String[] args) {
//     HashSet<Integer> set = new HashSet<Integer>();

//     set.add(1);
//     set.add(2);
//     set.add(3); 
//     set.add(2);
//     set.add(1);

//     System.out.println(set);
//     set.clear();
//     System.out.println(set.size());
//     System.out.println(set.isEmpty());
        
        // if(set.contains(2)){
        //     System.out.println("set contains 2");
        // }
        // if(set.contains(3)){
        //     System.out.println("set contains 3");
        // }
// }




//QS:  Iterator:

// public static void main(String[] args) {
//     HashSet<String> cities = new HashSet<String>();
//     cities.add("delhi");
//     cities.add("mumbai");
//     cities.add("noida");
//     cities.add("nepal");

//     // Iterator it = cities.iterator();
//     // while(it.hasNext()) {
//     //     System.out.println(it.next());
//     // }

//     //or

//     for(String city : cities){
//         System.out.println(city);
//     }
// }




//QS: linked hashset

// public static void main(String[] args) {
//     HashSet<String> cities = new HashSet<String>();
//     cities.add("delhi");
//     cities.add("mumbai");
//     cities.add("noida");
//     cities.add("nepal");
//     System.out.println(cities);


//     //  LINKED HASHset

//     LinkedHashSet<String> lhs = new LinkedHashSet<>();
//     lhs.add("delhi");
//     lhs.add("mumbai");
//     lhs.add("noida");
//     lhs.add("nepal");

//     System.out.println(lhs);   // SEQUENCE ME PRINT HOGA JAISA KI HA

//     //tree set

//     TreeSet<String> ts = new TreeSet<String>();
//     ts.add("delhi");
//     ts.add("mumbai");
//     ts.add("noida");
//     ts.add("nepal");

//     System.out.println(ts);    //ASCENDING ORDER
// }



//qs:  count distinct elements

// public static void main(String[] args){
//     int num[] = {4,3,2,5,6,7,4,3,2,1};
//     HashSet<Integer> set = new HashSet<Integer>();

//     for(int i=0; i<num.length; i++){
//         set.add(num[i]);
//     }
//     System.out.println("ans =" + set.size());

// }




// //QS: union and intersection
// public static void main(String[] args){

//     int arr1[] = {7,3,9};
//     int arr2[] = {6,3,9,2,9,4};
//     HashSet<Integer> set = new HashSet<Integer>();


//     // union
//     for(int i=0; i<arr1.length; i++){
//         set.add(arr1[i]);
//     }

//     for(int i=0; i<arr2.length; i++){
//         set.add(arr2[i]);
//     }

//     System.out.println("union =" + set.size());

//     //..Intersection
//     set.clear();
//     for(int i=0; i<arr1.length; i++){
//         set.add(arr1[i]);
//     }

//     int count = 0;
//     for(int i=0; i<arr2.length; i++){
//         if(set.contains(arr2[i])){
//             count++;
//             set.remove(arr2[i]);
//         }
//     }
//     System.out.println("intersection = " +count);


// }






//largest Subarray  with sum 0  O(n)

// public static void main(String[] args){
//     int arr[] = {15,-2,2,-8,1,7,10,23};

//     HashMap<Integer, Integer> map = new HashMap<>();
//     //(sum, idx)

//     int sum = 0;
//     int len = 0;

//     for(int j=0; j<arr.length; j++){
//         sum += arr[j];
//         if(map.containsKey(sum)){
//             len = Math.max(len, j-map.get(sum));
//         }else{
//             map.put(sum,j);
//         }
//     }

//     System.out.println("largest subarrays with sum as 0 =>"+ len);
// }


// QS: Subarrays sum equal to k  O(n)

// public static void main(String[] args){
//     int arr[] = {10,2,-2,-20,10};
//     int k = -10;

//     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

//     //(sum,count)
//     map.put(0, 1);

//     int sum = 0;
//     int ans = 0;

//     for(int j=0; j<arr.length; j++){
//         sum += arr[j];
//         if(map.containsKey(sum-k)){
//         ans += map.get(sum-k);
//     }
//     map.put(sum, map.getOrDefault(sum, 0)+1);
// }

// System.out.println(ans);

// }





//QS form homework: 


// static class Node{
//     int data;
//     int hd;
//     Node left,right;

//     public Node(int key){
//         this.data = key;
//         this.hd = Integer.MAX_VALUE;
//         this.left = this.right = null;
//     }
// }

// public static void bottomViewHelper(Node root, int curr, int hd, TreeMap<Integer,int[]> m){
//     if(root == null)
//         return ;

//         // if Node for a particular hd is not present, add to the map.

//         if(!m.containsKey(hd)){
//             m.put(hd, new int[]{ root.data, curr});
//         }

//         //compare height for already
//         // present node at similar horizontal
//         //distance

//         else{
//             int[] p = m.get(hd);
//             if(p[1] <= curr){
//                 p[1] = curr;

//                 p[0] = root.data;

//             }

        
//         m.put(hd,p);

//     }

//     // call for left subtree
//     bottomViewHelper(root.left, curr+1, hd-1, m);
//     //call for right subtree
//     bottomViewHelper(root.right, curr+1, hd+1, m);
// }

// public static void printBottmView(Node root){
//     // map to store horizontal distance, height and data
//     TreeMap<Integer,int[]> m = new TreeMap<>();

//     bottomViewHelper(root, 0, 0, m);

//     // print the values started by printBottmView()
//     for(int val[] : m.values()){
//         System.out.println(val[0] + " ");
//     }
// }

// public static void main(String[] args) {
//     Node root = new Node(20);
//     root.left = new Node(8);
//     root.right = new Node(22);
//     root.left.right = new Node(5);
//     root.left.left = new Node(3);
//     // root.right.left = new Node(4);
//     root.right.right = new Node(25);
//     root.left.right.left = new Node(10);
//     root.left.right.right = new Node(14);

//     System.out.print("bottom view of current binary tree");
//     printBottmView(root);




// QS: frequency sort

// public String frequencySort(String s ){
//     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//     for(int i=0;i<s.length();i++){
//         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

//         PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue() == b.getValue() ?
//         a.getKey() -b.getKey(): b.getValue()-a.getValue() );

//         for(Map.Entry<Character,Integer>e:map.entrySet()) pq.add(e);

//         StringBuilder res = new StringBuilder();
//         while(pq.size() != 0){
//             char ch = pq.poll() .getKey();
//             int val = map.get(ch);

//             while(val != 0){
//                 res.append(ch);
//                 val--;
//             }
//         }

//         return res.toString();
//     }
// }

// public static void main(String[] args){
//     String str = "cccaaa";
//     frequencySort(str);
// }
































}
























