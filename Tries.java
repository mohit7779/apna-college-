public class Tries {
    



// static  class Node{
//     Node children[] = new Node[26];
//     boolean eow = false;  // eow = end of word

//      static Node(){
//         for(int i=0; i<26; i++) {
//             children[i] = null;
//         }
//     }
// }


// //insert in tries       O(L)
// public static Node root = new Node();
// public static void insert(String word){
//     Node curr = root;
//     for(int level = 0; level<word.length(); level++){
//         int idx = word.charAt(level) - 'a';
//         if(curr.children[idx] == null){
//             curr.children[idx] = new Node();
//         }
//         curr = curr.children[idx];
//     }
//     curr.eow = true;
// }


// // search in tries  O(L)

// public static boolean search(String key){
//     Node curr = root;
//     for(int level = 0; level<key.length(); level++){
//         int idx = key.charAt(level) - 'a';
//         if(curr.children[idx] == null){
//             return false;
//         }
//         curr = curr.children[idx];
//     }
//     return curr.eow == true;
// }



// public static void main(String[] args){
//     String words[] = {"the","a","there","their","any","thee"};
//     for(int i=0; i<words.length; i++){
//         insert(words[i]);
//     }
//     System.out.println(search("thee"));
//     System.out.println(search("thor"));
// }








// static  class Node{
//     Node children[] = new Node[26];
//     boolean eow = false;  // eow = end of word

//      public Node(){
//         for(int i=0; i<26; i++) {
//             children[i] = null;
//         }
//     }
// }


// //insert in tries       O(L)
// public static Node root = new Node();
// public static void insert(String word){
//     Node curr = root;
//     for(int level = 0; level<word.length(); level++){
//         int idx = word.charAt(level) - 'a';
//         if(curr.children[idx] == null){
//             curr.children[idx] = new Node();
//         }
//         curr = curr.children[idx];
//     }
//     curr.eow = true;
// }


// // search in tries  O(L)

// public static boolean search(String key){
//     Node curr = root;
//     for(int level = 0; level<key.length(); level++){
//         int idx = key.charAt(level) - 'a';
//         if(curr.children[idx] == null){
//             return false;
//         }
//         curr = curr.children[idx];
//     }
//     return curr.eow == true;
// }

// public static boolean wordBreak(String key){

//     if(key.length() == 0){
//         return true;
//     }

//     for(int i=1; i<=key.length(); i++){
//         if(search(key.substring(0,i)) && 
//         wordBreak(key.substring(i))){
//             return true;
//         }
//     }
//     return false;
// }

// public static void main(String[] args){
//     String arr[] = {"i","like","sam","samsung","mobile","ice"};

//     for(int i=0; i<arr.length; i++){
//         insert(arr[i]);
//     }

//     String key = "ilikesam";
//     System.out.println(wordBreak(key));
// }





//QS: prefix problem
//  O(L)  LONGEST WOrD
// static class Node{
//     Node[] children = new Node[26];
//     boolean eow = false;
//     int freq;

//     public Node(){
//         for(int i=0; i<children.length; i++){
//             children[i] = null;
//         }
//         freq = 1;
//     }
// }

// public static Node root = new Node();

// public static void insert(String word){
    
//     Node curr = root;
//     for(int i=0; i<word.length(); i++){
//         int idx = word.charAt(i)-'a';
//         if(curr.children[idx] == null){
//             curr.children[idx] = new Node();
//         }else{
//             curr.children[idx].freq++;
//         }

//         curr = curr.children[idx];
//     }
//     curr.eow = true;
// }

// public static void findPreFix(Node root, String ans){
//     if(root == null){
//         return;
//     }

//     if(root.freq == 1){
//         System.out.println(ans);
//         return;
//     }
//     for(int i=0; i<26; i++){
//         if(root.children[i] != null){
//             findPreFix(root.children[i], ans+(char)(i+'a'));
//         }
//     }
// }

//QS: start with problem:
// static class Node{
//     Node[] children = new Node[26];
//     boolean eow;
    

//     public Node(){
//         for(int i=0; i<26; i++){
//             children[i] = null;
//         }
//     }
// }

// public static Node root = new Node();

// public static void insert(String word){
//     int level = 0;
//     int len = word.length();
//     int idx = 0;

//     Node curr = root;
//     for(; level<len; level++){
//          idx = word.charAt(level)-'a';
//         if(curr.children[idx] == null){
//             curr.children[idx] = new Node();
//         }

//         curr = curr.children[idx];
//     }
//     curr.eow = true;
// }


// public static boolean search(String key){
//     int level = 0;
//     int len = key.length();
//     int idx = 0;

//     Node curr = root;
//     for(; level<len; level++){
//         idx = key.charAt(level)-'a';
//         if(curr.children[idx] == null){
//             return false; 
//         }
//         curr = curr.children[idx];
//     }
//     return curr.eow = true;
// }

// public static boolean startsWith(String prefix){  //O(L)
//     Node curr = root;

//     for(int i=0; i<prefix.length(); i++){
//         int idx = prefix.charAt(i)-'a';
//         if(curr.children[idx] == null){
//             return false;
//         }
//         curr = curr.children[idx];
//     }
//     return true;
// }

// public static void  main(String[] args){
//     // String arr[] = {"zebra","dog","duck","dove"};
//     // for(int i=0; i<arr.length; i++){
//     //     insert(arr[i]);
//     // }

//     // root.freq = -1;
//     // findPreFix(root, " ");


//     // start with problem:
//     String words[] = {"apple,","app","mango","man","woman"};
//     String prefix1 = "app";  // true
//     String prefix2 = "moon";// false

//     for(int i=0; i<words.length; i++){
//         insert(words[i]);
//     }

//     System.out.println(startsWith(prefix1));
//     System.out.println(startsWith(prefix2));



//QS: UNIQUE SUBSTRING'S  (MICROSOFT)
// static class Node{
//     Node[] children = new Node[26];
//     boolean eow;
    

//     public Node(){
//         for(int i=0; i<26; i++){
//             children[i] = null;
//         }
//     }
// }

// public static Node root = new Node();

// public static void insert(String word){
//     int level = 0;
//     int len = word.length();
//     int idx = 0;

//     Node curr = root;
//     for(; level<len; level++){
//          idx = word.charAt(level)-'a';
//         if(curr.children[idx] == null){
//             curr.children[idx] = new Node();
//         }

//         curr = curr.children[idx];
//     }
//     curr.eow = true;
// }


// public static boolean search(String key){
//     int level = 0;
//     int len = key.length();
//     int idx = 0;

//     Node curr = root;
//     for(; level<len; level++){
//         idx = key.charAt(level)-'a';
//         if(curr.children[idx] == null){
//             return false; 
//         }
//         curr = curr.children[idx];
//     }
//     return curr.eow = true;
// }

// public static int countNodes(Node root){
//     if(root == null){
//         return 0;
//     }

//     int count = 0;
//     for(int i=0; i<26; i++){
//         if(root.children[i] != null){
//             count += countNodes(root.children[i]);
//         }
//     }
//     return count+1;
// }

// public static void main(String[] args){
//     String str = "ababa";  //ans 10

//     //suffix -> insert in tries

//     for(int i=0; i<str.length(); i++){
//         String suffix = str.substring(i);
//         insert(suffix);
//     }
//     System.out.println(countNodes(root));


// }












// LARGEST WORD WITH ALL PREFIXE'S

static class Node{
    Node[] children = new Node[26];
    boolean eow;
    

    public Node(){
        for(int i=0; i<26; i++){
            children[i] = null;
        }
    }
}

public static Node root = new Node();

public static void insert(String word){
    int level = 0;
    int len = word.length();
    int idx = 0;

    Node curr = root;
    for(; level<len; level++){
         idx = word.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new Node();
        }

        curr = curr.children[idx];
    }
    curr.eow = true;
}


public static boolean search(String key){
    int level = 0;
    int len = key.length();
    int idx = 0;

    Node curr = root;
    for(; level<len; level++){
        idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            return false; 
        }
        curr = curr.children[idx];
    }
    return curr.eow == true;
}

public static String ans = "";
public static void longestWord(Node root, StringBuilder temp){
    if(root == null){
        return ;
    }

    for(int i=0; i<26; i++){
        if(root.children[i] != null && root.children[i].eow == true){
            char ch = (char)(i+'a');
            temp.append(ch);
            if(temp.length() > ans.length()){
                ans = temp.toString();
            }
            longestWord(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1);// bachtrack
        }
    }
}

public static void main(String[] args){
String words[] = {"a","banana","app","appl","apply","apple"};


for(int i=0; i<words.length; i++){
    insert(words[i]);
}
longestWord(root, new StringBuilder(""));
System.out.println(ans);

}
































}
