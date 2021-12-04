package MyProject1.src.dataStructAlgo;
//binary tree have 2 children
/*
class Node2{
    int data;
    Node child1;
    Node child2;
    Node child3;

    void Node(int data){
        this.data = data;
    }

}*/
//tree no 2 references that link to a Node (point to same node)
//trees are from root Node can go to any other node
//root no parent

public class trees {
    public static void main(String[] args){
        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3; node2.right = node4;
        node3.left = node5; node3.right = node6;


        System.out.println("Sum of all values of this tree is (should print 20):");
        System.out.println(find_sum(node2));

    }

    static int find_sum(Node root){
        if(root ==null){
            return 0;
        }
        else{
            return root.data + find_sum(root.left) + find_sum(root.right);

        }
    }

    
    
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
