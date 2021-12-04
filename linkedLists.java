package MyProject1.src.dataStructAlgo;
//@SuppressWarnings("unused")
public class linkedLists {
    public static void main(String[] args){
        Node head = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        System.out.println(head.data);
        System.out.println(countNodes(head));

        
    }

    static int countNodes(Node head){
        //assuming that head !=null
        int count =1;
        Node current = head;
        while (current.next !=null){
            current = current.next;
            count += 1;
        }
        return count;
    }
    
}

class Node{
    int data;
    Node next;
    //for doubly linked lists add a Node prev
    //Node prev;
    Node(int data){
        this.data = data;

    }
    
}
