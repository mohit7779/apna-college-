import java.util.ArrayList;
public class BinarySearchTree {
    


// static class Node{
//     int data;
//     Node left, right;

//     Node (int data){
//         this.data = data;

//     }
// }
// public static Node insert(Node root, int val){
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         // left subtree
//         root.left = insert(root.left, val);
//     }else{
//         // right subtree
//         root.right = insert(root.right, val);
//     }
//     return root;
// }

// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.print(root.data+" ");
//     inorder(root.right);
// }

// public static void main(String[] args){
//     int values[] = {5,1,3,4,2,7};
//     Node root = null;

//     for(int i=0; i<values.length; i++){
//         root = insert(root, values[i]);
//     }
//     inorder(root);
//     System.out.println();

// }






// search in binary search tree:   O(H)

// static class Node{
//     int data;
//     Node left , right;

//     public Node(int data){
//         this.data = data;
//     }
// }

// public static Node insert(Node root, int val){
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         // left subtree
//         root.left = insert(root.left, val);
//     }else{
//         // right subtree
//         root.right = insert(root.right, val);
//     }
//     return root;
// }

// public static boolean search(Node root, int key){
//     if(root == null){
//         return false;
//     }
//     if(root.data == key){
//         return true;
//     }

//     if(root.data > key){
//         return search(root.left, key);
//     }else{
//         return search(root.right, key);
//     }
// }

// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.print(root.data+" ");
//     inorder(root.right);
// }

// public static void main(String[] args) {
//     int values[] = {5,1,3,4,2,7};
//      Node root = null;

//     for(int i=0; i<values.length; i++) {
//         root = insert(root, values[i]);
//     }
//     inorder(root);
//     System.out.println();

//     if(search(root, 12)){
//         System.out.println("found");
//     }else{
//         System.out.println("not found");
//     }

// }





// delete node from binary search tree

// static class Node{
//     int data;
//     Node left , right;

//     public Node(int data){
//         this.data = data;
//     }
// }

// public static Node insert(Node root, int val){
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         // left subtree
//         root.left = insert(root.left, val);
//     }else{
//         // right subtree
//         root.right = insert(root.right, val);
//     }
//     return root;
// }
// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.print(root.data+" ");
//     inorder(root.right);
// }
 
// public static void printInRange(Node root,int k1,int k2){
//     if(root == null){
//         return;
//     }
//     if(root.data >= k1 && root.data <= k2){
//         printInRange(root.left,k1,k2);
//         System.out.print(root.data+" ");
//         printInRange(root.right,k1,k2);
//     }
//     else if(root.data < k1){
//         printInRange(root.left,k1,k2);
//     }else{
//         printInRange(root.right,k1,k2);
//     }
// }
// public static void main(String[] args) {
//     int values[] = {8,5,3,6,10,11,14};
//      Node root = null;

//     for(int i=0; i<values.length; i++) {
//         root = insert(root, values[i]);
//     }
//     inorder(root);
//     System.out.println();

// printInRange(root,5,12);



// }







//  QS: ROOT2LEAF PATH

// static class Node{
//     int data;
//     Node left , right;

//     public Node(int data){
//         this.data = data;
//     }
// }

// public static Node insert(Node root, int val){
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         // left subtree
//         root.left = insert(root.left, val);
//     }else{
//         // right subtree
//         root.right = insert(root.right, val);
//     }
//     return root;
// }
// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.print(root.data+" ");
//     inorder(root.right);
// }

// public static void printPath(ArrayList<Integer> path){
//     for(int i=0; i<path.size(); i++){
//         System.out.print(path.get(i)+"->");
//     }
//     System.out.println("Null");
// }
// public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
//     if(root == null){
//         return;
//     }
//     path.add(root.data);
//     if(root.left == null && root.right == null){
//         printPath(path);
//     }
//     printRoot2Leaf(root.left,path);
//     printRoot2Leaf(root.right,path);

//     path.remove(path.size() - 1);

// }
// public static void main(String[] args) {
//     int values[] = {8,5,3,6,10,11,14};
//      Node root = null;

//     for(int i=0; i<values.length; i++) {
//         root = insert(root, values[i]);
//     }
//     inorder(root);
//     System.out.println();

// printRoot2Leaf(root,new ArrayList<>());
// }





// // QS: isValid bst (snapdeal , amazon , fb) 

// static class Node{
//     int data;
//     Node left , right;

//     public Node(int data){
//         this.data = data;
//     }
// }

// public static Node insert(Node root, int val){
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         // left subtree
//         root.left = insert(root.left, val);
//     }else{
//         // right subtree
//         root.right = insert(root.right, val);
//     }
//     return root;
// }
// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left);
//     System.out.print(root.data+" ");
//     inorder(root.right);
// }


// public static void printPath(ArrayList<Integer> path){
//     for(int i=0; i<path.size(); i++){
//         System.out.print(path.get(i)+"->");
//     }
//     System.out.println("Null");
// }


// public static boolean isValidBST(Node root,Node min, Node max) {
//     if(root == null){
//         return true;
//     }

//     if(min != null && root.data <= min.data){
//         return false;
//     }

//     else if(max!= null && root.data >= max.data){
//         return false;
//     }

//     return isValidBST(root.left, root, max)
//     && isValidBST(root.right, root, max);
// }

// public static void main(String[] args) {
//     int values[] = /*{8,5,3,6,10,11,14};*/  {1,1,1,2};
//      Node root = null;

//     for(int i=0; i<values.length; i++) {
//         root = insert(root, values[i]);
//     }
//     inorder(root);
//     System.out.println();

//    if(isValidBST(root, null, null)){
//     System.out.println("valid");
//    }else{
//     System.out.println("not valid");
//    }

// }






// QS: mirror of a binary tree


// static class Node{
//     int data;
//     Node left,right;

//     public Node(int data){
//         this.data = data;
//         this.left  = this.right = null;

//     }
// }


// public static Node createMirror(Node root){
//     if(root == null){
//         return null;
//     }

//     Node leftMirror = createMirror(root.left);
//     Node rightMirror = createMirror(root.right);

//     root.left = rightMirror;
//     root.right = leftMirror;
//     return root;
// }



// public static void preorder(Node root){
//     if(root == null){
//         return ;
//     }
//     System.out.print(root.data+" ");
//     preorder(root.left);
//     preorder(root.right);
// }

// public static void main(String[] args){
//     /*          8
//      *         / \
//      *        5   10 
//      *       / \    \ 
//      *      3   6   11
//      */

//      Node root = new Node(8);
//      root.left = new Node(5);
//      root.right = new Node(10);
//      root.left.left = new Node(3);
//      root.left.right = new Node(6);
//      root.right.right = new Node(11);

//      /*
//       *              8
//                     / \
//                    10  5
//                    /  / \
//                   11 6   3
//                   mirro bst

                  
//       */

//       root = createMirror(root);
//       preorder(root);
// }




//QS: sorted array to balanced bst

// static class Node {
//     int data;
//     Node left, right;

//     public Node (int data) {
//         this.data = data;
//         this.left = this.right = null;
//     }
// }

// public static void preorder(Node root){
//     if(root == null){
//         return;
//     }

//     System.out.print(root.data+" ");
//     preorder(root.left);
//     preorder(root.right);
// }

// public static Node createBST(int arr[], int st, int end){
//     if(st > end){
//         return null;
//     }
//     int mid = (st+end)/2;
//     Node root = new Node(arr[mid]);
//     root.left = createBST(arr, st, mid-1);
//     root.right = createBST(arr,mid+1,end);
//     return root;
// }
// public static void main(String[] args){
//     int arr[] = {3,5,6,8,10,11,12};

//     /*
//      *             8
//      *            / \
//      *           5   11
//      *          / \  / \ 
//      *         3   6 10 12
//      *  
//      *        expected bst  
//      */

//      Node root = createBST(arr,0,arr.length-1);
//      preorder(root);    
// }




static class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public static void preorder(Node root){
    if(root == null){
        return;
    }

    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}


public static void getInorder(Node root, ArrayList<Integer> inorder){
    if(root == null){
        return;
    }

    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
}

public static Node createBST(ArrayList<Integer> inorder, int st , int end){
    if(st > end){
        return null;
    }

    int mid = (st+end)/2;
    Node root = new Node(inorder.get(mid));
    root.left = createBST(inorder, st, mid-1);
    root.right = createBST(inorder, mid+1,end);
    return root;
}



public static Node balancedTree(Node root){
    //inorder sequence
    ArrayList<Integer> inorder = new ArrayList<>();
    getInorder(root, inorder);

    // sorted inorder -> balanced bst
    root = createBST(inorder, 0, inorder.size()-1);
    return root;
}
public static void main(String[] args){

    /*                8
     *              /   \
                   6     10
                  /        \
                5           11
               /             \
              3               12

              given bst
           
     */

     Node root = new Node(8);
     root.left = new Node(6);
     root.left.left = new Node(5);
     root.left.left.left = new Node(3);

     root.right  =  new Node(10);
     root.right.right = new Node(11);
     root.right.right.right = new Node(12);

     /*                 8
      *                / \
                      5   11
                     / \  / \ 
                    3   6 10 12
                    expected tree   
      */
      balancedTree(root);
      preorder(root);
}
















}
