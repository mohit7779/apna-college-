import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList.*;

public class binaryTree2 {

// static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }

// //approach 1 for calculating diameter 
// public static int height(Node root){
//     if(root == null){
//         return 0;
//     }

//     int lh = height(root.left);
//     int rh = height(root.right);
//     return Math.max(lh, rh ) +1;
// }

// // calculate diameter  O
// public static int diameter(Node root){
//     if(root == null){
//         return 0;
//     }

//     int leftDia = diameter(root.left);
//     int leftHeight = height(root.left);
//     int rightDia = diameter(root.right);
//     int rightHeight = height(root.right);

//     int selfDia = leftHeight + rightHeight + 1;

//     return Math.max(selfDia, Math.max(leftDia, rightDia));

// }



// public static void main(String[] args){
//     /* 
//          1
//       / \
//        2  3
//       / \ / \
//      4  5 6  7 
// */

// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
//  root.left.left = new Node(4);
//  root.left.right = new Node(5);
//  root.right.left = new Node(6);
//  root.right.right = new Node(7);
//     // System.out.println(height(root));
//     System.out.println(diameter(root));
// }










// // approach 2 for calc diameter


// static class Node{
//     int data;
//     Node left, right;

//     public Node (int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }
// static class Info{
//     int diam;
//     int ht;

//     public Info(int diam, int ht){
//         this.diam = diam;
//         this.ht = ht;
//     }
// }

// public static Info diameter(Node root){
//     if(root == null){
//         return new Info(0,0);
//     }

//     Info leftInfo = diameter(root.left);
//     Info rightInfo = diameter(root.right);

//     int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht+1);
//     int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;


//     return new Info(diam, ht);
// }


// public static void main(String[] args){
//     /* 
//          1
//       / \
//        2  3
//       / \ / \
//      4  5 6  7 
// */

// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
//  root.left.left = new Node(4);
//  root.left.right = new Node(5);
//  root.right.left = new Node(6);
//  root.right.right = new Node(7);
//     // System.out.println(height(root));
//     System.out.println(diameter(root).diam);
// }



//   // SUBTREE

// static class Node{
//     int data;
//     Node left, right;

//     public Node (int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }

// public static boolean isIdentical(Node node, Node subRoot){
//      if(node == null && subRoot == null){
//           return true;
//      }else if(node == null || subRoot == null || node.data != subRoot.data){
//           return false;
//      }

//      if(!isIdentical(node.left, subRoot.left)){
//           return false;
//      }
//      if(!isIdentical(node.right, subRoot.right)){
//           return false;
//      }
//      return true;

// }
// public static boolean isSubtree(Node root, Node subRoot){
//      if(root == null){
//           return false;
//      }

//      if(root.data == subRoot.data){
//           if(isIdentical(root, subRoot)){
//                return true;
//           }
//      }
//      return  isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
// }
// public static void main(String[] args){
//     /* 
//          1
//         / \
//        2  3
//       / \ / \
//      4  5 6  7 
// */

// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
//  root.left.left = new Node(4);
//  root.left.right = new Node(5);
//  root.right.left = new Node(6);
//  root.right.right = new Node(7);

// /*
//                 2
//                / \
//               4   5
//  */

// Node subRoot = new Node(2);
// subRoot.left = new Node(4);
// subRoot.right = new Node(5);

// System.out.println(isSubtree(root, subRoot));
// }





// TOPVIEW:

static class Node{
     int data;
     Node left, right;

     public Node(int data){
          this.data = data;
          this.left = left;
          this.right = right;
     }
}

static class Info{
     Node node;
     int hd;

     public Info(Node node, int hd){
          this.node = node;
          this.hd = hd;
     }
}
public static void topView(Node root){
     // level order
     Queue<Info> q = new LinkedList<>();
     HashMap<Integer, Node> map = new HashMap<>();

     int min = 0, max = 0;
     q.add(new Info(root,0));
     q.add(null);


     while(!q.isEmpty()){
          Info curr = q.remove();
          if(curr == null){
               if(q.isEmpty()){
                    break;
               }else{
                    q.add(null);
               }
          }else{
               
          if(!map.containsKey(curr.hd)){
               map.put(curr.hd, curr.node);
          }
          if(curr.node.left != null){
               q.add(new Info(curr.node.left, curr.hd-1));
               min =Math.min(min, curr.hd-1);
          }
          if(curr.node.right != null){
               q.add(new Info(curr.node.right, curr.hd+1));
               max = Math.max(max, curr.hd+1);
          }

          }
     }
     for(int i=min; i<=max; i++){
          System.out.print(map.get(i).data+" ");
     }
     System.out.println();
}




    
public static boolean getPath(Node root, int n, ArrayList<Node> path ){
     if(root == null){
         return false;
     }
     path.add(root);
 
     if(root.data == n){
         return true;
     }
 
     boolean foundLeft = getPath(root.left, n , path);
     boolean foundRight = getPath(root.right, n , path);
 
     if(foundLeft || foundRight){
         return true;
     }
 
     path.remove(path.size() - 1);
     return false;
 }
 
 public static Node lca(Node root, int n1, int n2){
     ArrayList<Node> path1 = new ArrayList<>();
     ArrayList<Node> path2 = new ArrayList<>();
 
     getPath(root, n1, path1);
     getPath(root, n2, path2);
 
     // last common ancestor
     int i = 0;
     for(; i<path1.size() && i<path2.size(); i++){
         if(path1.get(i) != path2.get(i)){
             break;
         }
     }
 
     // last equal node -> i-1th
     Node lca = path1.get(i-1);
     return lca;
 }
 
 
public static void main(String[] args){
     /* 
          1
         / \
        2  3
       / \ / \
      4  5 6  7 
 */
 
 Node root = new Node(1);
 root.left = new Node(2);
 root.right = new Node(3);
  root.left.left = new Node(4);
  root.left.right = new Node(5);
  root.right.left = new Node(6);
  root.right.right = new Node(7);
     // topView(root);

     int n1 = 4, n2 = 5;
     System.out.println(lca(root, n1, n2).data);


}
 









}
