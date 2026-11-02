public class SortedArraytoBalancedBST {
    
    public static class Node {
        int data ;
        Node left;
        Node right;

        public Node(int data){
            this.data = data ;
            this.left = this.right = null ;
        }
    }

    public static Node buildTree(int arr[] , int start , int end){
        if(start > end){
            return  null;
        }

        int mid = start + (end - start)/2 ; 

        //create root;

        Node root = new Node(arr[mid]);

        //left , right root ;

        root.left =buildTree(arr, start, mid - 1);
        root.right = buildTree(arr, mid +1 , end);


        return root;
    }


    public static void preorder(Node root){

         if (root == null) {
            return;
        }

        System.out.print(root.data + " " );
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        Node root = buildTree(arr , 0 , arr.length-1);
        preorder(root);
    }
}
