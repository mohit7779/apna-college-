import java.util.ArrayList;

import javax.print.attribute.standard.RequestingUserName;


public class binaryTree3 {
    
// Kth level of a tree


// static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }



// public static void kLevel(Node root, int level, int k){
//     if(root == null){
//         return;
//     }
//     if(level == k){
//         System.out.print(root.data+" ");
//         return;
//     }

//     kLevel(root.left, level+1,k);
//     kLevel(root.right, level+1,k);
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

//     int k = 3;
//     kLevel(root,1,k);
    


// }





// lowest common ancestor:   // ancestor=poorvach


// static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }
// public static boolean getPath(Node root, int n, ArrayList<Node> path ){
//     if(root == null){
//         return false;
//     }
//     path.add(root);

//     if(root.data == n){
//         return true;
//     }

//     boolean foundLeft = getPath(root.left, n , path);
//     boolean foundRight = getPath(root.right, n , path);

//     if(foundLeft || foundRight){
//         return true;
//     }

//     path.remove(path.size() - 1);
//     return false;
// }

// public static Node lca(Node root, int n1, int n2){   //O(n)
//     ArrayList<Node> path1 = new ArrayList<>();
//     ArrayList<Node> path2 = new ArrayList<>();

//     getPath(root, n1, path1);
//     getPath(root, n2, path2);

//     // last common ancestor
//     int i = 0;
//     for(; i<path1.size() && i<path2.size(); i++){
//         if(path1.get(i) != path2.get(i)){
//             break;
//         }
//     }

//     // last equal node -> i-1th
//     Node lca = path1.get(i-1);
//     return lca;
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

//     int n1 = 4, n2 = 5;
//     System.out.println(lca(root, n1, n2).data);


// }


// lowest common ancestor 2:   // ancestor=poorvach


//  static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }

// }


// public static Node lca2(Node root, int n1, int n2){

//     if( root == null || root.data == n1 || root.data == n2){
//         return root;
//     }

//     Node leftLca = lca2(root.left, n1, n2);
//     Node rightLca = lca2(root.right, n1, n2);

//     // left LCA = val, right LCA = null

//     if(rightLca == null){
//         return leftLca;
//     }
//     if(leftLca == null){
//         return rightLca;
//     }

//     return root;
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


//  int n1 = 2, n2 = 6;
//  System.out.println(lca2(root, n1, n2).data);
// }




// min distance between nodes




//  static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;

//     }
// }

// public static Node lca3(Node root, int n1 , int n2){
//     if(root == null || root.data == n1 || root.data == n2){
//         return root;
//     }

//     Node leftLca = lca3(root.left, n1, n2);
//     Node rightLca = lca3(root.right, n1, n2);

//     if(rightLca == null){
//         return leftLca ;
//     }

//     if(leftLca == null){
//         return rightLca;
//     }
//     return root;

// }
// public static int lcaDis(Node root ,int n){
//     if(root == null){
//         return -1;
//     }

//     if(root.data == n){
//         return 0;
//     }

//     int leftDis = lcaDis(root.left,n);
//     int rightDis = lcaDis(root.right,n);

//     if(leftDis == -1 && rightDis == -1){
//         return -1;
//     }else if(leftDis == -1){
//         return rightDis+1;
//     }else{
//         return leftDis+1;
//     }
// }
// public static int minDistance(Node root, int n1, int n2){
//     Node lca = lca3(root, n1, n2);
//     int dist1 = lcaDis(lca,n1);
//     int dist2 = lcaDis(lca,n2);

//     return dist1 + dist2;
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


//  int n1 = 4, n2 = 6;
//  System.out.println(minDistance(root, n1, n2));

// }


// QS: Kth ancestor of Node


//  static class Node{
//     int data;
//     Node left, right;
//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }

// }


// public static int kAncestor(Node root, int n, int k){
//     if(root == null){
//         return -1;
//     }
//     if(root.data == n){
//         return 0;
//     }

//     int leftDist = kAncestor(root.left, n, k);
//     int rightDist = kAncestor(root.right, n, k);

//     if(leftDist == -1 && rightDist == -1){
//         return -1;
//     }

//     int max = Math.max(leftDist, rightDist);
//     if(max+1 == k){
//         System.out.println(root.data);
//     }
//     return max+1;
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
// root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.right = new Node(6);
// root.right.left = new Node(7);

// int n1 = 3, n2 = 1;
// kAncestor(root, n1, n2);



// }


// static class Node{
//     int data;
//     Node left, right;

//     public Node(int data){
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }

