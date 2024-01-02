public class doubleLL {
    
public class Node{
int data;
Node next;
Node prev;


public Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
}
}

public static Node head;
public static Node tail;
public static int size;


// ADD
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;


}

// print
public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"<->");
        temp = temp.next;
    }
    System.out.println("null");
}



//remove - remove last
public int removeFirst(){
    if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    if(size ==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    return val;

}


      // reverse
public void reverse(){
    Node curr = head;
    Node prev = null;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;

        prev = curr;
          curr = next;

        }
    head = prev;
}



//  insertion in the begining
//insertion b/w nodes,
//insertion towards the end

//insertion in the begining
// static class Node(){
//     int data;
//     Node next;
// } 
// static Node addToEmpty(Node last,int data){
//     if(last != null){
//         return last;
//         Node newNode = new Node();
//         newNode.data = data;
//         last = newNode;
//         newNode.next = last;
//         return last;
//     }
//     }
    
//     static addFront(Node last,int data){
//         if(last == null){
//             return addToEmpty(last,data);
//             Node newNode = newNode();
//             newNode.data = data;
//             newNode.next = last.next;
//             last.next = newNode;
//             return last;
//         }
//     }

//         static Node addEnd(Node last, int data){
//             if(last != null){
//                 return addToEmpty(last,data);
//                 Node newNode = newNode();
//                 newNode.data = data;
//                 newNode.next = last.next;
//                 last.next = newNode;
//                 last = newNode;
//                 return last;
//             }
//         }

//             static Node addAfter(Node last,int data,int item){
//                 if(last == null){
//                     return null;

//                     Node newNode,p;
//                     p = last.next;
//                     do{
//                         if(p.data == item){
//                             newNode.data = data;
//                             newNode.next = p.next;
//                             p.next = newNode;
//                             if(p == last){
//                                 last = newNode;
//                                 return last;
//                             }
//                             p = p.next;
//                         }while(p != last.next);
//                         System.out.println(item+ "the given Node is not present in the list");
//                         return last;
//                     }
//                 }
//             }
//                     // delete node
//                     static Node deleteNode(Node last,int key){
//                         if(last == null){
//                             return null;
//                             if(last.data == key && last.next == last){
//                                 last = null;
//                                 return last;
//                             }

//                             Node temp = last,d = new Node();
//                             if(last.data == key){
//                                 while(temp.next != last){
//                                     temp = temp.next;
//                                 }

//                                 temp.next = last.next;
//                                 last = temp.next;
//                             }
//                             while(temp.next != last && temp.next.data != key){
//                                 temp = temp.next;
//                             }
//                             if(temp.next.data == key){
//                                 d = temp.next;
//                                 temp.next = d.next;
//                             }
//                             return last;
//                         }
//                     }

//                         static void traverse(Node last){
//                             Node p;
//                             if(last == null){
//                                 System.out.println("list is empty.");
//                                 return;
//                             }
//                             p = last.next;
//                             do{
//                                 System.out.println(p.data +" ");
//                                 p = p.next;
//                             }
//                             while(p != last.next);
//                         }

//                     }
                
            


public static void main(String[] args){
    doubleLL dll = new doubleLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);

    // dll.print();
    // System.out.println(dll.size);

    // dll.removeFirst();                   //ye tha remoce first ke liye
    // dll.print();
    // System.out.println(dll.size);


// ye hai reverse ke liye
dll.print();
dll.reverse();
dll.print();


// // insertion ,deletion
// Node last = null;
// last = addToEmpty(last,6);
// last = addEnd(last,8);
// last = addFront(last,2);
// last = addAfter(last, 10,2);
// treverse(last);
// deleteNode(last,8);
// traverse(last);











}
}











































