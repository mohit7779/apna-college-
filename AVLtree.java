import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AVLtree {
    



// static class Node{
//     int data, height;
//     Node left, right;

//      Node(int data){
//         this.data = data;
//         height = 1;
//     }
// }

// public static Node root;

// public static int height(Node root){
//     if(root == null){
//         return 0;
//     }

//     return root.height;
// }

// // static int max(int a, int b){
// //     return (a > b)? a:b;
// // }


// //  right rotate subtree rotated with y

// public static Node rightRotate(Node y){
//     Node x = y.left;
//     Node T2 = x.right;

//     // perform rotation
//     x.right = y;
//     y.left = T2;

//     // update height
//     y.height = Math.max(height(y.left), height(y.right))+1;
//     x.height = Math.max(height(x.left), height(x.right))+1;

//     //return new root
//     return x;
// }
 


// // left rotate subtree rotated with x 
// public static Node leftRotate(Node x){
//     Node y = x.right;
//     Node T2 = x.left;

//     // perform rotation
//     y.left = x;
//     x.right = T2;

//     // update height
//     x.height = Math.max(height(x.left), height(x.right))+1;
//     y.height = Math.max(height(y.left), height(y.right))+1;

//     // return new root

//     return y;
// }

// // get balance factor of Node
// public static int getBalance(Node root){
//     if(root == null){
//         return 0;

//     }
//     return height(root.left)-height(root.right);

// }


// public static Node insert(Node root, int key){
//     if(root == null){
//         return new Node(key);

//        if(key < root.data)
//        root.left = insert(root.left, key);
//        else if(key > root.data)
//        root.right = insert(root.right, key);
//        else 
//        return root; // duplicate keys not allowed

//         // update root height
//         root.height = 1 + Math.max(height(root.left), height(root.right));

//         //get roots balanced factor
//         int bf = getBalance(root);

//         // left left case
//         if(bf > 1 && key < root.left.data)
//         return rightRotate(root);

//         //right right case
//         if(bf > -1 && key > root.right.data)
//         return leftRotate(root);

//         // left right case
//         if(bf > 1 && key > root.left.data){
//             root.left = leftRotate(root.left);
//             return rightRotate(root);
//         }

//         // rigth left case
//         if(bf < -1 && key < root.right.data){
//             root.right = rightRotate(root.right);
//             return leftRotate(root);
//         }
        

//     }
//     return root; // return if AVL is balanced

// }

// public static void preorder(Node root) {
//     if(root == null) {
//         return ;
//     }
//     System.out.print(root.data);
//     preorder(root.left);
//     preorder(root.right);
// }

// public static void main(String[] args){

//     root = insert(root, 10);
//     root = insert(root, 20);
//     root = insert(root, 30);
//     root = insert(root, 40);
//     root = insert(root, 50);
//     root = insert(root, 25);

// /*                          AVL TREE            
//  *                        
//  *                            30
//  *                           /  \
//  *                         20    40
//  *                        / \     \
//  *                       10  25    50
//  */

//         preorder(root);
// }






// QS: asssingment qiestion

// static class Node{
//     int val;
//     AVLtree.Node left;
//     AVLtree.Node right;
// };
//     static Node newNode(int item){
//         Node temp = new Node();
//         temp.val = item;
//         temp.left = temp.right = null;
//         return temp;
    
// }

// static int sum = 0;

// static int rangeSumBST(Node root, int low, int high){
//     if(root == null){
//         return 0;

//         Queue<Node> q = new LinkedList<Node>();
//         q.add(root);

//         while(q.isEmpty() == false){

//             Node curr = q.peek();
//             q.remove();
//             if(curr.val >= high){
//                 sum += curr.val;
//             }

//             if(curr.left != null && curr.val > low)q.add(curr.left);
//             if(curr.right != null && curr.val < high) q.add(curr.right);
//         }
//         return sum;
//     }
// }
//     static Node insert(Node node, int data){
//         if(node == null)
//         return newNode(data);

//         if(data <= node.val)
//         node.left = insert(node.left, data);
//         else 
//         node.right = insert(node.right, data);

//         return node;

// }
// public static void main(String[] args){

//     Node root = null;
//     root = insert(root,10);
//     root = insert(root,5);
//     insert(root,15);
//     insert(root,3);
//     insert(root,7);
//     insert(root,18);

//     int L  = 7 , R = 15;
//     System.out.println(rangeSumBST(root, L ,R));
// }






























}
