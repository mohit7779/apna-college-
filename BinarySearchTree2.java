import java.util.ArrayList;

public class BinarySearchTree2 {
    




//QS:size of largest bst


// static class Node {
//     int data;
//     Node left,right;

//     public Node(int data) {
//         this.data = data;
//         this.left = left;
//         this.right = right;
//     }
// }

// static class info{
//     boolean isBST;
//     int size;
//     int min;
//     int max;

//     public info(boolean isBST,int size,int min,int max) {
//         this.isBST = isBST;
//         this.size = size;
//         this.min = min;
//         this.max = max;
//     } 
// }
// public static int maxBST = 0;
// public static info largestBST(Node root){
//     if(root == null){
//         return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//     }

//     info leftInfo = largestBST(root.left);
//     info rightInfo = largestBST(root.right);
    
//     int size = leftInfo.size + rightInfo.size + 1;
//     int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//     int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//     if(root.data <= leftInfo.max || root.data >= rightInfo.min){
//         return new info(false,size,min,max);
//     }

//     if(leftInfo.isBST && rightInfo.isBST){
//         maxBST = Math.max(maxBST, size);
//         return new info(true,size,min,max);

// }
// return new info(false,size,min,max);

// }

// public static void main(String[] args){

//                 /*      50
//                  *     /  \
//                  *    30   60
//                  *   / \   / \ 
//                  *  5   20 45 70
//                  *            / \ 
//                  *           65  80
//                  */

//                  Node root = new Node(50);
//                  root.left = new Node(30);
//                  root.left.left = new Node(5);
//                  root.left.right = new Node(20);

//                  root.right = new Node(60);
//                  root.right.left = new Node(45);
//                  root.right.right = new Node(70);
//                  root.right.right.left = new Node(65);
//                  root.right.right.right = new Node(80);


//                  /*             60
//                   *            /  \
//                               45   70
//                                    / \
//                                   65 80
//                                   expected tree = 5

//                   */

//                   info Info = largestBST(root);
//                   System.out.println("largest BST size = " +maxBST);
// }



static class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public static void getInorder(Node root, ArrayList<Integer> arr){
    if(root == null){
        return ;
    }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
}
public static Node createBST(ArrayList<Integer> arr,int st,int end){
    if(st > end){
        return null;
    }

    int mid = (st+end)/2;
    Node root = new Node(arr.get(mid));
    root.left = createBST(arr,st,mid-1);
    root.right  = createBST(arr,mid+1,end);
    return root;
}

public static Node mergeBSTs(Node root1, Node root2){
    // step1
    ArrayList<Integer> arr1 = new ArrayList<>();
    getInorder(root1,arr1);

    //step2
    ArrayList<Integer> arr2 = new ArrayList<>();
    getInorder(root2,arr2);

    // merge
    int i = 0, j=0;
    ArrayList<Integer> finalArr = new ArrayList<>();
    while(i<arr1.size() && j<arr2.size()){
        if(arr1.get(i) <= arr2.get(j)){
            finalArr.add(arr1.get(i));
            i++;
        }else{
            finalArr.add(arr2.get(j));
            j++;
        }
    }

    while(i<arr1.size()){
        finalArr.add(arr1.get(i));
        i++;
    }

    while(j<arr2.size()){
        finalArr.add(arr2.get(j));
        j++;
    }

    // sorted AL -> balanced BST
    return createBST(finalArr,0,finalArr.size()-1);
}
public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
public static void main(String[] args) {
                /*   2
                 *  / \
                 * 1   4
                 */
                //bst1


                Node root1 = new Node(2);
                root1.left = new Node(1);
                root1.right = new Node(4);

                /*          9
                 *         / \
                 *        3  12
                 */ //BST2

                 Node root2 = new Node(9);
                 root2.left = new Node(3);
                 root2.right = new Node(12);


                 /*         3
                  *       /   \
                         1      9
                          \    / \
                           2  4   12

                           final answer : BST
                  */

                  Node root =  mergeBSTs(root1, root2);
                  preorder(root);


}











}
