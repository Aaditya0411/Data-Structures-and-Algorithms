

public class ConvertBSTtoBalancedBST {

    static class Node{
        int data ;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data ;
            this.left = this.right =null;
        }
    
    }

    public static void main(String[] args) {
        
//             8  
//           /   \
//          6     10
//         /        \
//        5          11
//       /             \
//      3               12

    Node root = new Node(8);

    // root --> left

    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);

    //root --> right

    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right =new Node(12);

    }
    
}