// public static int transform(Node root){
//     if(root == null){
//         return 0;
//     }
    

//     int leftChild = transform(root.left);
//     int rightChild = transform(root.right);

//     int data = root.data;

//     int newLeft = root.left == null ? 0 : root.left.data;
//     int newRight = root.right == null ? 0 : root.right.data;

//     root.data = newLeft + leftChild + newRight + rightChild;
//     return data;
// }

// public static void preorder(Node root){
//     if(root == null){
//         return;
//     }

//     System.out.print(root.data+" ");
//     preorder(root.left);
//     preorder(root.right);
// }


// public static void main(String[] args){
//     /* 
//          1
//         / \
//        2  3
//       / \ / \
//      4  5 6  7 


//         expected Node tree


//             27
//            /  \ 
//           9    13
//          / \  / \ 
//          0 0  0  0

// */


// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.left.right = new Node(5);
// root.right.right = new Node(6);
// root.right.left = new Node(7);

// transform(root);
// preorder(root);


// }





// QS: chech if a binary tree is univalued

// static class Node{
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }

// public static boolean isUniValued(Node root) {
//     if(root == null){
//         return true;
//     }

//     if(root.left != null && root.data != root.left.data)
//     return false;

//     if(root.right != null && root.data != root.right.data)
//     return false;

//     return isUniValued(root.left) && isUniValued(root.right);
// }


// public  static void main(String[] args){
//     Node root = new Node(2);
//     root.left = new Node(2);
//     root.left.left = new Node(5);
//     root.left.right = new Node(2);
//     root.right = new Node(2);

//     if(isUniValued(root)){
//         System.out.println("yes");
//     }else{
//         System.out.println("no");
//     }
// }





// QS: invert binary tree (mirror of tree)
// class Node{
//     int data;
//     Node left, right;

//     public Node(int item){
//         data = item;
//         left = right = null;
//     }
// }

// class solution{
//     Node root;

//     void mirror(){
//         root = mirror(root);
//     }

//         Node mirror(Node node){
//             if(node == null)
//             return node;

//             /*do the subtrees */
//             Node left = mirror(node.left);
//             Node right = mirror(node.right);

//             /*swap the left and right pointer */
//             node.left = right;
//             node.right = left;

//             return node;
        
//         }
        

//         void inOrder(){
//             inOrder(root);
//         }


//         void inOrder(Node node){
//             if(node == null)
//             return;

//             inOrder(node.left);
//             System.out.println(node.data+" ");
//             inOrder(node.right);
        
// }
// }


// public static void main(String[] args) {

//     BinaryTree tree = new BinaryTree();
//     tree.root = new Node(1);
//     tree.root.left = new Node(2);
//     tree.root.right = new Node(3);
//     tree.root.left.left = new Node(4);
//     tree.root.left.right = new Node(5);

//     System.out.println("inOrder traversal of input treee id :");
//     tree.inOrder();
//     System.out.println("");
//     tree.mirror();
//     System.out.println("inOrder traversal od a binary tree is :");
//     tree.inOrder();
// }




// QS: solution 3
static class Node{
    int data;
    Node left, right;

    static Node newNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return(newNode);
    }

    static Node deleteLeaves(Node root, int x){
        if(root == null)
        return null;

        root.left = deleteLeaves(root.left,x);
        root.right = deleteLeaves(root.right,x);

        if(root.data == x && root.left == null && root.right == null){
            return  null;
        }


        return root;
    }

    static void inorder(Node root){
        if(root == null)
        return;
        inorder(root.left);

        System.out.print(root.data+" ");
        inorder(root.right);
    
}
public static void main(String[] args){
    Node root = newNode(10);
    root.left = newNode(3);
    root.right = newNode(10);
    root.left.left = newNode(3);
    root.left.right = newNode(1);
    root.right.right = newNode(3);
    root.right.right.left = newNode(3);
    root.right.right.right = newNode(3);
    deleteLeaves(root,3);
    System.out.println("inorder traversal after deletion :");
    inorder(root);
}
}












}
