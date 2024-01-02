import java.util.*;
import java.util.LinkedList;
public class binaryTree {
    

// static class Node{
//     int data;
//     Node left;
//     Node right;

//     Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// static class BinaryTree{
//     static int idx = -1;
//     public static Node buildTree(int nodes[]){
//         idx++;
//         if(nodes[idx] == -1){
//             return null;
//         }

//         Node newNode = new Node(nodes[idx]);
//         newNode.left = buildTree(nodes);
//         newNode.right = buildTree(nodes);

//         return newNode;
        
//     }
// }



// // preorder
// public static void preorder(Node root){
//     if(root == null){
//         return;
//     }

//     System.out.println(root.data+" ");
//     preorder(root.left);
//     preorder(root.right);
// }




// //inorder
// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.println(root.data);
//     inorder(root.right);
// }



// //postorder
// public static void postorder(Node root){
//     if(root == null){
//         return ;
//     }
//     postorder(root.left);
//     postorder(root.right);
//     System.out.println(root.data+" ");
// }






// // levelorder
// public static void levelorder(Node root){
//     if(root == null){
//         return;
//     }

//     Queue<Node> q = new LinkedList<>();
//     q.add(root);
//     q.add(null);

//     while(!q.isEmpty()){
//         Node currNode = q.remove();
//         if(currNode == null){
//             System.out.println();
//             if(q.isEmpty()){
//                 break;
//             }else{
//                 q.add(null);
//             }
//         }else{
//             System.out.println(currNode.data+" ");
//             if(currNode.left != null){
//                 q.add(currNode.left);
//             }
//             if(currNode.right != null){
//                 q.add(currNode.right);
//             }
//         }
//     }

// }

// public static void main(String[] args){
//     int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//     BinaryTree tree = new BinaryTree();
//     Node root = tree.buildTree(nodes);
//     // System.out.println(root.data);
//     // tree.preorder(root);
//     // tree.inorder(root);
//     tree.levelorder(root);  //output
//                             // 1 
//                             // 2 3
//                             // 4 5 6

// }






// heights of the tree
static class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}

public static int height(Node root){
    if(root == null){
        return 0;

    }

    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh,rh)+1;
}


public static int count(Node root){
    if(root == null){
        return 0;
    }

    int leftcount = count(root.left);
    int rightcount = count(root.right);
    return leftcount + rightcount +1;
}


// sum  of nodes
public static int sum(Node root){
    if(root == null){
        return 0;
    }

    int leftsum = sum(root.left);
    int rightsum = sum(root.right);
    return leftsum + rightsum + root.data;
}

public static void main(String[] args){
    /*           1
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

    //  System.out.println(height(root));  //output 3
    // System.out.println(count(root));
    System.out.println(sum(root));
}

public Object root;




































}
